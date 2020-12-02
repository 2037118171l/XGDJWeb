package com.xgdjweb.service;

import com.xgdjweb.bean.Menu;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *author:lel
 * time:2020/8/22 16:59
 */


@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    /**
     *遍历menu查询所有
     */
    public List<Menu> findAllMenu(){
        List<Menu> menus = menuMapper.findAllMenu();
        return  menus;
    }

    /**
     * 修改菜单得名称和url
     */
     public ResponseWrapper updateMenu(Menu menu){
        if (menu == null){
            return  ResponseWrapper.markError();
        }else {
            int i =menuMapper.updateByPrimaryKeySelective(menu);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
     }

}
