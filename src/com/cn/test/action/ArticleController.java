package com.cn.test.action;

import com.cn.test.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lijunhong on 16/8/31.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/list")
    public String list(){
        System.out.println("文章");
        return "/article/list";
    }

    @RequestMapping("/books/{id}")
    public ModelAndView books(@PathVariable int id){
        ModelAndView mav = new ModelAndView();
        if(id==1){
            mav.addObject(new Article("文章一内容","文章一"));
            mav.setViewName("/article/books1");
        }else if(id==2){
            mav.addObject(new Article("文章二内容","文章二"));
            mav.setViewName("/article/books2");
        }
        return mav;
    }

}
