package com.green.nowon.dto;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.green.nowon.entity.MemberEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberInsertDTO {
	
	
	private	long mno;
	private	String email;
	private	String pass;
	private	String name;
	private	String nickName;
		



	public MemberEntity toEntity(PasswordEncoder pe) {
		return MemberEntity.builder()
				.mno(mno)
				.email(email)
				.pass(pe.encode(pass))
				.name(name)
				.nickName(nickName)
				.build()
				;
	}

}
