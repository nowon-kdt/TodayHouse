package com.green.nowon.service;

import java.util.List;

import com.green.nowon.dto.MemberInsertDTO;
import com.green.nowon.entity.MemberEntity;

public interface MemberService {

	void save(MemberInsertDTO dto);

	List<MemberEntity> getList();

}
