package com.xgdjweb.dao;

import com.xgdjweb.bean.Volunteer;
import com.xgdjweb.bean.VolunteerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VolunteerMapper {
    int countByExample(VolunteerExample example);

    int deleteByExample(VolunteerExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Volunteer record);

    int insertSelective(Volunteer record);

    List<Volunteer> selectByExample(VolunteerExample example);

    Volunteer selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Volunteer record, @Param("example") VolunteerExample example);

    int updateByExample(@Param("record") Volunteer record, @Param("example") VolunteerExample example);

    int updateByPrimaryKeySelective(Volunteer record);

    int updateByPrimaryKey(Volunteer record);

    List<Volunteer> findBySearch(String volunteername,String contacts,String college,String vstate);

    List<Volunteer> findVoluByLike(String username,String snumber,String phone,String vstate);
}