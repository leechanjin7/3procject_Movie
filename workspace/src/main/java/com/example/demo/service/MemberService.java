package com.example.demo.service;

import com.example.demo.domain.dto.MemberDTO;
import com.example.demo.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    //회원가입
    public void memberJoin(MemberDTO memberDTO) {

        memberMapper.memberJoin(memberDTO);

    }

    //아이디 중복 조회
    public String idCheck(String memberId) {
        return memberMapper.idCheck(memberId);
    }

    //로그인
    public MemberDTO memberLogin(MemberDTO memberDTO) {
        return memberMapper.memberLogin(memberDTO);
    }



}