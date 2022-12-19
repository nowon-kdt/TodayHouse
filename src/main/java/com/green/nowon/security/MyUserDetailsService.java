package com.green.nowon.security;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.green.nowon.repository.MemberRepository;

import lombok.extern.log4j.Log4j2;



@Log4j2
public class MyUserDetailsService implements UserDetailsService {
	 
	
	@Autowired
	private MemberRepository repo;
	
	//DB테이블에서 인증처리하기위한 메서드
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return new MyUserDetails(repo.findByEmailAndSocialAndDeleted(username,false , false).orElseThrow(
				()->new UsernameNotFoundException("존재하지않는 이메일입니다.")));//noSuchElementException
				
	
	}

	
	
	
	
	
	
	
	
	
	
	
}
