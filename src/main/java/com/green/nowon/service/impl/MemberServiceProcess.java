package com.green.nowon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.green.nowon.dto.MemberInsertDTO;
import com.green.nowon.entity.MemberEntity;
import com.green.nowon.entity.THRole;
import com.green.nowon.repository.MemberRepository;
import com.green.nowon.service.MemberService;

@Service
public class MemberServiceProcess implements MemberService {

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Override
	public void save(MemberInsertDTO dto) {
		memberRepository.save(dto.toEntity(passwordEncoder).addRole(THRole.USER));
	}


	@Override
	public List<MemberEntity> getList() {
		return memberRepository.findAll();
	}

	
}
