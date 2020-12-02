package com.xgdjweb.controller.moile;

import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "移动端的任务管理")
@RequestMapping("/mobile/Tasks")
@RestController
public class TasksController {
    @Autowired
    TaskService taskService;

    @ApiOperation("学子成长的任务")
    @GetMapping("/findTasksBySrole")
    public ResponseWrapper findTasksBySrole(@RequestParam(name = "sid")Integer sid,
                                            @RequestParam(name = "category")String category,
                                            @RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum,
                                            @RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize){
        ResponseWrapper wrapper = taskService.findTasksBySrole(sid,category,pageSize,pageNum);
        return wrapper;
    }
}
