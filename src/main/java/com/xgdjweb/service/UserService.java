package com.xgdjweb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.Task;
import com.xgdjweb.bean.User;
import com.xgdjweb.bean.UserExample;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.TaskMapper;
import com.xgdjweb.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    TaskMapper taskMapper;

    public List<User> getUserByUsername(String Username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(Username);
        List<User> users = userMapper.selectByExample(example);
        return users;
    }

    public List<User> findUserBySrole(String Srole){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andSroleEqualTo(Srole);
        List<User> users = userMapper.selectByExample(example);
        return users;
    }

    /***
     * @Description:通过sid查询一条用户信息
     * @param sid
     * @return
     */
    public ResponseWrapper findUserBySid(Integer sid){
        if (sid == null){
            return ResponseWrapper.markError();
        }else {
            User user = userMapper.selectByPrimaryKey(sid);
            return ResponseWrapper.markSuccess(user);
        }
    }

    public ResponseWrapper updateUser(User user) {
        if (user ==null){
            return ResponseWrapper.markError();
        }else {
            int i = userMapper.updateByPrimaryKeySelective(user);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public  ResponseWrapper addUser(User user) {
        if (user ==null){
            return ResponseWrapper.markError();
        }else {
            int i = userMapper.insertSelective(user);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public ResponseWrapper deleteUser(String sids){
        if (sids.equals("")){
            return ResponseWrapper.markParamError();
        }else {
            //批量删除
            if (sids.contains("-")) {
                List<Integer> del_sids = new ArrayList<>();
                String[] str_sids = sids.split("-");
                //组装id的集合,遍历数组
                for (String string : str_sids) {
                    del_sids.add(Integer.parseInt(string));
                }
                //批量删除的方法
                UserExample example = new UserExample();
                UserExample.Criteria criteria = example.createCriteria();
                criteria.andSidIn(del_sids);
                int e = userMapper.deleteByExample(example);
                if (e > 0) {
                    return ResponseWrapper.markSuccess(e);
                } else {
                    return ResponseWrapper.markError();
                }
            } else {
                Integer id = Integer.parseInt(sids);
                int e = userMapper.deleteByPrimaryKey(id);
                if (e == 1) {
                    return ResponseWrapper.markSuccess(e);
                } else {
                    return ResponseWrapper.markError();
                }
            }
        }
    }

    /**
     * @Description：学生管理界面的多重查询
     * @param snumber
     * @param userclass
     * @param srole
     * @param phone
     * @param pageNum
     * @return
     */
    public ResponseWrapper getUserBySearch(String snumber, String userclass, String srole, String phone, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.getUserBySearch(snumber,userclass,srole,phone);
        PageInfo user = new PageInfo(users,10);
        return ResponseWrapper.markSuccess(user);
    }
    public ResponseWrapper findUserBySearch(String snumber, String username, String college, String userclass, String srloe, String grade, String phone, String sex, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.findUserBySearch(snumber,username,college,userclass,srloe,grade,phone,sex);
        PageInfo user = new PageInfo(users,10);
        return ResponseWrapper.markSuccess(user);
    }

    /**
     * @Description 移动端发送给用户的任务
     * @param sid
     * @param pageNum
     * @param pageSize
     * @return
     */
    public ResponseWrapper publishUser(Integer sid, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Task> tasks = taskMapper.publishUser(sid);
        PageInfo task = new PageInfo(tasks,10);
        return ResponseWrapper.markSuccess(tasks);
    }
}
