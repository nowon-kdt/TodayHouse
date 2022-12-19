package com.green.nowon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.green.nowon.entity.MemberEntity;
import com.green.nowon.service.MemberService;

@Controller
public class AdminController {
	@Autowired
	MemberService memberService;
	
   @GetMapping("/admin")
   public String admin() {
      return "admin/default";
   }
   
   @GetMapping("/admin/main1")
   public String main1() {
      return "admin/adminMain1";
   }
   
   @GetMapping("/admin/main2")
   public String main2() {
      return "admin/adminMain2";
   }
   
   @GetMapping("/admin/main2/reg")
   public String main2Reg() {
      return "admin/adminMain2Reg";
   }
   
   @GetMapping("/admin/main3")
   public String main3() {
      return "admin/adminMain3";
   }
   
   @GetMapping("/admin/order")
   public String order() {
      return "admin/adminOrderList";
   }
   
   @GetMapping("/admin/order/reg")
   public String reg() {
      return "admin/adminOrder";
   }
   
   @GetMapping("/admin/request")
   public String requestList() {
      return "admin/adminRequestList";
   }
   
   @GetMapping("/admin/request/bno")
   public String request() {
      return "admin/adminRequest";
   }
   
   @GetMapping("/admin/review")
   public String reviewList() {
      return "admin/adminReviewList";
   }
   
   @GetMapping("/admin/review/bno")
   public String review() {
      return "admin/adminReview";
   }
   
   @GetMapping("/admin/interior")
   public String interiorList() {
      return "admin/adminInteriorList";
   }
   
   @GetMapping("/admin/interior/bno")
   public String interior() {
      return "admin/adminInterior";
   }
   
   //회원정보뿌리기
   @GetMapping("/admin/member")
   public String memberList(Model model) {
	   List<MemberEntity> memberLists = memberService.getList();
	   model.addAttribute("memberLists",memberLists);
      return "admin/adminMemberList";
   }
   
   //상세회원정보
   @GetMapping("/admin/member/{mno}")
   public String member(Model model) {
	   List<MemberEntity> memberLists = memberService.getList();
	   model.addAttribute("memberLists",memberLists);
      return "admin/adminMember";
   }

}
