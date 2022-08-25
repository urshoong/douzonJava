package com.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	public String afterToken(String str) {
		//공백을 토큰으로 처리 한 글자 반환
//		return str.replaceAll(" ", "");
		
		String result = "";
		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
		while(stringTokenizer.hasMoreTokens()) {
			result += stringTokenizer.nextToken();
		}
		return result;
	}
	
	public String firstCap(String input) {
		//매개변수로 받은 문자열의 첫 번째 글자를 대문자로 바꾼 문자열 반환
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	
	public int findChar(String input, char search) {
		//매개변수로 받은 문자열 중에서 매개변수로 들어온 문자가 몇 개 존재하는지 개수를 반환
		int count = 0;
		char[] str = input.toCharArray();
		for(char c : str) {
			if(c == search) count++;
		}
		return count;
	}
}
