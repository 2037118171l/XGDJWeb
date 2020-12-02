package com.xgdjweb.controller.backstage;

import com.xgdjweb.bean.Parameter;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.ParameterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "参数配置页面")
@RequestMapping("/Parameter")
@RestController
public class ParameterController {

    @Autowired
    ParameterService parameterService;

    @ApiOperation("获取所有参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "id",dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "name",value = "公司名称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "icp",value = "icp备案号",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "shopname",value = "商城名称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "url",value = "域名",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "appid",value = "appid",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "appsecret",value = "appsecret",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "basetoken",value = "basetoken",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "shopid",value = "商户id",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "shopkey",value = "商户支付密钥",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "distributionimg",value = "分销码底图",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "logo",value = "网址logo",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "official",value = "公众号二维码",dataType = "string",paramType = "query")
    })
    @GetMapping("/findAllParameter")
    public List<Parameter> findAllParameter(){
        List<Parameter> parameters = parameterService.findAllParameter();
        return parameters;
    }
    @ApiOperation("修改参数配置")
    @PutMapping("/updateParameter")
    public ResponseWrapper updateParameter(@RequestBody Parameter parameter){
        ResponseWrapper wrapper = parameterService.updateParameter(parameter);
        return wrapper;
    }
}
