package com.example.demo.model;

import lombok.Data;

@Data
public class MemberVO {
    

	int id;
    String username;
    String password;
    String firstName;
    String lastName;
    int age;
    int salary;
}
