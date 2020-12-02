package com.xgdjweb.controller.backstage;


import com.xgdjweb.bean.Admin;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Api(tags = "管理员")

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    /**
     * @Description:查询所有管理员
     * @author：lel
     * @date：2020/08/23 21：44
     * @return map
     */
    @ApiOperation("查询所有管理员")
    @GetMapping("/findAllAdmin")
    public Map<Object,Object> finaAllAdmin(){
        Map<Object, Object> map = adminService.findAllAdmin();
        return map;
    }


    /**
     * @Description: login方法是处理登录方法
     * @param: username 账号 password 密码
     * @return:token 令牌，秘钥；（24小时候过期）
     * @auther: lel
     * @date: 2020/8/20 20：02
     */
    @ApiOperation("登录----只需要number和password参数")
    @PostMapping("/login")
    public ResponseWrapper login(@RequestBody Admin admin){
        ResponseWrapper wrapper = adminService.login(admin);
        return wrapper;
    }

    /**
     * @Descriptiom:通过账号和旧密码来修改密码
     * @param oldPassword：旧密码
     * @param newPassword：新密码
     * @author:2020/8/23 21:41
     * @return
     */
    @ApiOperation("通过账号修改密码")
    @PutMapping("/updatePassword")
    public ResponseWrapper updatePassword(@RequestParam(name = "id",required = false) Integer id,
                                          @RequestParam(name = "oldPassword",required = false) String oldPassword,
                                          @RequestParam(name = "newPassword", required = false) String newPassword){
            ResponseWrapper wrapper = adminService.updatePasword(id,oldPassword,newPassword);
            return wrapper;
    }

    /**
     * @Description:新增管理员
     * @author:lel
     * @date 2020/08/23 21:50
     * @param admin
     * @return
     */
    @ApiOperation("新增管理员")
    @PostMapping("/addAdmin")
    public ResponseWrapper addAdmin(@RequestBody Admin admin){
        ResponseWrapper wrapper = adminService.addAdmin(admin);
        return wrapper;
    }

    @ApiOperation("修改管理员")
    @PutMapping("/updateAdmin")
    public ResponseWrapper updateAdmin(Admin admin){
        ResponseWrapper wrapper = adminService.updateAdmin(admin);
        return wrapper;
    }

    /**
     * @Description： 批量删除和单个删除整合
     * @author:lel
     * @date:2020/08/23 21:52
     * @param ids :格式为1-X的多个id
     * @return
     */
    @ApiOperation("批量删除管理员")
    @DeleteMapping("/deleteAdmin")
    public ResponseWrapper deleteAdmin(String ids){
        ResponseWrapper wrapper = adminService.deleteAdmin(ids);
        return  wrapper;
    }
    @ApiOperation("用户名单的模糊查询")
    @GetMapping("/getAdminBySearch")
    public ResponseWrapper getUserBySearch(@RequestParam(name = "name",required = false) String name,
                                           @RequestParam(name = "wechatname",required = false) String wechatname,
                                           @RequestParam(name = "college",required = false)String college,
                                           @RequestParam(name = "phone",required = false) String phone,
                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = adminService.getAdminBySearch(name,wechatname,college,phone,pageNum,pageSize);
        return wrapper;
    }


//    @ApiOperation("退出登录")
//    @PostMapping(value = "/logout")
//    public ResponseWrapper logout(Admin admin){
//        ResponseWrapper wrapper = adminService.logout(admin);
//        return wrapper;
//    }

}
