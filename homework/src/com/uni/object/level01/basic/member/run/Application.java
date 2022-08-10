package com.uni.object.level01.basic.member.run;

import com.uni.object.level01.basic.member.model.dto.MemberDTO;

public class Application {

	public static void main(String[] args) {
		//getter를 이용해서 필드의 초기값 확인
		MemberDTO member = new MemberDTO();
		System.out.println(member.getId());
		System.out.println(member.getPwd());
		System.out.println(member.getName());
		System.out.println(member.getAge());
		System.out.println(member.getGender());
		System.out.println(member.getPhone());
		System.out.println(member.getEmail());
		//setter를 이용해서 필드 값 변경
		member.setId("user01");
		member.setPwd("pass01");
		member.setName("홍길동");
		member.setAge(20);
		member.setGender('남');
		member.setPhone("010-1234-5678");
		member.setEmail("hong@greedy.com");
		//getter를 이용해서 변경된 필드값 확인
		System.out.println("변경 후 " + member.getId());
		System.out.println("변경 후 " + member.getPwd());
		System.out.println("변경 후 " + member.getName());
		System.out.println("변경 후 " + member.getAge());
		System.out.println("변경 후 " + member.getGender());
		System.out.println("변경 후 " + member.getPhone());
		System.out.println("변경 후 " + member.getEmail());
	}

}
