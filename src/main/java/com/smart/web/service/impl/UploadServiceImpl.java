package com.smart.web.service.impl;

import cn.hutool.core.date.DateUtil;
import com.smart.web.common.FileUtils;
import com.smart.web.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

/**
 *
 */
@Service
public class UploadServiceImpl implements UploadService {
    @Override
    public String upload(MultipartFile multipartFile) throws IOException {
//        根路径+图片保存路径+图片名
        // 返回数据库保存路径
        //1.png
        String imageNewName = FileUtils.getImageNewName(Objects.requireNonNull(multipartFile.getOriginalFilename()));
//        upload/images/20210204/
        String savePath = String.format("%s%s%s", FileUtils.IMG_SAVE_PATH, File.separator, DateUtil.format(new Date(), "yyyyMMdd"));

        File file = new File(String.format("%s%s", FileUtils.ROOT_PATH, savePath), imageNewName);
        if (!file.exists()) {
            file.mkdirs();
        }
        multipartFile.transferTo(file);
        return savePath + File.separator + imageNewName;
    }
}
