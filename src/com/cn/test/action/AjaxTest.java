package com.cn.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by lijunhong on 16/8/30.
 */
@Controller
@RequestMapping("/jquery")
public class AjaxTest {

    @RequestMapping("/name")
    public String jquery(){
        return "jquery/name";
    }

    @RequestMapping(value = "/getName",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public void getName(String name, PrintWriter printWriter, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
        System.out.println(name);
//        response.setContentType("text/html;charset=utf-8");
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("utf-8");
        printWriter.write("name="+name);
        printWriter.write("发送数据到页面上");
//        return "jquery/name";
    }
}
