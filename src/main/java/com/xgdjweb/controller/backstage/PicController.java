package com.xgdjweb.controller.backstage;

import com.xgdjweb.bean.Pictureupload;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.PicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用于处理上传图片存入数据库")
@RequestMapping("/Pic")
@RestController
public class PicController {

    @Autowired
    PicService picService;

    @ApiOperation("查找所有图片信息")
    @GetMapping("/findPic")
<<<<<<< HEAD
    public ResponseWrapper findPic(@RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize,
                                   @RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum){
        ResponseWrapper wrapper = picService.findPic(pageSize,pageNum);
=======
    public ResponseWrapper findPic(){
        ResponseWrapper wrapper = picService.findPic();
>>>>>>> b2f9e720d20818178f86064ce3b8e29766351f2e
        return wrapper;
    }
    @ApiOperation("增加图片")
    @PostMapping("/addPic")
    public ResponseWrapper addPic(@RequestBody Pictureupload pictureupload){
        ResponseWrapper wrapper = picService.addPic(pictureupload);
        return wrapper;
    }
    @ApiOperation("修改图片信息")
    @PutMapping("/updatePic")
    public ResponseWrapper updatePic(@RequestBody Pictureupload pictureupload){
        ResponseWrapper wrapper  = picService.updatePic(pictureupload);
        return wrapper;
    }
    @ApiOperation("删除图片")
    @DeleteMapping("/deletePic")
<<<<<<< HEAD
    public ResponseWrapper deletePic(@RequestParam( name = "pid") String pid){
        ResponseWrapper wrapper = picService.deletePic(pid);
=======
    public ResponseWrapper deletePic(@RequestParam( name = "pids") String pids){
        ResponseWrapper wrapper = picService.deletePic(pids);
>>>>>>> b2f9e720d20818178f86064ce3b8e29766351f2e
        return wrapper;
    }

}
