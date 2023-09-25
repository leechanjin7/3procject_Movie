package com.movie.domain.dto;

import lombok.Data;

@Data
public class MemberDTO {
	
//	회원 id
	private String userId;
//	회원 pw
	private String userPw;
//	회원 이름
	private String userName;
//	회원 생년월일
	private String userBirth;
//	회원 성별
	private String userGender;
//	회원 주소
	private String userAddr;
//	회원 전화번호
	private String userPhone;
//	회원, 관리자(0,1)
	private int role;
	

}
