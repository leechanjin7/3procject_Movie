package com.movie.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.domain.dto.MemberDTO;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class MemberServiceTests {
	
	@Autowired
	private MemberService memberService;
	
	@Test
	public void memberJoinTest() throws Exception{
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setUserId("테스트2");
		memberDTO.setUserPw("테스트2");
		memberDTO.setUserName("테스트2");
		memberDTO.setUserBirth("테스트생일2");
		memberDTO.setUserGender("남");
		memberDTO.setUserAddr("테스트주소2");
		memberDTO.setUserPhone("테스트 번호2");
		
		memberService.memberJoin(memberDTO);
	}

}
