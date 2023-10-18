package com.movie.service;

import com.movie.domain.dto.MemberDTO;

public interface MemberService {
	
	
	//회원가입
	public void memberJoin(MemberDTO memberDTO) throws Exception;
	
	//아이디 중복검사
	public String idCheck(String memberId);
	
	//로그인
	public MemberDTO memberLogin(MemberDTO memberDTO);
	

}
