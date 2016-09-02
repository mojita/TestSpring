package com.cn.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijunhong on 16/8/29.
 */
@Controller
@RequestMapping("/testAction")
public class TestAction {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("asdkasdjasdjaskdja");
        return "hello";
    }

}

