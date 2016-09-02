package com.cn.test.action;

import com.cn.test.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijunhong on 16/8/30.
 */
@Controller
@RequestMapping("/student")
public class StduentControll {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1,"zhangsan",23));
        students.add(new Student(2,"zhangsan",21));
        students.add(new Student(3,"zhangsan",22));
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("students",students);
        mv.setViewName("student/list");
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView presave(@RequestParam(value = "id",required = false) String id){
        ModelAndView mv = new ModelAndView();
        if(id!=null){
            mv.addObject("student",students.get(Integer.parseInt(id)-1));
            mv.setViewName("student/update");
        }else{
            mv.setViewName("student/add");
        }
        return mv;
    }

    @RequestMapping("/add1")
    public String add1(Student student){
        students.add(student);
        return "redirect:list.do";
    }

//    @RequestMapping("/update")
//    public String update(){
//
//    }

}
