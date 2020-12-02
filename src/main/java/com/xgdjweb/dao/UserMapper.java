package com.xgdjweb.dao;

import com.xgdjweb.bean.User;
import com.xgdjweb.bean.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUserBySearch(@Param("snumber") String snumber,
                               @Param("userclass") String userclass,
                               @Param("srole") String srole,
                               @Param("phone") String phone);

    /**
     * @Description：学生审核界面的多重查询
     * @param snumber
     * @param username
     * @param college
     * @param userclass
     * @param srloe
     * @param geade
     * @param phone
     * @param sex
     * @return
     */
    List<User> findUserBySearch(@Param("snumber") String snumber,
                                @Param("username") String username,
                                @Param("college") String college,
                                @Param("userclass") String userclass,
                                @Param("srole") String srloe,
                                @Param("grade") String geade,
                                @Param("phone") String phone,
                                @Param("sex") String sex);
}