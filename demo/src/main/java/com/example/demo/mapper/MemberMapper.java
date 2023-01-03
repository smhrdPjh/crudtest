package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.model.MemberVO;


@Mapper
public interface MemberMapper {
    
    @Select("select * from users")
	public MemberVO users();

    @Insert("insert into users(username, password, firstName, lastName, age, salary) values(null, #{username}, #{password}, #{firstName}, #{lastName}, #{age}, #{salary} )")
    
    public void insertUser(MemberVO user);

    
}
