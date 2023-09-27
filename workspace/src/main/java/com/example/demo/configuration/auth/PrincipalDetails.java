package com.example.demo.configuration.auth;


import com.example.demo.domain.dto.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrincipalDetails implements UserDetails {

	private MemberDTO dto;


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		Collection<GrantedAuthority> collection = new ArrayList();

		collection.add(new GrantedAuthority(){
			@Override
			public String getAuthority() {
				if(dto.getUserRole()==0)
					return "ROLE_USER";
				else
					return "ROLE_ADMIN";
			}

		} );

		return collection;

	}

	@Override
	public String getPassword() {
		return dto.getUserPw();
	}

	@Override
	public String getUsername() {
		return dto.getUserId();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
