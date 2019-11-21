package com.naver.yh_park02.dao;

import java.util.Map;

import com.naver.yh_park02.domain.Member;

public interface MemberDao {
	
	
	//아이디 중복 검사를 수행해주는 메소드 - 데이터 조회 
	public String idCheck(String id);
	
	//회원가입을 처리하는 메소드 - 데이터삽입 
	public int insertMenmber(Member member);
	
	//로그인을 처리하는 메소드 
	//public Member login(String id, String pw);
	public Member login(Map<String, Object>map);
	

}
