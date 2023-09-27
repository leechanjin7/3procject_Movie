package com.example.demo.mapper;


import com.example.demo.domain.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTests {

    @Autowired
    private MemberMapper memberMapper;


    @Test
    public void memberJoinTest() {

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setUserId("test1");
        memberDTO.setUserPw("test1");
        memberDTO.setUserName("test1");
        memberDTO.setUserAddr1("test1");
        memberDTO.setUserAddr2("test1");
        memberDTO.setUserAddr3("test1");
        memberDTO.setUserPhone(String.valueOf(122222));

        memberMapper.memberJoin(memberDTO);
    }

    @Test
    public void memberLogin(){

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setUserId("admin");
        memberDTO.setUserPw("1234");

        memberMapper.memberLogin(memberDTO);
        log.info("결과 값 : " + memberMapper.memberLogin(memberDTO));
    }

}
