package com.xgdjweb.dao;

import com.xgdjweb.bean.Advertisement;
import com.xgdjweb.bean.AdvertisementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdvertisementMapper {
    int countByExample(AdvertisementExample example);

    int deleteByExample(AdvertisementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advertisement record);

    int insertSelective(Advertisement record);

    List<Advertisement> selectByExample(AdvertisementExample example);

    Advertisement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    int updateByExample(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    int updateByPrimaryKeySelective(Advertisement record);

    int updateByPrimaryKey(Advertisement record);

    List<Advertisement> getAdvertisementBySearch(String number, String category, String displayorder, String title);
<<<<<<< HEAD

    List<Advertisement> getAdvePicByCategory(String category);
=======
>>>>>>> b2f9e720d20818178f86064ce3b8e29766351f2e
}