package com.movie.mapper;

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
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper memberMapper;

	
	@Test
	public void memberJoinTest() {
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setUserId("관리자");
		memberDTO.setUserPw("테스트");
		memberDTO.setUserName("테스트");
		memberDTO.setUserBirth("테스트생일");
		memberDTO.setUserGender("남");
		memberDTO.setUserAddr("테스트주소");
		memberDTO.setUserPhone("테스트 번호");
		
		memberMapper.memberJoin(memberDTO);
	}

}
