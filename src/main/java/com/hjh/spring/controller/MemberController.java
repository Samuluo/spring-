package com.hjh.spring.controller;

import com.hjh.spring.pojo.HobbyToId;
import com.hjh.spring.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Controller
public class MemberController implements WebMvcConfigurer {
    @Autowired
    HobbyToId hobbyToId;
    /*@Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/results").setViewName("results");
    }
    @GetMapping("/")
    public String showForm(Student student){
        return "Search";
    }
    @PostMapping("/")
    public String checkPersonInfo(String hobby){
        return hobbyToId.selectid(hobby).getStu_id();
    }*/
    @RequestMapping("/hobby")
    @ResponseBody
    public String Search(String hobby){
        if (hobbyToId.selectid(hobby)==null){
            return "查无此人！";
        }
        Student sd = hobbyToId.selectid(hobby);
        return "学号："+sd.getStu_id()+"\n姓名："+sd.getName()+"\n爱好："+sd.getHobby()+"\n出生年月："+sd.getBirthdate();
    }
    @RequestMapping("/dwf")
    public String Serach(String asd){
        return "index";
    }
}
