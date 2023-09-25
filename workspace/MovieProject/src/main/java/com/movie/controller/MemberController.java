package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.movie.domain.dto.MemberDTO;
import com.movie.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//회원가입 페이지 이동
	@GetMapping("/joinEx")
	public void GETJoin() {
		
		log.info("회원가입 페이지 진입");
	}
	
	//회원가입서비스실행
	@PostMapping("/joinEx")
	public String POSTJoin(MemberDTO memberDTO) throws Exception {
		
		memberService.memberJoin(memberDTO);
		return "redirect:/main";
	}
	
//	//아이디 중복검사
//	@PostMapping("/memberIdChk")
//	@ResponseBody
//	public String POSTmemberIdChk(String memberId) throws Exception{
//		
//		int result = member
//	}

}
