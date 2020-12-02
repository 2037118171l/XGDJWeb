package com.xgdjweb.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.Acticle;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.ActicleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ActicleService {
    @Autowired
    ActicleMapper acticleMapper;

    @Autowired
    private TemplateEngine templateEngine;  //使用TemplateEngine对象

    @Value("${prop.upload-html}")
    private String setHtmlPath;

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
    Date articletime= df.parse(date);//将string类型转换为Data

    public ActicleService() throws ParseException {
    }

    /**
     * @Description: 增加文章
     * data:2020/11/12
     */

    public ResponseWrapper addActicle(Acticle acticle){
        if (acticle == null){
            return ResponseWrapper.markError();
        }else {
            int i = acticleMapper.insertSelective(acticle);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }

    public ResponseWrapper buildPage(String title,String category,String srole,String code,String content,String name) throws IOException {
        //数据
        Context context = new Context();
        context.setVariable("filetilte", title);
        context.setVariable("category", category);
        context.setVariable("srole", srole);
        context.setVariable("code", code);
        context.setVariable("content", content);

        String url = setHtmlPath+name+".html";
        //文件输出的路径及文件名
        FileWriter writer = new FileWriter(url);
        templateEngine.process("news", context, writer);  //参数：模板，数据，文件输出流
        //关闭文件
        writer.close();
        //将数据新增到数据库
        Acticle acticle = new Acticle();
        acticle.setCategory(category);
        acticle.setTitle(title);
        acticle.setArticletime(articletime);
        acticle.setSrole(srole);
        acticle.setUrl(url);
         addActicle(acticle);
        return ResponseWrapper.markSuccess(1);

    }

    public ResponseWrapper updateActicle(Acticle acticle){
        if (acticle == null){
            return ResponseWrapper.markError();
        }else {
            int i = acticleMapper.updateByPrimaryKeySelective(acticle);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }

        }
    }

    /**
     * @Description:查询所有文章
     * @param pageSize
     * @param pageNum
     * @return
     */
    public ResponseWrapper findActicle(Integer pageSize,Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<Acticle> acticles = acticleMapper.findActicle();
        PageInfo pageInfo = new PageInfo(acticles,10);
        return ResponseWrapper.markSuccess(pageInfo);
    }

    /**
     * @Description:删除文章
     * @param aid
     * @return
     */
    public ResponseWrapper delActicle(Integer aid){
        if (aid == null){
            return ResponseWrapper.markError();
        } else {
//                单个删除
            Acticle acticle = acticleMapper.selectByPrimaryKey(aid);
            String url =acticle.getUrl();
            if (url == null){
                return ResponseWrapper.markError();
            }else {
                String filePath = url;
                File file = new File(filePath);
                boolean flag = file.delete();
                int i = acticleMapper.deleteByPrimaryKey(aid);
                if (i == 1) {
                    return ResponseWrapper.markSuccess(i);
                } else {
                    return ResponseWrapper.markError();
                }
            }

        }

    }


}
