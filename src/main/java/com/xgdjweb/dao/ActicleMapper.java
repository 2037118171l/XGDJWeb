package com.xgdjweb.dao;

import com.xgdjweb.bean.Acticle;
import com.xgdjweb.bean.ActicleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ActicleMapper {
    int countByExample(ActicleExample example);

    int deleteByExample(ActicleExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Acticle record);

    int insertSelective(Acticle record);

    List<Acticle> selectByExample(ActicleExample example);

    Acticle selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Acticle record, @Param("example") ActicleExample example);

    int updateByExample(@Param("record") Acticle record, @Param("example") ActicleExample example);

    int updateByPrimaryKeySelective(Acticle record);

    int updateByPrimaryKey(Acticle record);

    @Select("select aid, category, title, articletime, srole, url from acticle")
    List<Acticle> findActicle();
}