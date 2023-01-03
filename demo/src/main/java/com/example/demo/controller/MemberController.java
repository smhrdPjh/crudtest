package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MemberVO;
import com.example.demo.service.MemberService;


@RestController
@SpringBootApplication
public class MemberController {

    @Autowired
    private MemberService memberService;

   
	@RequestMapping(value = "/checkmembers", method = RequestMethod.GET, produces = "application/json; charset=utf8")
    public void checkMembers(){

        MemberVO members = memberService.checkMembers();


         System.out.println("회원목록 :"+ members);
        // return members;

        

    }

    
    
}
