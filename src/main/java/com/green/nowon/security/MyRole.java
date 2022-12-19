package com.green.nowon.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //final필드를 파라미터로 구성하는 생성자
public enum MyRole {

	//Enum 

	USER("ROLE_USER"), //0
	ADMIN("ROLE_ADMIN"); //1

	private final String role;//"ROLE_USER" 애를 확인하고 싶어요  getRole()이런식으로 가져와야한다.

}


