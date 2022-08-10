package com.uni.section06.termary_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/*
		 * * 삼항 연산자 : 항목이 3개인 연산자
		 * [표현법] 조건식 ? 조건식이 참일경우의 값1 : 조건식이 거짓일경우의 값2
		 * 
		 * 이때, 조건식은 반드시 true 또는 false가 나오게끔 작성해야된다. 
		 * 주로 조건식에는 비교, 논리 연산자가 사용된다.
		 */
		
		int num1 = 10;
		int num2 = -10;
		String result1 = (num1 > 0) ? "양수다." : "양수가 아니다.";
		String result2 = (num2 > 0) ? "양수다." : "양수가 아니다.";
		System.out.println("num1은 : " + result1);
		System.out.println("num2는 : " + result2);
		
		/* 중첩 사용 */
		int num3 = 5;
		int num4 = 0;
		int num5 = -5;
		
		String result3 = (num3 > 0) ? "양수다." : (num3 == 0) ? "0이다." : "음수다.";
		String result4 = (num4 > 0) ? "양수다." : (num4 == 0) ? "0이다." : "음수다.";
		String result5 = (num5 > 0) ? "양수다." : (num5 == 0) ? "0이다." : "음수다.";
		System.out.println("num3은 : " + result3);
		System.out.println("num4은 : " + result4);
		System.out.println("num5은 : " + result5);
		
		
		int x = 1;
		int y = 2;

		int result = x > y ? ++x : --y;
		System.out.println("result의 결과 : " + result);
	}

}
