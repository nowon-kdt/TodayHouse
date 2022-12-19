package com.green.nowon.security;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.green.nowon.entity.MemberEntity;

import lombok.Getter;

@Getter
public class MyUserDetails extends User {

	private String email;
	private String name;
	private String nickName;
	
	//principal 객체에 들어가게된다 .
	public MyUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		
	}
	
	public MyUserDetails(MemberEntity entity) {
		this(entity.getEmail(),entity.getPass(),entity.getRoles() //Set<MyRole> --> Set<GrantedAuthority>
				.stream() 
				.map(myRole->new SimpleGrantedAuthority(myRole.getRole()) )// Set<GrantedAuthority>
				.collect(Collectors.toSet()));
		//this는 무조건 생성자에 첫번째 위치 줄에 있어야한다. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
		this.email=entity.getEmail();
		this.name=entity.getName();
		this.nickName=entity.getNickName();//null이 허용되어있기때문에
	}

}
