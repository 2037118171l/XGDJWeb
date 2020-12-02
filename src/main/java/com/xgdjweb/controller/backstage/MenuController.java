package com.xgdjweb.controller.backstage;

import com.xgdjweb.bean.Menu;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "公众号菜单")
@RequestMapping("/Menu")
@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @ApiOperation("查询菜单所有元素")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "id",dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "leftname",value = "位置是左的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "lefturl",value = "位置是左的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftonename",value = "位置是左一的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftoneurl",value = "位置是左一的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "lefttwoname",value = "位置是左二的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "lefttwourl",value = "位置是左二的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftthreename",value = "位置是左三的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftthreeurl",value = "位置是左三的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftfourname",value = "位置是左四的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftfoururl",value = "位置是左四的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftfivename",value = "位置是左五的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "leftfiveurl",value = "位置是左五的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centername",value = "位置是中的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centerurl",value = "位置是中的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centeronename",value = "位置是中一的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centeroneurl",value = "位置是中一的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centertwoname",value = "位置是中二的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centertwourl",value = "位置是中二的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centerthreename",value = "位置是中三的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centerthreeurl",value = "位置是中三的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centerfourname",value = "位置是中四的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centerfoururl",value = "位置是中四的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centerfivename",value = "位置是中五的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "centerfiveurl",value = "位置是中五的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightname",value = "位置是右的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "righturl",value = "位置是右的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightonename",value = "位置是右一的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightoneurl",value = "位置是右一的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "righttwoname",value = "位置是右二的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "righttwourl",value = "位置是右二的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightthreename",value = "位置是右三的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightthreeurl",value = "位置是右三的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightfourname",value = "位置是右四的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightfoururl",value = "位置是右四的菜单连接",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightfivename",value = "位置是右五的菜单名称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "rightfiveurl",value = "位置是右五的菜单连接",dataType = "String",paramType = "query")
    })
    @GetMapping("/findAllMenu")
    public List<Menu> findAllMenu(){
        List<Menu> menus = menuService.findAllMenu();
        return menus;
    }
    @ApiOperation("修改菜单")
    @PutMapping("/updateMenu")
    public ResponseWrapper updateMenu(@RequestBody Menu menu){
        ResponseWrapper wrapper = menuService.updateMenu(menu);
        return wrapper;
    }
}
