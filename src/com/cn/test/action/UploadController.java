package com.cn.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by lijunhong on 16/8/31.
 */
@Controller
public class UploadController {

    @RequestMapping("/file")
    public String file(){
        return "upload";
    }

    //单文件上传
    @RequestMapping("/upload")
    public String upload(@PathVariable("file1") MultipartFile file1, HttpServletRequest request)throws Exception{
        String filePath = request.getServletContext().getRealPath("/");
        System.out.println(filePath);
        file1.transferTo(new File(filePath+"upload/"+file1.getOriginalFilename()));

        return "success";
    }

    //多文件上传
    @RequestMapping("/upload2")
    public String upload2(@PathVariable("files") MultipartFile[] files,HttpServletRequest request)throws Exception{
        String filePath = request.getServletContext().getRealPath("/");
        System.out.println(filePath);
        for (MultipartFile file:files){
            file.transferTo(new File(filePath+"upload/"+file.getOriginalFilename()));

        }
        return "success";
    }
}
