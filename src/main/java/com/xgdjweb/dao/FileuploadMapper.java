package com.xgdjweb.dao;

import com.xgdjweb.bean.Fileupload;
import com.xgdjweb.bean.FileuploadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FileuploadMapper {
    int countByExample(FileuploadExample example);

    int deleteByExample(FileuploadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fileupload record);

    int insertSelective(Fileupload record);

    List<Fileupload> selectByExample(FileuploadExample example);

    Fileupload selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fileupload record, @Param("example") FileuploadExample example);

    int updateByExample(@Param("record") Fileupload record, @Param("example") FileuploadExample example);

    int updateByPrimaryKeySelective(Fileupload record);

    int updateByPrimaryKey(Fileupload record);

    @Select("Select * from fileupload")
    List<Fileupload> findAll();
}