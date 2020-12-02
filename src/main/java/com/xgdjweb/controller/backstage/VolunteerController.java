package com.xgdjweb.controller.backstage;

import com.xgdjweb.bean.Volunteer;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.VolunteerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Date;


@Api(tags = "志愿任务管理")
@RequestMapping("/Volunteer")
@RestController
public class VolunteerController {
    @Autowired
    VolunteerService volunteerService;

    @ApiOperation("新增志愿活动")
    @PostMapping("/addVolunteer")

    public ResponseWrapper addVolunteer(@RequestParam(name = "number",required = false)String number,
                                        @RequestParam(name = "volunteername",required = false)String colunteername,
                                        @RequestParam(name = "vtime",required = false)Date vtime,
                                        @RequestParam(name = "neednum",required = false)Integer neednum,
                                        @RequestParam(name = "applicantsnum",required = false)Integer applicantsnum,
                                        @RequestParam(name = "contacts",required = false)String contacts,
                                        @RequestParam(name = "cphone",required = false)String cphone,
                                        @RequestParam(name = "publisher",required = false)String publisher,
                                        @RequestParam(name = "college",required = false)String college,
                                        @RequestParam(name = "releastime",required = false)Date relasetime,
                                        @RequestParam(name = "endtime",required = false)Date endtime,
                                        @RequestParam(name = "assemblytime",required = false)Date assemblytime,
                                        @RequestParam(name = "collectionplace",required = false)String collectionplace,
                                        @RequestParam(name = "content",required = false)String content
                                        ){
        ResponseWrapper wrapper = volunteerService.addVolunteer(number,colunteername,vtime,neednum,applicantsnum,contacts,cphone,publisher,college,relasetime,endtime,assemblytime,collectionplace,content);
        return wrapper;
    }
    @ApiOperation("移动端报名志愿活动")
    @PostMapping("/signUp")
    public ResponseWrapper signUp(@RequestParam(name = "vid")Integer vid,
                                  @RequestParam(name = "starttime",required = false)Date starttime,
                                  @RequestParam(name = "compeletime",required = false)Date completetime,
                                  @RequestParam(name = "examinetime",required = false)Date exminetime,
                                  @RequestParam(name = "putton",required = false)String putton,
                                  @RequestParam(name = "examine",required = false)String examine,
                                  @RequestParam(name = "state",required = false)String state,
                                  @RequestParam(name = "sid",required = false)Integer sid){
        ResponseWrapper wrapper = volunteerService.signUp(vid,starttime,completetime,exminetime,putton,examine,state,sid);
        return wrapper;
    }
    @ApiOperation("修改志愿活动")
    @PutMapping("/updateVolunteer")
    public ResponseWrapper updateVolunteer(@RequestParam(name = "vid",required = false)Integer vid,
                                            @RequestParam(name = "number",required = false)String number,
                                           @RequestParam(name = "volunteername",required = false)String colunteername,
                                           @RequestParam(name = "vtime",required = false)Date vtime,
                                           @RequestParam(name = "neednum",required = false)Integer neednum,
                                           @RequestParam(name = "applicantsnum",required = false)Integer applicantsnum,
                                           @RequestParam(name = "contacts",required = false)String contacts,
                                           @RequestParam(name = "cphone",required = false)String cphone,
                                           @RequestParam(name = "publisher",required = false)String publisher,
                                           @RequestParam(name = "college",required = false)String college,
                                           @RequestParam(name = "releastime",required = false)Date relasetime,
                                           @RequestParam(name = "endtime",required = false)Date endtime,
                                           @RequestParam(name = "assemblytime",required = false)Date assemblytime,
                                           @RequestParam(name = "collectionplace",required = false)String collectionplace,
                                           @RequestParam(name = "content",required = false)String content,
                                           @RequestParam(name = "starttime",required = false)Date starttime,
                                           @RequestParam(name = "compeletime",required = false)Date completetime,
                                           @RequestParam(name = "examinetime",required = false)Date exminetime,
                                           @RequestParam(name = "putton",required = false)String putton,
                                           @RequestParam(name = "examine",required = false)String examine,
                                           @RequestParam(name = "state",required = false)String state,
                                           @RequestParam(name = "sid",required = false)Integer sid){
        ResponseWrapper wrapper = volunteerService.updateVolunteer(vid,number,colunteername,vtime,neednum,applicantsnum,contacts,cphone,publisher,college,relasetime,endtime,assemblytime,collectionplace,content,starttime,completetime,exminetime,putton,examine,state,sid);
        return wrapper;
    }
    @ApiOperation("批量删除")
    @DeleteMapping("/deleteVolunteer")

    public ResponseWrapper deleteVolunteer(Integer vid){
        ResponseWrapper wrapper = volunteerService.deteleVolunteer(vid);
        return wrapper;
    }
    @ApiOperation("多重查询")
    @GetMapping("/findBySearch")
    public ResponseWrapper findBySearch(@RequestParam(name = "volunteer",required = false) String volunteername,
                                        @RequestParam(name = "contacts",required = false) String contacts,
                                        @RequestParam(name = "vstate",required = false) String vstate,
                                        @RequestParam(name = "college", required = false) String college,
                                        @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                        @RequestParam(name = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = volunteerService.findBySearch(volunteername,contacts,vstate,college,pageNum,pageSize);
        return wrapper;
    }
    @ApiOperation("志愿审核多重查询")
    @GetMapping("/findVoluByLike")
    public ResponseWrapper findVoluByLike(@RequestParam(name = "username",required = false) String username,
                                          @RequestParam(name = "snumber",required = false) String snumber,
                                          @RequestParam(name = "vstate",required = false) String vstate,
                                          @RequestParam(name = "phone", required = false) String phone,
                                          @RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
                                          @RequestParam(name = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = volunteerService.findVoluByLike(username,snumber,phone,vstate,pageNum,pageSize);
        return wrapper;
    }
}
