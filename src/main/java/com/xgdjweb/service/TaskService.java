package com.xgdjweb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.*;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.TaskMapper;
import com.xgdjweb.dao.TaskstatusMapper;
import com.xgdjweb.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {

    @Autowired
    TaskMapper taskMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    TaskstatusService taskstatusService;
    @Autowired
    TaskstatusMapper taskstatusMapper;

    /**
     * @Description 查询所有任务
     * @auther:lel
     * @date:2020/8/23 20:07
     * @return map
     */
    public Map<Object,Object> findAllTask(){
//        查询所有数据，存放到list
        List<Task> list = taskMapper.findAllTask();
//        创建一个map，将list存入map
        HashMap<Object,Object> map = new HashMap<>();
        map.put("list",list);
        return  map;
    }
    /**
     * @Description:新建任务
     * @auther:lel
     * @date:2020/8/23 20:10
     * @return 处理请求后的返回消息
     */
    public ResponseWrapper addTask(String tasktitle,
                                   String tasktype,
                                   String taskcontent,
                                   String isshow,
                                   String srole,
                                   Date releasetime,
                                   Date endtime,
                                   String publisher,
                                   String number,
                                   String closeperson,
                                   String resolver,
                                   Date starttime,
                                   Date completetime,
                                   Date examinetime,
                                   String putton,
                                   String examine,
                                   String state
                                   ){
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andSroleEqualTo(srole);
            List<User> users = userMapper.selectByExample(example);
            for (int i=0;i<users.size();i++){
                Taskstatus taskstatus =new Taskstatus();
                taskstatus.setStarttime(starttime);
                taskstatus.setCompletetime(completetime);
                taskstatus.setExaminetime(examinetime);
                taskstatus.setPutton(putton);
                taskstatus.setExamine(examine);
                taskstatus.setState(state);
                taskstatus.setNumber(number);
                taskstatus.setSid(users.get(i).sid);
                taskstatus.setCategory("学习任务");
                taskstatusService.addTaskstatus(taskstatus);
            }
            Task task = new Task();
            task.setTasktitle(tasktitle);
            task.setTasktype(tasktype);
            task.setTaskcontent(taskcontent);
            task.setIsshow(isshow);
            task.setSrole(srole);
            task.setReleasetime(releasetime);
            task.setEndtime(endtime);
            task.setPublisher(publisher);
            task.setNumber(number);
            task.setCloseperson(closeperson);
            task.setResolver(resolver);
            int i = taskMapper.insertSelective(task);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }

    }
    /**
     * @Description:修改任务
     * @auther：lel
     * @date：2020/08/23 20：15
     * @return：处理请求后的返回消息
     */
    public ResponseWrapper updateTask(Integer tid,
                                      String tasktitle,
                                      String tasktype,
                                      String taskcontent,
                                      String isshow,
                                      String srole,
                                      Date releasetime,
                                      Date endtime,
                                      String publisher,
                                      String number,
                                      String closeperson,
                                      String resolver,
                                      Date starttime,
                                      Date completetime,
                                      Date examinetime,
                                      String putton,
                                      String examine,
                                      String state){

        Task tasks = taskMapper.selectByPrimaryKey(tid);
        Task task = new Task();
        task.setTid(tid);
        task.setTasktitle(tasktitle);
        task.setTasktype(tasktype);
        task.setTaskcontent(taskcontent);
        task.setIsshow(isshow);
        task.setSrole(srole);
        task.setReleasetime(releasetime);
        task.setEndtime(endtime);
        task.setPublisher(publisher);
        task.setNumber(number);
        task.setCloseperson(closeperson);
        task.setResolver(resolver);
        TaskstatusExample example = new TaskstatusExample();
        TaskstatusExample.Criteria criteria = example.createCriteria();
        criteria.andNumberEqualTo(tasks.getNumber());
        List<Taskstatus> taskstatuses = taskstatusMapper.selectByExample(example);
        for (int i=0;i<taskstatuses.size();i++){
            Taskstatus taskstatus =new Taskstatus();
            taskstatus.setId(taskstatuses.get(i).id);
            System.out.println(taskstatuses.get(i).getId());
            taskstatus.setStarttime(starttime);
            taskstatus.setCompletetime(completetime);
            taskstatus.setExaminetime(examinetime);
            taskstatus.setPutton(putton);
            taskstatus.setExamine(examine);
            taskstatus.setState(state);
            taskstatus.setNumber(number);
            System.out.println(number+"---");
            taskstatus.setSid(taskstatuses.get(i).sid);
            taskstatusService.updateTaskstatus(taskstatus);
        }
            int i = taskMapper.updateByPrimaryKeySelective(task);
            if (i == 1){
                return  ResponseWrapper.markSuccess(i);
            }else {
                return  ResponseWrapper.markError();
            }

    }
    /**
     * @Description:删除任务
     * @Auther：lel
     * @Date:2020/08/23 20:19
     */
    public ResponseWrapper deleteTask(String tids){
        if (tids.equals("")){
        return ResponseWrapper.markParamError();
    }else {
        //批量删除
        if (tids.contains("-")) {
            List<Integer> del_tids = new ArrayList<>();
            String[] str_tids = tids.split("-");
            //组装id的集合,遍历数组
            for (String string : str_tids) {
                del_tids.add(Integer.parseInt(string));
            }
            //批量删除的方法
            TaskExample example = new TaskExample();
            TaskExample.Criteria criteria = example.createCriteria();
            criteria.andTidIn(del_tids);
            int e = taskMapper.deleteByExample(example);
            if (e > 0) {
                return ResponseWrapper.markSuccess(e);
            } else {
                return ResponseWrapper.markError();
            }
        } else {
            Integer id = Integer.parseInt(tids);
            TaskExample example1 = new TaskExample();
            TaskExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andTidEqualTo(id);
            List<Task> tasks = taskMapper.selectByExample(example1);
            TaskstatusExample example = new TaskstatusExample();
            TaskstatusExample.Criteria criteria = example.createCriteria();
            criteria.andNumberEqualTo(tasks.get(0).getNumber());
            List<Taskstatus> taskstatuses = taskstatusMapper.selectByExample(example);
            for (int i=0;i<taskstatuses.size();i++){
                taskstatusService.delTaskstatus(taskstatuses.get(i).id);
            }
            int e = taskMapper.deleteByPrimaryKey(id);
                if (e == 1) {
                return ResponseWrapper.markSuccess(e);
                } else {
                return ResponseWrapper.markError();
                }
            }
        }
    }

    /**
     * @Description 任务管理的多重查询
     * @param tasktitle 任务名称
     * @param publisher 发布人
     * @param pageNum
     * @return
     */
    public ResponseWrapper getTaskBySearch(String tasktitle, String srole,  String publisher ,Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.getTaskBySearch(tasktitle,srole,publisher);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(task);
    }
    /**
     * @Description:任务审查里面的多重查询
     * @param username
     * @param snumber
     * @param phone
     * @param pageNum
     * @return
     */
    public ResponseWrapper getTaskByLike(String username, String snumber, String phone, Integer tid, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.getTaskByLike(username,snumber,phone,tid);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(task);
    }

    /**
     * @Description: 通过id查找一条数据
     * @param tid
     * @return
     */
    public ResponseWrapper findTaskById(Integer tid){
        if (tid == null){
            return  ResponseWrapper.markError();
        }else {
            Task tasks =  taskMapper.selectByPrimaryKey(tid);
            return ResponseWrapper.markSuccess(tasks);
        }
    }
    public ResponseWrapper myClose(Integer id, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.myClose(id);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(task);
    }
    public ResponseWrapper myPublish(Integer id, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.myPublish(id);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(task);
    }
    public ResponseWrapper sentMe(Integer id, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.sentMe(id);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(task);
    }
    public ResponseWrapper myResolve(Integer id, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.myResolve(id);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(task);
    }
    public ResponseWrapper findTaskstatus(String snumber,String username,String category,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Taskstatus> taskstatuses = taskstatusMapper.findTaskstatus(snumber,username,category);
        PageInfo task = new PageInfo(taskstatuses,10);
        return ResponseWrapper.markSuccess(task);
    }
    public ResponseWrapper findTasksBySrole(Integer sid,String category,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.findTasksBySrole(sid,category);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(task);
    }
}

