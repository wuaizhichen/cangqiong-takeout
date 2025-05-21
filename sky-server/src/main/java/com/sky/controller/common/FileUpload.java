package com.sky.controller.common;

import com.sky.result.Result;
import com.sky.service.FileUploadService;
import io.minio.errors.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author 君禾
 * @version 1.0
 */
@RestController
@Api(tags = "上传文件")
@RequestMapping("/admin/common")
public class FileUpload {
    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/upload")
    @ApiOperation("上传文件")
    public Result upload(@RequestParam("file") MultipartFile file) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        String url = fileUploadService.upload(file);
        return Result.success(url);
    }
}
