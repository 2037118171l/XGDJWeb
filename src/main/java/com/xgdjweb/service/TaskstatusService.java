package com.xgdjweb.service;

import com.xgdjweb.bean.Taskstatus;
import com.xgdjweb.bean.TaskstatusExample;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.TaskMapper;
import com.xgdjweb.dao.TaskstatusMapper;
import com.xgdjweb.dao.UserMapper;
import com.xgdjweb.dao.VolunteerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskstatusService {

    @Autowired
    TaskstatusMapper taskstatusMapper;

    @Autowired
    TaskMapper taskMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    VolunteerMapper volunteerMapper;

    public List<Taskstatus> findTaskstatusByNumber(String number){
        TaskstatusExample example = new TaskstatusExample();
        TaskstatusExample.Criteria criteria = example.createCriteria();
        criteria.andNumberEqualTo(number);
        List<Taskstatus> taskstatuses = taskstatusMapper.selectByExample(example);
        return taskstatuses;
    }

    public ResponseWrapper addTaskstatus(Taskstatus taskstatus){
        if (taskstatus ==null){
            return ResponseWrapper.markError();
        }else {
            int i = taskstatusMapper.insertSelective(taskstatus);
            if(i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public ResponseWrapper updateTaskstatus(Taskstatus taskstatus){
        if (taskstatus ==null){
            return ResponseWrapper.markError();
        }else {
            int i = taskstatusMapper.updateByPrimaryKeySelective(taskstatus);
            if(i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public ResponseWrapper delTaskstatus(Integer id){
        if (id == null){
            return ResponseWrapper.markError();
        }else {
            int i = taskstatusMapper.deleteByPrimaryKey(id);
            if (i==1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
}
