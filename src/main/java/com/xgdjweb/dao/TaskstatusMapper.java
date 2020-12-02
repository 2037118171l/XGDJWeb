package com.xgdjweb.dao;

import com.xgdjweb.bean.Taskstatus;
import com.xgdjweb.bean.TaskstatusExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository

public interface TaskstatusMapper {
    int countByExample(TaskstatusExample example);

    int deleteByExample(TaskstatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Taskstatus record);

    int insertSelective(Taskstatus record);

    List<Taskstatus> selectByExample(TaskstatusExample example);

    Taskstatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Taskstatus record, @Param("example") TaskstatusExample example);

    int updateByExample(@Param("record") Taskstatus record, @Param("example") TaskstatusExample example);

    int updateByPrimaryKeySelective(Taskstatus record);

    int updateByPrimaryKey(Taskstatus record);

    List<Taskstatus> findTaskstatus(String snumber,String username,String category);
}