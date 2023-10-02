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


    //로그인 실행 컨트롤러
    @PostMapping("/login")
    public String POSTLogin(@ModelAttribute("memberDTO") MemberDTO memberDTO, HttpSession session, Model model) {

        // MemberService를 통해 로그인 시도
        MemberDTO member = memberService.memberLogin(memberDTO);
        System.out.println("멤버 : " + member);

        // 아이디와 비밀번호 필드가 비어 있는지 확인
        if (StringUtils.isBlank(memberDTO.getUserId()) || StringUtils.isBlank(memberDTO.getUserPw())) {
            model.addAttribute("errorMessage", "로그인 실패: 아이디와 비밀번호를 입력하세요.");
            return "/member/login";
        }

        // 회원정보가 존재하지 않거나 비밀번호 불일치시 실패 메시지 출력
        if (member == null) {
            System.out.println("로그인 실패: 존재하지 않는 사용자 ID");
            model.addAttribute("errorMessage", "로그인 실패: 잘못된 사용자 ID입니다.");
            return "/member/login";
        }

        // 사용자가 제출한 비밀번호를 암호화하여 비교
        if (!passwordEncoder.matches(memberDTO.getUserPw(), member.getUserPw())) {
            System.out.println("로그인실패임?");
            model.addAttribute("errorMessage", "로그인 실패: 잘못된 비밀번호입니다.");
            return "/member/login";
        }

        // 로그인 성공시, 세션에 회원 정보 저장
        session.setAttribute("member", member);
        System.out.printf("%s 님이 로그인하셨습니다.%n", member.getUserId());
        return "redirect:/main";
    }


    //로그아웃
    @GetMapping("/logout")
    public String GETLogout(HttpServletRequest httpServletRequest){
        log.info("로그아웃 메서드 진입");

        HttpSession session = httpServletRequest.getSession();

        session.invalidate();

        return "redirect:/main";
    }

    //비동기 로그아웃
    @PostMapping("/logout")
    @ResponseBody
    public void POSTLogout(HttpServletRequest httpServletRequest){
        log.info("비동기 로그아웃 메서드 진입");

        HttpSession session = httpServletRequest.getSession();

        session.invalidate();
    }

}