package com.green.nowon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.green.nowon.entity.MemberEntity;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>{

	Optional<MemberEntity> findByEmailAndSocialAndDeleted(String username, boolean b, boolean c);

}
