package com.rakesh.studentMicroService.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.rakesh.studentMicroService.entity.studentlogin;
import com.rakesh.studentMicroService.repository.studentloginrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class customuserdetails implements UserDetails{
	
	private String username;
	private String password;
	private List<GrantedAuthority> authorities;
	
	public customuserdetails(studentlogin user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}
	
	public customuserdetails() {
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
//		return studentloginrepo.getpassword(this.username);
		return password;
//		return "1234";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
