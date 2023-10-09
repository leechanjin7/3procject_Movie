package com.example.demo.controller;

import com.example.demo.domain.dto.MemberDTO;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collections;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private PasswordEncoder passwordEncoder;



    //회원가입 페이지 이동
    @GetMapping("/join")
    public void GETJoin() {

        log.info("회원가입 페이지 진입");
    }

    //로그인 페이지 이동
    @GetMapping("/login")
    public void GETLogin(){

        log.info("로그인 페이지 진입");
    }

    //회원가입서비스실행
    @PostMapping("/join")
    public String POSTJoin(MemberDTO memberDTO) {
        try{

            // 비밀번호를 BCrypt로 해싱하여 저장
            String encodedPassword = passwordEncoder.encode(memberDTO.getUserPw());
            memberDTO.setUserPw(encodedPassword);

            //회원 가입 서비스 호출
            memberService.memberJoin(memberDTO);
            //redirectAttributes.addFlashAttribute("message", "회원가입이 성공적으로 완료되었습니다.");
            return "/member/login";
        }catch (Exception e){
            //redirectAttributes.addFlashAttribute("error", "회원 가입 중 오류가 발생했습니다. 다시 시도해주세요");
            return "/member/join";
        }

    }

	//아이디 중복검사
	@PostMapping("/memberIdChk")
	@ResponseBody
	public String POSTmemberIdChk(String userId) throws Exception{

		int result = memberService.idCheck(userId);

//        log.info("결과값 : " + result);

        if(result != 0 ){
            return "fail";  //중복아이디 존재
        }else{
            return "success";   //중복 아이디 x
        }
	}

//    @PostMapping("/login.do")
//    public String POSTLogin(HttpServletRequest request, MemberDTO memberDTO, RedirectAttributes rttr) throws Exception{
//
//        HttpSession session = request.getSession();
//        MemberDTO member = memberService.memberLogin(memberDTO);
//
//        if(member == null){
//            int result = 0;
//            rttr.addFlashAttribute("result", result);
//            log.info("로그인 실패!");
//            return "redirect:/member/login";
//        }
//        session.setAttribute("member", member);
//        log.info("로그인 성공!");
//        return "redirect:/main";
//    }
//
//
//
//    //로그아웃
//    @GetMapping("/logout")
//    public String GETLogout(HttpServletRequest httpServletRequest){
//        log.info("로그아웃 메서드 진입");
//
//        HttpSession session = httpServletRequest.getSession();
//
//        session.invalidate();
//
//        return "redirect:/main";
//    }
//
//    //비동기 로그아웃
//    @PostMapping("/logout")
//    @ResponseBody
//    public void POSTLogout(HttpServletRequest httpServletRequest){
//        log.info("비동기 로그아웃 메서드 진입");
//
//        HttpSession session = httpServletRequest.getSession();
//
//        session.invalidate();
//    }



}