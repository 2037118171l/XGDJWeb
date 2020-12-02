package com.xgdjweb.controller.backstage;

import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Api(tags = "学子成长任务管理")
@RequestMapping("/Task")
@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @ApiOperation("查询所有任务")
    @GetMapping("/findAllTask")
    public Map<Object,Object> findAllTask(){
        Map<Object, Object> map = taskService.findAllTask();
        return  map;
    }

    @ApiOperation("新增任务")
    @PostMapping("/addTask")
    public ResponseWrapper addTask(@RequestParam(name = "tasktitle",required = false) String tasktitle,
                                   @RequestParam(name = "tasktype",required = false) String tasktype,
                                   @RequestParam(name = "taskcontent",required = false) String taskcontent,
                                   @RequestParam(name = "isshow",required = false) String isshow,
                                   @RequestParam(name = "srole",required = false) String srole,
                                   @RequestParam(name = "releasetime",required = false) Date releasetime,
                                   @RequestParam(name = "endtime",required = false) Date endtime,
                                   @RequestParam(name = "publisher",required = false) String publisher,
                                   @RequestParam(name = "number",required = false) String number,
                                   @RequestParam(name = "closeperson",required = false) String closeperson,
                                   @RequestParam(name = "resolver",required = false) String resolver,
                                   @RequestParam(name = "starttime",required = false) Date starttime,
                                   @RequestParam(name = "completetime",required = false) Date completetime,
                                   @RequestParam(name = "examinetime",required = false) Date examinetime,
                                   @RequestParam(name = "putton",required = false) String putton,
                                   @RequestParam(name = "examine",required = false) String examine,
                                   @RequestParam(name = "state",required = false) String state){
        ResponseWrapper wrapper = taskService.addTask(tasktitle,
                tasktype,
                taskcontent,
                isshow,
                srole,
                releasetime,
                endtime,
                publisher,
                number,
                closeperson,
                resolver,
                starttime,
                completetime,examinetime,putton,examine,state);
        return  wrapper;
    }

    @ApiOperation("修改任务")
    @PutMapping("/updateTask")
    public ResponseWrapper updateTask(@RequestParam(name = "tid") Integer tid,
                                      @RequestParam(name = "tasktitle",required = false) String tasktitle,
                                      @RequestParam(name = "tasktype",required = false) String tasktype,
                                      @RequestParam(name = "taskcontent",required = false) String taskcontent,
                                      @RequestParam(name = "isshow",required = false) String isshow,
                                      @RequestParam(name = "srole",required = false) String srole,
                                      @RequestParam(name = "releasetime",required = false) Date releasetime,
                                      @RequestParam(name = "endtime",required = false) Date endtime,
                                      @RequestParam(name = "publisher",required = false) String publisher,
                                      @RequestParam(name = "number",required = false) String number,
                                      @RequestParam(name = "closeperson",required = false) String closeperson,
                                      @RequestParam(name = "resolver",required = false) String resolver,
                                      @RequestParam(name = "starttime",required = false) Date starttime,
                                      @RequestParam(name = "completetime",required = false) Date completetime,
                                      @RequestParam(name = "examinetime",required = false) Date examinetime,
                                      @RequestParam(name = "putton",required = false) String putton,
                                      @RequestParam(name = "examine",required = false) String examine,
                                      @RequestParam(name = "state",required = false) String state){
        ResponseWrapper wrapper = taskService.updateTask(tid,tasktitle,
                tasktype,
                taskcontent,
                isshow,
                srole,
                releasetime,
                endtime,
                publisher,
                number,
                closeperson,
                resolver,
                starttime,
                completetime,examinetime,putton,examine,state);
        return wrapper;
    }

    @ApiOperation("删除任务(别用批量删除)")
    @DeleteMapping("/deleteTask")
    public ResponseWrapper deleteTask(String tids){
        ResponseWrapper wrapper = taskService.deleteTask(tids);
        return wrapper;
    }

    @ApiOperation("多重查询和分页")
    @GetMapping("/getTaskBySearch")
    public ResponseWrapper getTaskBySearch(@RequestParam(name = "tasktitle",required = false) String tasktitle,
                                           @RequestParam(name = "srole",required = false) String srole,
                                           @RequestParam(name = "publisher",required = false) String publisher,
                                           @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = taskService.getTaskBySearch(tasktitle,srole,publisher,pageNum,pageSize);
        return wrapper;
    }
    @ApiOperation("任务审核的多重查询")
    @GetMapping("/getTaskByLike")
    public ResponseWrapper getTaskByLike(@RequestParam(name = "username",required = false) String username,
                                         @RequestParam(name = "snumber",required = false) String snumber,
                                         @RequestParam(name = "phone",required = false) String phone,
                                         @RequestParam(name = "tid")Integer tid,
                                         @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = taskService.getTaskByLike(username,snumber,phone,tid,pageNum,pageSize);
        return wrapper;
    }
    @ApiOperation("通过id查找一条数据")
    @GetMapping("/findTaskById")
    public ResponseWrapper findTaskById(@RequestParam(name = "tid") Integer tid){
        ResponseWrapper wrapper = taskService.findTaskById(tid);
        return  wrapper;
    }
    @ApiOperation("我关闭的任务")
    @GetMapping("/myClose")
    public ResponseWrapper myClose(@RequestParam(name = "id") Integer id,
                                   @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = taskService.myClose(id,pageNum,pageSize);
        return wrapper;
    }
    @ApiOperation("我发布的任务")
    @GetMapping("/myPublish")
    public ResponseWrapper myPublish(@RequestParam(name = "id") Integer id,
                                     @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                     @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = taskService.myPublish(id,pageNum,pageSize);
        return  wrapper;
    }
    @ApiOperation("派给我的任务")
    @GetMapping("/sentMe")
    public ResponseWrapper sentMe(@RequestParam(name = "id") Integer id,
                                  @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = taskService.sentMe(id,pageNum,pageSize);
        return  wrapper;
    }
    @ApiOperation("我解决的任务")
    @GetMapping("/myResolve")
    public ResponseWrapper myResolve(@RequestParam(name = "id") Integer id,
                                     @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                     @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = taskService.myResolve(id,pageNum,pageSize);
        return  wrapper;
    }

    @ApiOperation("成长履历")
    @GetMapping("/taskStatus")
    public ResponseWrapper taskStatus(@RequestParam(name = "snumber",required = false)String snumber,
                                      @RequestParam(name = "username",required = false)String username,
                                      @RequestParam(name = "category",required = false)String category,
                                      @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                      @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = taskService.findTaskstatus(snumber,username,category,pageNum,pageSize);
        return wrapper;
    }

}
