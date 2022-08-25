package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() {}
	
	public void spaceToUpper() {
		// 입력 받은 영문을 StringTokenizer와 StringBuilder를 사용 해
		// 띄어쓰기를 기준으로 띄어쓰기 이후 첫 영문을 대문자로 출력하는 메소드
		
		// 영문을 입력 받는다.
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String input = sc.nextLine();
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를 구성
		StringTokenizer st = new StringTokenizer(input, " ");
		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서 StringBuilder에 담아 출력
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			result.append(temp.substring(0, 1).toUpperCase());
			result.append(temp.substring(1));
			result.append(" ");
		}
		
		System.out.println(result);
	}
}
