package com.xgdjweb.service;

import com.xgdjweb.bean.Parameter;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.ParameterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParameterService {
    @Autowired
    ParameterMapper parameterMapper;

    /**
     * 查询所有参数
     */
    public List<Parameter> findAllParameter(){
        List<Parameter> parameters = parameterMapper.findAllParameter();
        return parameters;
    }
    /**
     * 修改参数配置
     */
    public ResponseWrapper updateParameter(Parameter parameter){
        if (parameter == null){
            return ResponseWrapper.markError();
        }else {
            int i = parameterMapper.updateByPrimaryKeySelective(parameter);
            if(i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
}
