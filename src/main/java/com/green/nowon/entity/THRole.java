package com.green.nowon.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public enum THRole {

		USER("Role_USER"),
		ADMIN("Role_ADMIN");
	
		private final String role;
	
}
