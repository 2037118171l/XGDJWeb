package com.xgdjweb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.Pictureupload;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.PictureuploadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class PicService {
    @Value("${prop.upload-folder}")
    private String setPath;
    @Autowired
    PictureuploadMapper pictureuploadMapper;

    public ResponseWrapper addPic(Pictureupload pictureupload){
        if (pictureupload == null){
            return ResponseWrapper.markError();
        }else {
            int i = pictureuploadMapper.insertSelective(pictureupload);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public ResponseWrapper deletePic(String pid){
        if (pid == null){
            return ResponseWrapper.markError();
        } else {
//                单个删除
                Integer id = Integer.parseInt(pid);
                Pictureupload pictureupload = pictureuploadMapper.selectByPrimaryKey(id);
                String picName =pictureupload.getPicturename();
                String filePath = setPath+"\\picture\\"+picName;
                File file = new File(filePath);
                boolean flag = file.delete();
                int i = pictureuploadMapper.deleteByPrimaryKey(id);
                if (i == 1) {
                    return ResponseWrapper.markSuccess(i);
                } else {
                    return ResponseWrapper.markError();
                }
            }
        }

    public ResponseWrapper updatePic(Pictureupload pictureupload){
        if (pictureupload == null){
            return ResponseWrapper.markError();
        }else {
            int i = pictureuploadMapper.updateByPrimaryKeySelective(pictureupload);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public ResponseWrapper findPic(Integer pageSize,Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<Pictureupload> pictureuploads = pictureuploadMapper.findPic();
        PageInfo pictureupload = new PageInfo(pictureuploads,10);
        return ResponseWrapper.markSuccess(pictureupload);
    }

}
