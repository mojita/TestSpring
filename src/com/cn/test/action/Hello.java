package com.cn.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijunhong on 16/8/29.
 */
@Controller
public class Hello {

    @RequestMapping("/hello.do")
    public String hello(Model model){
        System.out.println("hello");
        model.addAttribute("message","呵呵哒");
        return "hello";
    }
}
