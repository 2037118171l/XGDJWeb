package com.xgdjweb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.Advertisement;
import com.xgdjweb.bean.AdvertisementExample;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.AdvertisementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertisementService {

    @Autowired
    AdvertisementMapper advertisementMapper;

    /**
     * @Description：新增广告
     * @param advertisement 广告
     * @date 2020/8/25 12：24
     * @return
     */
    public ResponseWrapper addAdvertisement(Advertisement advertisement){
        if (advertisement == null){
            return  ResponseWrapper.markError();
        }else {
            int i = advertisementMapper.insertSelective(advertisement);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }

    /**
     * @Description: 修改广告
     * @param advertisement
     * @return
     */
    public ResponseWrapper updateAdvertisement(Advertisement advertisement){
        if (advertisement == null){
            return ResponseWrapper.markError();
        }else {
            int i = advertisementMapper.updateByPrimaryKeySelective(advertisement);
            if (i == 1){
                return  ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }

    /**
     * @Description 批量删除和单个删除
     * @param ids
     * @return
     */
    public ResponseWrapper deleteAdvertisment(String ids){
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
                AdvertisementExample example = new AdvertisementExample();
                AdvertisementExample.Criteria criteria = example.createCriteria();
                criteria.andIdIn(del_ids);
                int i = advertisementMapper.deleteByExample(example);
                if (i > 0) {
                    return ResponseWrapper.markSuccess(i);
                } else {
                    return ResponseWrapper.markError();
                }
            } else {
//                单个删除
                Integer id = Integer.parseInt(ids);
                int i = advertisementMapper.deleteByPrimaryKey(id);
                if (i == 1) {
                    return ResponseWrapper.markSuccess(i);
                } else {
                    return ResponseWrapper.markError();
                }
            }

        }
    }

    /**
     * @Descripton 多重查询
     * @param number
     * @param category
     * @param displayorder
     * @param title
     * @param pageNum
     * @return
     */
    public ResponseWrapper getAdvertisementBySearch(String number, String category, String displayorder, String title, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Advertisement> advertisements = advertisementMapper.getAdvertisementBySearch(number,category,displayorder,title);
        PageInfo advertisementpage = new PageInfo(advertisements,10);
        return ResponseWrapper.markSuccess(advertisementpage);
    }

    public ResponseWrapper getAdvePicByCategory(String category){
        List<Advertisement> advertisements = advertisementMapper.getAdvePicByCategory(category);
        return ResponseWrapper.markSuccess(advertisements);
    }
}
