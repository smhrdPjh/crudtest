package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.demo.model.MemberVO;
import com.example.demo.service.MemberService;

@CrossOrigin
@RestController("/user")
@SpringBootApplication
@EnableWebMvc
public class MemberController {

    @Autowired
    private MemberService memberService;

   
	@GetMapping
    public MemberVO checkMembers(){

        return memberService.users();      
                   
    }
    
    @PostMapping
    void insertUser(@RequestBody MemberVO user) {
        memberService.insertUser(user);
   
       

    }
    
    
}
