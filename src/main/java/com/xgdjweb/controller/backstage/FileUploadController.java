package com.xgdjweb.controller.backstage;

import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.FileUploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Api(tags = "文件上传")
@RestController
public class FileUploadController {

    @Autowired
    FileUploadService fileUploadService;

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
    private ArrayList<String> allFile(String path) {
        // 获得指定文件对象
        File file = new File(path);
        // 获得该文件夹内的所有文件
        File[] array = file.listFiles();
        ArrayList<String> list = new ArrayList<>();
        if (array != null) {
            for (File value : array) {
                if (value.isFile()) {
                    list.add(value.getPath());
                } else {
                    ArrayList<String> list1 = allFile(path+ "/" +value.getName());
                    for (String s : list1) {
                        list.add(s);
                    }
                }
            }
        }
        return list;
    }

    @ApiOperation("查询该文件夹下的所有文件")
    @GetMapping("/allPic")
    private Map<Object,Object> allPic(String path) {
        // 获得指定文件对象
        String allPic = setPath + "/" + path;
        ArrayList<String> list = allFile(allPic);
        System.out.println(path);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("file",list);
        return map;
    }



    @ApiOperation("图片上传")
    @PostMapping("/picUpload")
    public ResponseWrapper picUpload(@RequestParam("file") MultipartFile file) {
       ResponseWrapper wrapper =fileUploadService.picUpload(file);
       return  wrapper;
    }

    @ApiOperation("文件上传")
    @PostMapping("/fileUpload")
    public ResponseWrapper fileUpload(@RequestParam("file") MultipartFile file) {
        ResponseWrapper wrapper = fileUploadService.fileUpload(file);
        return wrapper;
    }
    @ApiOperation("删除文档")
    @DeleteMapping("delFile")
    public ResponseWrapper deleteFile(@RequestParam(name = "id") Integer id){
        ResponseWrapper wrapper = fileUploadService.deleteFile(id);
        return wrapper;
    }
}
