package com.xgdjweb.controller.moile;

import com.xgdjweb.bean.User;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
<<<<<<< HEAD
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@Api( tags = "移动端用户界面")
@RequestMapping("/mobile/Users")
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api( tags = "移动端用户界面")
@RequestMapping("/Users")
>>>>>>> b2f9e720d20818178f86064ce3b8e29766351f2e
public class UsersController {
    @Autowired
    UserService userService;

//    @PostMapping("/User/login")
//    @RequiresPermissions(value = {"admin","user"},logical = Logical.OR)
//    public ResponseWrapper login(@RequestBody User user){
//        ResponseWrapper wrapper = userService.login(user);
//        return wrapper;
//    }
    @PutMapping("/updateUser")
    @ApiOperation("移动端修改个人信息")
    public ResponseWrapper update(@RequestBody User user){
        ResponseWrapper wrapper = userService.updateUser(user);
        return wrapper;
    }
    @ApiOperation("个人资料")
    @GetMapping("/findUserBySid")
    public ResponseWrapper findBySid(@RequestParam(value = "sid") Integer sid){
        ResponseWrapper wrapper = userService.findUserBySid(sid);
        return wrapper;
    }
    @ApiOperation("移动端发布给用户的任务")
    @GetMapping("/publishUser")
    public ResponseWrapper publishUser(@RequestParam(name = "sid")Integer sid,
                                       @RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum,
                                       @RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize){
        ResponseWrapper wrapper = userService.publishUser(sid,pageNum,pageSize);
        return wrapper;
    }
<<<<<<< HEAD




=======
>>>>>>> b2f9e720d20818178f86064ce3b8e29766351f2e
}
