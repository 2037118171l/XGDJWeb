package com.xgdjweb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.Admin;
import com.xgdjweb.bean.AdminExample;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.AdminMapper;
import com.xgdjweb.jwt.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminService {

    @Autowired
    AdminMapper adminMapper;

    public Map<Object,Object> findAllAdmin() {
        List<Admin> list = adminMapper.findAllAdmin();
        HashMap<Object,Object> map = new HashMap<>();
        map.put("list",list);
        return map;
    }

    public List<Admin> getAdminByNumber(String number) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andNumberEqualTo(number);
        List<Admin> admins = adminMapper.selectByExample(example);
        return admins;
    }
    public Admin getAdminById(Integer id){
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }
    public ResponseWrapper login(Admin admin){
        if (admin==null){
            return ResponseWrapper.markParamError();
        }else {
            Admin userInfo = null;
            List<Admin> list = getAdminByNumber(admin.getNumber());
            if (list.size() == 0) {
                return ResponseWrapper.markCustom(false, 400, "用户不存在", null);
            } else {
                userInfo = list.get(0);
                String realPassword = userInfo.getPassword();
                if (!realPassword.equals(admin.getPassword())) {
                    return ResponseWrapper.markCustom(false, 400, "密码错误", null);
                }
            }
            Map<String, Object> map = new HashMap<>();
            map.put("token", JWTUtil.createToken(admin.getNumber()));
            admin = list.get(0);
            map.put("admin",admin);
            return ResponseWrapper.markSuccess(map);
        }
    }

    public ResponseWrapper updatePasword(Integer id, String oldPassword, String newPassword) {
        if(id != null && oldPassword != null && newPassword != null){
            Admin list = getAdminById(id);
            if (list == null) {
                return ResponseWrapper.markCustom(false, 400,"用户不存在", null);
            } else {
                if (oldPassword.equals(list.getPassword())) {
                    Admin admin = list;
                    //将newPassword的值重新赋给它
                    admin.setPassword(newPassword);
                    int i = adminMapper.updateByPrimaryKeySelective(admin);
                    if (i==1) {
                        return ResponseWrapper.markCustom(true, 200, "修改成功", null);
                    }else {
                        return ResponseWrapper.markParamError();
                    }
                }else {
                    return ResponseWrapper.markCustom(false, 400, "密码错误", null);
                }
            }
        }else {
            return ResponseWrapper.markParamError();
        }
    }
    /**
     * @Description:新增用户admin
     * @author :lel
     * @Date:2020/08/23 21:14
     * @return 返回的消息
     */
    public ResponseWrapper addAdmin(Admin admin){
        if (admin == null){
            return  ResponseWrapper.markError();
        }else {
            int i = adminMapper.insertSelective(admin);
            if (i == 1){
                return  ResponseWrapper.markSuccess(i);
            }else {
                return  ResponseWrapper.markError();
            }
        }
    }

    public ResponseWrapper updateAdmin(Admin admin){
        if (admin == null){
            return  ResponseWrapper.markError();
        }else {
            int i = adminMapper.updateByPrimaryKeySelective(admin);
            if (i == 1){
                return  ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }

    /**
     * @Description：批量删除和单个删除admin整合
     * @param ids
     * @return
     */
    public ResponseWrapper deleteAdmin(String ids){
        if(ids == null){
            return ResponseWrapper.markError();
        }else {
            //批量删除
            //判断ids之间是不是通过-连接
            if (ids.contains("-")){
//                创建容器
                List<Integer> del_ids = new ArrayList<>();
//                分解ids
                String[] str_ids = ids.split("-");
//                遍历，使分割出的id存入容器
                for (String str_id : str_ids) {
                    del_ids.add(Integer.parseInt(str_id));
                }
                AdminExample example = new AdminExample();
                AdminExample.Criteria criteria = example.createCriteria();
                criteria.andIdIn(del_ids);
                int i = adminMapper.deleteByExample(example);
                if (i > 0) {
                    return ResponseWrapper.markSuccess(i);
                } else {
                    return ResponseWrapper.markError();
                }
            } else {
//                单个删除
                Integer id = Integer.parseInt(ids);
                int i = adminMapper.deleteByPrimaryKey(id);
                if (i == 1) {
                    return ResponseWrapper.markSuccess(i);
                } else {
                    return ResponseWrapper.markError();
                }
            }

        }
    }

    public ResponseWrapper getAdminBySearch(String name, String wachatname, String college, String phone, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Admin> admins = adminMapper.getAdminBySearch(name,wachatname,college,phone);
        PageInfo adminpage = new PageInfo(admins,10);
        return ResponseWrapper.markSuccess(adminpage);
    }


}
