package com.movie.mapper;

import com.movie.domain.dto.MemberDTO;

public interface MemberMapper {
	
	//회원가입
	public void memberJoin(MemberDTO memberDTO);
	
	//아이디 중복검사
	public String idCheck(String memberId);
	
	//로그인
	public MemberDTO memberLogin(MemberDTO memberDTO);
	
	

}
