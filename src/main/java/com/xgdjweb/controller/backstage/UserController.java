package com.xgdjweb.controller.backstage;


import com.xgdjweb.bean.User;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "学生管理")
@RequestMapping("/User")
@RestController
public class UserController {
    @Autowired
    UserService userService;


    @ApiOperation("修改用户")
    @PutMapping("/updateUser")
    public ResponseWrapper updateUser(@RequestBody User user){
        ResponseWrapper wrapper = userService.updateUser(user);
        return wrapper;
    }
    /**
     *增加user
     */
    @ApiOperation("增加用户")
    @PostMapping("/addUser")
    public ResponseWrapper addUser(@RequestBody User user){
        ResponseWrapper wrapper = userService.addUser(user);
        return wrapper;
    }
    /**
     *批量删除user
     */
    @ApiOperation("删除用户")
    @DeleteMapping("/deleteUser")
    public ResponseWrapper deleteUser(@RequestParam(value = "sids")String sids){
        ResponseWrapper wrapper = userService.deleteUser(sids);
        return wrapper;
    }

    @ApiOperation("学生名单的模糊查询")
    @GetMapping("/getUserBySearch")
    public ResponseWrapper getUserBySearch(@RequestParam(name = "snumber",required = false) String snumber,
                                           @RequestParam(name = "userclass",required = false) String userclass,
                                           @RequestParam(name = "srole",required = false)String srole,
                                           @RequestParam(name = "phone",required = false) String phone,
                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = userService.getUserBySearch(snumber,userclass,srole,phone,pageNum,pageSize);
        return wrapper;
    }
    @ApiOperation("学子成长的学子审核多重查询")
    @GetMapping("/findUserBySearch")
    public ResponseWrapper findUserBySearch(@RequestParam(name = "snumber",required = false) String snumber,
                                            @RequestParam(name = "username",required = false) String username,
                                            @RequestParam(name = "college",required = false)String college,
                                            @RequestParam(name = "userclass",required = false) String userclass,
                                            @RequestParam(name = "srole",required = false) String srole,
                                            @RequestParam(name = "grade",required = false) String grade,
                                            @RequestParam(name = "phone",required = false)String phone,
                                            @RequestParam(name = "sex",required = false) String sex,
                                            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = userService.findUserBySearch(snumber,username,college,userclass,srole,grade,phone,sex,pageNum,pageSize);
        return  wrapper;
    }

}
