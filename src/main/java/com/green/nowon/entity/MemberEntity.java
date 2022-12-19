package com.green.nowon.entity;

import javax.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="gen_mem", sequenceName = "th_mem", initialValue = 1, allocationSize = 1)
@Table(name="TH_member") 
@Entity
public class MemberEntity {
   
   @GeneratedValue(generator = "gen_mem", strategy = GenerationType.SEQUENCE)  //key 설정
   @Id
   private long mno; // 회원번호
   
   @Column(unique = true, nullable = false)
   private String email;  //아이디
   
   @Column(nullable = false)
   private String pass; //비밀번호
   
   @Column(nullable = false)
   private String name;  //이름이랑 별명
  
   @Column( nullable = false)
   private long phone;
   
   //@Column()
   private String nickName;
   
   private boolean social; //소셜 유저인지 여부확인 
   
   private boolean deleted; //탈퇴 여부 확인

   
   @CollectionTable(name = "th_role")
   @Builder.Default
   @Enumerated(EnumType.STRING) //설정하지 않으면 숫자(ORDINAL)
   @ElementCollection(fetch = FetchType.EAGER)   //1:N 관계
   Set<THRole> roles=new HashSet<>();
   
   public MemberEntity addRole(THRole role ) {
      roles.add(role);
      return this;
   }
}