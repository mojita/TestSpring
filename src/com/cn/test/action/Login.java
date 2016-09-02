package com.cn.test.action;

import com.cn.test.domain.Person;
import com.cn.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lijunhong on 16/8/30.
 */
@Controller
//@RequestMapping("/login")
public class Login {

    @RequestMapping("/loginView")
    public String loginOne(){
        System.out.println("adasdasd");
        return "login";
    }

    @RequestMapping("/login")
    public String loginTwo(@RequestParam("username") String username,@RequestParam("password") String password, HttpServletRequest request){
        if("admin".equals(username)&&"admin".equals(password)){
            return "loginSuccess";
        }
        return "loginError";
    }

    @RequestMapping("/login1")
    public ModelAndView loginThree(@RequestParam("username") String username,@RequestParam("password") String password,HttpServletRequest request){
        
        if(!"admin".equals(username)&&!"admin".equals(password)){
            return new ModelAndView("loginError");
        }

        System.out.println(new ModelAndView((new RedirectView("../index.jsp"))).toString());
//        return new ModelAndView(new RedirectView(""));
        return new ModelAndView("loginSuccess");
    }


    @RequestMapping("/login2")
    public ModelAndView loginFour(User user){
        String username = user.getUsername();
        String password = user.getPassword();

        if("admin".equals(username)&&"admin".equals(password)){
            return new ModelAndView("loginSuccess");
        }
        return new ModelAndView("loginError");
    }

    @RequestMapping("/user")
    public String user(User user, Person person){
        System.out.println(user.getUsername()+":"+user.getPassword()+":"+user.getNum());
        System.out.println(person.getUsername()+":"+person.getPassword()+":");
        return "loginSuccess";
    }





    //测试ajax访问
//    @RequestMapping("/getUsername")
//    public String testAjax(String username,String password){
//
//        return "loginSuccess";
//    }

}
