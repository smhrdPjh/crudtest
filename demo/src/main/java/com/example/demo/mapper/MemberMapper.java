package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.model.MemberVO;


@Mapper
public interface MemberMapper {
    
    @Select("select * from members")
	public MemberVO checkMembers();

    
}
