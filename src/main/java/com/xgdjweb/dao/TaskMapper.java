package com.xgdjweb.dao;

import com.xgdjweb.bean.Task;
import com.xgdjweb.bean.TaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TaskMapper {
    int countByExample(TaskExample example);

    int deleteByExample(TaskExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Task record);

    int insertSelective(Task record);

    List<Task> selectByExample(TaskExample example);

    Task selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);

    @Select("Select * from task")
    List<Task> findAllTask();

    //    任务管理的查询
    List<Task> getTaskBySearch(@Param("tasktitle")String tasktitle,
                               @Param("srole") String srole,
                               @Param("publisher") String publisher);
    //    任务审核的查询
    List<Task> getTaskByLike(@Param("username")  String username,
                             @Param("snumber") String snumber,
                             @Param("phone") String phone,
                             @Param("tid") Integer tid);
    // 我关闭的任务
    List<Task> myClose(Integer id);

    // 我创建的任务
    List<Task> myPublish(Integer id);
    //派给我的任务
    List<Task> sentMe(Integer id);
    //我发布的任务
    List<Task> myResolve(Integer id);
    //    移动段发给用户的任务
    List<Task> publishUser(Integer sid);
<<<<<<< HEAD

    List<Task> findTasksBySrole(@Param("sid") Integer sid,
                                @Param("category") String category);
=======
>>>>>>> b2f9e720d20818178f86064ce3b8e29766351f2e
}