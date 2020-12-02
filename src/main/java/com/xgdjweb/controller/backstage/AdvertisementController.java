package com.xgdjweb.controller.backstage;

import com.xgdjweb.bean.Advertisement;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.AdvertisementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "广告管理")
@RequestMapping("/Advertisement")
@RestController
public class AdvertisementController {
    @Autowired
    AdvertisementService advertisementService;

    @ApiOperation("新增广告")
    @PostMapping("/addAdvertisement")
    public ResponseWrapper addAdvertisement(@RequestBody Advertisement advertisement){
        ResponseWrapper wrapper =  advertisementService.addAdvertisement(advertisement);
        return wrapper;
    }

    @ApiOperation("修改广告")
    @PutMapping("/updateAdvertisement")
    public ResponseWrapper updateAdvertisement(@RequestBody Advertisement advertisement){
        ResponseWrapper wrapper = advertisementService.updateAdvertisement(advertisement);
        return  wrapper;
    }

    @ApiOperation("批量删除广告")
    @DeleteMapping("/deteleAdvertisement")
    public ResponseWrapper deteleAdvertisement(String ids){
        ResponseWrapper wrapper = advertisementService.deleteAdvertisment(ids);
        return wrapper;
    }

    @ApiOperation("多重查询和分页")
    @GetMapping("/getAdvertisementBySearch")
    public ResponseWrapper getAdvertisementBySearch(@RequestParam( name = "number",required = false) String number,
                                                    @RequestParam( name = "category",required = false) String category,
                                                    @RequestParam( name = "displayorder",required = false) String displayorder,
                                                    @RequestParam( name = "title",required = false) String title,
                                                    @RequestParam( name = "pageNum", defaultValue = "1") Integer pageNum,
                                                    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        ResponseWrapper wrapper = advertisementService.getAdvertisementBySearch(number,category,displayorder,title,pageNum,pageSize);
        return wrapper;
    }
}
