package com.smart.web.controller;

import com.smart.web.common.ResponseResult;
import com.smart.web.service.UploadService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;


@RestController
@RequestMapping("/admin")
public class MoviesController {
    /**
     * 文件上传
     * 1> 文件覆盖
     * 1.1> 对图片重命名
     * 1.2> 建立多级目录
     * 3> 图片的路径存入数据库
     *
     * @return
     */

    @Resource
    UploadService uploadService;
    @PostMapping("/upload")
    public ResponseResult<String> upload(@RequestParam("img") MultipartFile multipartFile) throws IOException {
        //  upload/images/20210204/1.png
        String savePath = uploadService.upload(multipartFile);
        //数据库保存的操作
        return ResponseResult.success(savePath);
    }

}
