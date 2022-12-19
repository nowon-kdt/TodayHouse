package com.green.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.dto.MemberInsertDTO;
import com.green.nowon.service.MemberService;
import com.green.nowon.service.impl.MemberServiceProcess;

@Controller
public class LogController {

	@Autowired
	MemberService service;
	
	@GetMapping("/member/login")
	public String login() {
		
		return "log/login";
	}
	
	
	//회원가입사이트이동
	@GetMapping("/member/signup")
	public String signup() {
		return "log/signup";
	}
	
	//회원가입시작
	@PostMapping("/member/signup")
	public String signup2(MemberInsertDTO dto) {
		service.save(dto);
		return "log/login";
	}
	
}
