package com.example.demo.configuration.auth;


import com.example.demo.domain.dto.MemberDTO;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

@Service
public class PrincipalDetailsService implements UserDetailsService {

	@Autowired
	private MemberMapper memberMapper;

	@Autowired
	private MemberService memberService;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if(username == null || username.isEmpty()){
			throw new UsernameNotFoundException("Username is empty");
		}

		MemberDTO memberDTO = memberService.getMember(username);

		if( memberDTO == null){
			throw new UsernameNotFoundException("Could not find user");
		}

		// USERROLE 값에 따라 권한 부여
		List<GrantedAuthority> authorities = new ArrayList<>();
		if (memberDTO.getUserRole() == 1) {  // 관리자
			authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		} else {  // 일반 유저
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		}

		// UserDetails 객체 생성 시 권한 정보 추가
		return new User(memberDTO.getUserName(), memberDTO.getUserPw(), authorities);
	}







}
