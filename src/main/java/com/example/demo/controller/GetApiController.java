package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")

public class GetApiController {


    private String name;
    private String email;
    private String stuNo;

    @RequestMapping(method = RequestMethod.GET)
    public String getUser(){
        return name+"님의 정보 학번:"+stuNo+" 이메일 :"+email;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String setUser(String name, String email, String stuNo){
        System.out.println(name+" "+email+" "+stuNo);

        this.email=email;
        this.stuNo=stuNo;
        this.name=name;

        return "ok";
    }


}
