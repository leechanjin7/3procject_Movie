package com.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.domain.dto.MemberDTO;
import com.movie.mapper.MemberMapper;

@Service
public class MemberServiceImple implements MemberService{
	
	@Autowired
	MemberMapper memberMapper;

	//회원가입
	@Override
	public void memberJoin(MemberDTO memberDTO) throws Exception{
		
		memberMapper.memberJoin(memberDTO);
		
	}

	//아이디 중복 조회
	@Override
	public String idCheck(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	//로그인
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
