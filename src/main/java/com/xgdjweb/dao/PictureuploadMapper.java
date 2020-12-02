package com.xgdjweb.dao;

import com.xgdjweb.bean.Pictureupload;
import com.xgdjweb.bean.PictureuploadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PictureuploadMapper {
    int countByExample(PictureuploadExample example);

    int deleteByExample(PictureuploadExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Pictureupload record);

    int insertSelective(Pictureupload record);

    List<Pictureupload> selectByExample(PictureuploadExample example);

    Pictureupload selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Pictureupload record, @Param("example") PictureuploadExample example);

    int updateByExample(@Param("record") Pictureupload record, @Param("example") PictureuploadExample example);

    int updateByPrimaryKeySelective(Pictureupload record);

    int updateByPrimaryKey(Pictureupload record);

    @Select("Select * from pictureupload")
    List<Pictureupload> findPic();
}