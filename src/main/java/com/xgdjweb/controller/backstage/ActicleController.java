package com.xgdjweb.controller.backstage;

import com.xgdjweb.bean.Acticle;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.ActicleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@Api(tags = "文章管理")
@RestController
@RequestMapping("/Acticle")
public class ActicleController {

    @Autowired
    ActicleService acticleService;

    @ApiOperation("生成html")
    @PostMapping ("/buildHtml")
    public ResponseWrapper buildPage(@RequestParam(name = "title",required = false)String title,                          @RequestParam(name = "category",required = false)String category,
                          @RequestParam(name = "srole",required = false)String srole,
                          @RequestParam(name = "code",required = false)String code,
                          @RequestParam(name = "content",required = false)String content,
                          @RequestParam(name="name",defaultValue = "news1000001")String name) throws IOException {
        ResponseWrapper wrapper = acticleService.buildPage(title,category,srole,code,content,name);
        return wrapper;
    }

    @ApiOperation("增加文章")
    @PostMapping("/addActicle")
    public ResponseWrapper addActicle(@RequestBody Acticle acticle){
        ResponseWrapper wrapper = acticleService.addActicle(acticle);
        return wrapper;
    }

    @ApiOperation("删除文章")
    @DeleteMapping("/delActicle")
    public ResponseWrapper delActicle(Integer aid){
        ResponseWrapper wrapper = acticleService.delActicle(aid);
        return wrapper;
    }

    @ApiOperation("修改文章")
    @PutMapping("/updateActicle")
    public ResponseWrapper updateActicle(@RequestBody Acticle acticle){
        ResponseWrapper wrapper = acticleService.updateActicle(acticle);
        return wrapper;
    }
    @ApiOperation("查询所有文章")
    @GetMapping("/findActicle")
    public ResponseWrapper findActicle(@RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize,
                                       @RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum){
        ResponseWrapper wrapper = acticleService.findActicle(pageSize,pageNum);
        return wrapper;
    }


}

