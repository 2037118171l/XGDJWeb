package com.xgdjweb.controller.backstage;

import com.xgdjweb.bean.Fileupload;
import com.xgdjweb.config.ResponseWrapper;
import com.xgdjweb.service.FileUploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "file表内的增删改查")
@RequestMapping("/file")
@RestController
public class FileController {

    @Autowired
    FileUploadService fileUploadService;

    /**
     * @date: 2020/9/5 1:44
     * @return
     */
    @ApiOperation("查询所有文件")
    @GetMapping("/findAllFile")
<<<<<<< HEAD
    public ResponseWrapper findAllFile(@RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize,
                                       @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        ResponseWrapper wrapper = fileUploadService.findAll(pageSize,pageNum);
=======
    public ResponseWrapper findAllFile(){
        ResponseWrapper wrapper = fileUploadService.findAll();
>>>>>>> b2f9e720d20818178f86064ce3b8e29766351f2e
        return wrapper;
    }
    @ApiOperation("增加文件")
    @PostMapping("/addFile")
    public ResponseWrapper addFile(@RequestBody Fileupload fileupload){
        ResponseWrapper wrapper = fileUploadService.addFile(fileupload);
        return wrapper;
    }
    @ApiOperation("修改文件")
    @PutMapping("/updateFile")
    public ResponseWrapper updateFile(@RequestBody Fileupload fileupload){
        ResponseWrapper wrapper = fileUploadService.updateFile(fileupload);
        return wrapper;
    }
    @ApiOperation("删除文件")
    @DeleteMapping("/deleteFile")
    public ResponseWrapper daleteFile(@RequestParam(name = "id") Integer id){
        ResponseWrapper wrapper = fileUploadService.deleteFile(id);
        return wrapper;
    }
}
