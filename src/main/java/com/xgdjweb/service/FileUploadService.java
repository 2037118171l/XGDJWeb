package com.xgdjweb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgdjweb.bean.Fileupload;
import com.xgdjweb.bean.Pictureupload;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.FileuploadMapper;
import com.xgdjweb.dao.PictureuploadMapper;
import com.xgdjweb.bean.Fileupload;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.dao.FileuploadMapper;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class FileUploadService {
    @Autowired
    FileuploadMapper fileuploadMapper;

    @Autowired
    PicService picService;

//    SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
//    private final String newDir = date.format(new Date()) + "/";
    @Value("${prop.upload-folder}")
    private String setPath;
    /**
     * 上传路径
     */
    private String uploadPath;
    /**
     * 返回路径
     */
    private String resPath;

    /**
     * @param path 需要遍历的路径
     * @return 路径下文件的名称集合
     */
    private static ArrayList<String> getFile(String path) {
        // 获得指定文件对象
        File file = new File(path);
        // 获得该文件夹内的所有文件
        File[] array = file.listFiles();
        ArrayList<String> list = new ArrayList<>();
        if (array != null) {
            for (File value : array) {
                list.add(value.getName());
            }
        }
        return list;
    }

    /**
     * @param names 文件下文件名的集合
     * @param name  存入的文件名
     * @param index 索引的开始位置
     * @return 符合要求的文件名
     */
    private static String checkFileName(ArrayList<String> names, String name, int index) {
        String indexName;
        if (index == 0 ) {
            indexName = name;
        } else {
            indexName = name.substring(0, name.indexOf(".")) + "(" + index + ")" +name.substring(name.indexOf("."));
        }
        if (names.contains(indexName)) {
            index +=1;
            name = checkFileName(names, name, index);
        } else {
            return indexName;
        }
        return name;
    }

    public ResponseWrapper fileUpload(MultipartFile file){

        /*文件存放位置*/
        /**
         * 文件上传地址
         */
        String filePath = "/file/";
        uploadPath = setPath + filePath;
        /*返回文件路径*/
        resPath = filePath;
        /*获取文件数组*/
        ArrayList<String> list = getFile(uploadPath);
        if (file.isEmpty()) {
            return ResponseWrapper.markCustom(false,400,"上传失败",null);
        }
        /*获取文件名*/
        String getFileName = file.getOriginalFilename();
        String fileName;
        File saveFile;
        if (list.size() == 0) {
            /*创建文件*/
            saveFile = new File(uploadPath, getFileName);
        } else {
            /*遍历所有文件夹，判断是否重名*/
            fileName = checkFileName(list, getFileName,0);
            /*创建文件*/
            saveFile = new File(uploadPath, fileName);
        }
        //判断文件父目录是否存在
        if (!saveFile.getParentFile().exists()) {
            saveFile.getParentFile().mkdirs();
        }
        try {
            file.transferTo(saveFile);
            Fileupload fileupload = new Fileupload();
            fileupload.setFilename(getFileName);
            fileupload.setFiletitle(getFileName);
            fileupload.setPutton(1);
            addFile(fileupload);
            System.out.println(saveFile.getParentFile().getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file.transferTo(saveFile);
            return ResponseWrapper.markCustom(true,200,"上传成功",null);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return ResponseWrapper.markCustom(false,400,"上传失败",null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return ResponseWrapper.markCustom(false,400,"上传失败",null);
        }
    }
    public ResponseWrapper picUpload(MultipartFile file) {
        /*文件存放位置*/
        String picPath = "/picture/";
        uploadPath = setPath + picPath;
        /*返回文件路径*/
        resPath = picPath;
        /*获取文件数组*/
        ArrayList<String> list = getFile(uploadPath);
        if (file.isEmpty()) {
            return ResponseWrapper.markCustom(false,400,"上传失败",null);
        }
        /*获取文件名*/
        String getFileName = file.getOriginalFilename();
        String fileName;
        File saveFile;
        if (list.size() == 0) {
            /*创建文件*/
            saveFile = new File(uploadPath, getFileName);
        } else {
            /*遍历所有文件夹，判断是否重名*/
            fileName = checkFileName(list, getFileName,0);
            /*创建文件*/
            saveFile = new File(uploadPath, fileName);
        }
        //判断文件父目录是否存在
        if (!saveFile.getParentFile().exists()) {
            saveFile.getParentFile().mkdirs();
            System.out.println(saveFile.getParentFile().getAbsolutePath());
        }
        try {
            BufferedImage read = ImageIO.read(file.getInputStream());
            //压缩图片后保存
            Thumbnails.of(file.getInputStream())
                    .size(read.getWidth(), read.getHeight())
                    .toFile(saveFile.getPath());
            Pictureupload pictureupload = new Pictureupload();
            pictureupload.setPicturetitle(getFileName);
            pictureupload.setPicturepath("http://123.56.84.99:8083/picture/"+getFileName);
            pictureupload.setPicturename(getFileName);
            pictureupload.setPutton("1");
            picService.addPic(pictureupload);
//            Pictureupload pic = null;
//            pic.setPicturepath(resPath);
//            pic.setPicturetitle(getFileName);
//            pictureuploadMapper.insertSelective(pic);
//            return ResponseWrapper.markSuccess(pic);
            return ResponseWrapper.markCustom(true,200,"上传成功",null);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return ResponseWrapper.markCustom(false,400,"上传失败",null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return ResponseWrapper.markCustom(false,400,"上传失败",null);
        }
    }

    /**
     * @Description：查询数据库的所有文件
     * @date：2020/9/5 1：22
     * @return
     */
    public ResponseWrapper findAll(Integer pageSize,Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Fileupload> fileuploads = fileuploadMapper.findAll();
        PageInfo fileupload = new PageInfo(fileuploads, 10);
        return ResponseWrapper.markSuccess(fileupload);
    }
    public ResponseWrapper findAll(){
        List<Fileupload> fileuploads = fileuploadMapper.findAll();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("fileuploads",fileuploads);
        return ResponseWrapper.markSuccess(map);
    }
    public ResponseWrapper addFile(Fileupload fileupload){
        if (fileupload == null){
            return ResponseWrapper.markError();
        }else {
            int i = fileuploadMapper.insert(fileupload);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public ResponseWrapper updateFile(Fileupload fileupload){
        if (fileupload == null){
            return  ResponseWrapper.markError();
        }else {
            int i = fileuploadMapper.updateByPrimaryKeySelective(fileupload);
            if (i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }
    public ResponseWrapper deleteFile(Integer id){
        if (id == null){
            return  ResponseWrapper.markError();
        }else {
            Fileupload fileupload = fileuploadMapper.selectByPrimaryKey(id);
            String fileName =fileupload.getFilename();
            String filePath = setPath+"\\file\\"+fileName;
            File file = new File(filePath);
            boolean flag = file.delete();
            int i = fileuploadMapper.deleteByPrimaryKey(id);
            if(i == 1){
                return ResponseWrapper.markSuccess(i);
            }else {
                return ResponseWrapper.markError();
            }
        }
    }

}
