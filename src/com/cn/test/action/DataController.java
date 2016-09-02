package com.cn.test.action;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lijunhong on 16/8/31.
 */
@Controller
@RequestMapping("/student")
public class DataController {


    @RequestMapping("/date")
    public String date(Date date){
        System.out.println(date);
        return "student/date";
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

}
