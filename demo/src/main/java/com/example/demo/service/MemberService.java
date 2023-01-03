package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.MemberVO;

@Service
public class MemberService {


  
   @Autowired
   private MemberMapper memberMapper;
    public MemberVO users(){
        


        return memberMapper.users();
    }

    public void insertUser(MemberVO user){

         memberMapper.insertUser(user);

    }
  
   
    
    
}
