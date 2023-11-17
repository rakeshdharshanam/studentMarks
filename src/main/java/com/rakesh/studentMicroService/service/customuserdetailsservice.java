package com.rakesh.studentMicroService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rakesh.studentMicroService.entity.studentlogin;
import com.rakesh.studentMicroService.repository.*;

@Service
public class customuserdetailsservice implements UserDetailsService{
	
	@Autowired
	studentloginrepo studentloginrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		studentlogin user  = studentloginrepo.getuser(username);
		return new customuserdetails(user);
	}

}
