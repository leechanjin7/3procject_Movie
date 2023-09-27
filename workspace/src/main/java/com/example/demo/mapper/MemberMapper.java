package com.example.demo.mapper;

import com.example.demo.domain.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    //회원가입
    public void memberJoin(MemberDTO memberDTO);

    //아이디 중복검사
    public String idCheck(String memberId);

    //로그인
    public MemberDTO memberLogin(MemberDTO memberDTO);



}