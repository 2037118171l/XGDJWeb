package com.xgdjweb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.*;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.TaskstatusMapper;
import com.xgdjweb.bean.Volunteer;
import com.xgdjweb.bean.VolunteerExample;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.VolunteerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VolunteerService {
    @Autowired
    VolunteerMapper volunteerMapper;
    @Autowired
    TaskstatusMapper taskstatusMapper;

    @Autowired
    TaskstatusService taskstatusService;
    /**
     * @Description 新增志愿活动
     * @return
     */
    public ResponseWrapper addVolunteer(String number,
                                        String volunteername,
                                        Date vtime,
                                        Integer neednum,
                                        Integer applicantsnum,
                                        String contacts,
                                        String cphone,
                                        String publisher,
                                        String college,
                                        Date releasetime,
                                        Date endtime,
                                        Date assemblytime,
                                        String collectionplace,
                                        String content){
        Volunteer volunteer = new Volunteer();
        volunteer.setNumber(number);
        volunteer.setVolunteername(volunteername);
        volunteer.setVtime(vtime);
        volunteer.setNeednum(neednum);
        volunteer.setApplicantsnum(applicantsnum);
        volunteer.setContacts(contacts);
        volunteer.setCphone(cphone);
        volunteer.setPublisher(publisher);
        volunteer.setCollege(college);
        volunteer.setReleasetime(releasetime);
        volunteer.setEndtime(endtime);
        volunteer.setAssemblytime(assemblytime);
        volunteer.setCollectionplace(collectionplace);
        volunteer.setContent(content);
        int i = volunteerMapper.insertSelective(volunteer);
        if (i == 1 ){
            return ResponseWrapper.markSuccess(i);
        }else{
            return ResponseWrapper.markError();
        }

    }
    public ResponseWrapper signUp(Integer vid,
                                  Date starttime,
                                  Date completetime,
                                  Date examinetime,
                                  String putton,
                                  String examine,
                                  String state,
                                  Integer sid){
        Volunteer volunteer1 = volunteerMapper.selectByPrimaryKey(vid);
        Taskstatus taskstatus = new Taskstatus();
        taskstatus.setStarttime(starttime);
        taskstatus.setCompletetime(completetime);
        taskstatus.setExaminetime(examinetime);
        taskstatus.setPutton(putton);
        taskstatus.setExamine(examine);
        taskstatus.setCategory("志愿任务");
        taskstatus.setState(state);
        taskstatus.setNumber(volunteer1.getNumber());
        taskstatus.setSid(sid);
        int j = taskstatusMapper.insertSelective(taskstatus);
        if (j == 1){
            return ResponseWrapper.markSuccess(j);
        }else {
            return ResponseWrapper.markError();
        }
    }

    /**
     * @Description: 修改志愿活动
     * @return
     */
    public ResponseWrapper updateVolunteer(Integer vid,
                                           String number,
                                           String volunteername,
                                           Date vtime,
                                           Integer neednum,
                                           Integer applicantsnum,
                                           String contacts,
                                           String cphone,
                                           String publisher,
                                           String college,
                                           Date releasetime,
                                           Date endtime,
                                           Date assemblytime,
                                           String collectionplace,
                                           String content,
                                           Date starttime,
                                           Date completetime,
                                           Date examinetime,
                                           String putton,
                                           String examine,
                                           String state,
                                           Integer sid){
        Volunteer volunteer1 = volunteerMapper.selectByPrimaryKey(vid);
        Volunteer volunteer = new Volunteer();
        volunteer.setVid(vid);
        volunteer.setNumber(number);
        volunteer.setVolunteername(volunteername);
        volunteer.setVtime(vtime);
        volunteer.setNeednum(neednum);
        volunteer.setApplicantsnum(applicantsnum);
        volunteer.setContacts(contacts);
        volunteer.setCphone(cphone);
        volunteer.setPublisher(publisher);
        volunteer.setCollege(college);
        volunteer.setReleasetime(releasetime);
        volunteer.setEndtime(endtime);
        volunteer.setAssemblytime(assemblytime);
        volunteer.setCollectionplace(collectionplace);
        volunteer.setContent(content);
        TaskstatusExample example = new TaskstatusExample();
        TaskstatusExample.Criteria criteria = example.createCriteria();
        criteria.andNumberEqualTo(volunteer1.getNumber());
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
        int i = volunteerMapper.updateByPrimaryKeySelective(volunteer);
        if (i == 1){
            return  ResponseWrapper.markSuccess(i);
        }else {
            return ResponseWrapper.markError();
        }
    }


    /**
     * @Description:批量删除和单个删除
     * @param vid
     * @return
     */
    public ResponseWrapper deteleVolunteer(Integer vid){
                Volunteer volunteers = volunteerMapper.selectByPrimaryKey(vid);
                TaskstatusExample example = new TaskstatusExample();
                TaskstatusExample.Criteria criteria = example.createCriteria();
                criteria.andNumberEqualTo(volunteers.getNumber());
                List<Taskstatus> taskstatuses = taskstatusMapper.selectByExample(example);
                for (int i = 0; i < taskstatuses.size(); i++) {
                    taskstatusService.delTaskstatus(taskstatuses.get(i).id);
                }
                int e = volunteerMapper.deleteByPrimaryKey(vid);
                if (e == 1) {
                    return ResponseWrapper.markSuccess(e);
                } else {
                    return ResponseWrapper.markError();
                }
            }

    /**
     * @Description: 志愿任务管理的多重查询
     * @param volunteername
     * @param contacts
     * @param college
     * @param vstate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public ResponseWrapper findBySearch(String volunteername, String contacts, String college, String vstate, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Volunteer> volunteers = volunteerMapper.findBySearch(volunteername,contacts,college,vstate);
        PageInfo volunteer = new PageInfo(volunteers,10);
        return ResponseWrapper.markSuccess(volunteer);
    }
    public ResponseWrapper findVoluByLike(String username, String snumber, String phone, String vstate, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Volunteer> volunteers = volunteerMapper.findVoluByLike(username,snumber,phone,vstate);
        PageInfo volunteer = new PageInfo(volunteers,10);
        return ResponseWrapper.markSuccess(volunteer);
    }

}
