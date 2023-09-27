package com.example.demo.service;

import com.example.demo.domain.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberServiceTests {

    @Autowired
    private MemberService memberService;

    //로그인 테스트
    @Test
    public void memberLogin(){

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setUserId("admin");
        memberDTO.setUserPw("1234");

        memberService.memberLogin(memberDTO);
        log.info("결과 값 : " + memberService.memberLogin(memberDTO));
    }

    //아이디 중복검사
    @Test
    public void idCheck(){

        String id = "admin";
        String id2 = "encoding0";
        memberService.idCheck(id);
        memberService.idCheck(id2);

        log.info("결과 값 : " +memberService.idCheck(id) );
        log.info("결과 값 : " +memberService.idCheck(id2) );
    }
}
