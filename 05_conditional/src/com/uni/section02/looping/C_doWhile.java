package com.uni.section02.looping;

import java.util.Scanner;

public class C_doWhile {
	/**
	 * * do-while문
	 * 
	 * [초기식]
	 * 
	 * do{
	 *	반복적으로 실행할 코드;
	 * 
	 *	[증감식]
	 * 
	 * }while(조건식); 
	 * 
	 * 
	 * 초기식  --> 무조건 한번은 실행 --> 증감식 
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> false일 경우 빠져나감
	 * 
	 * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데
	 * do while문은 첫 실행은 조건식없이 무조건 수행된다는 점
	 * 
	 */
	
	public void testSimpleDoWhileStatement() {
		do {
			System.out.println("최초 한번 동작함");
		}while(false);
		
		System.out.println("반복문종료확인");
	}
	
	/**<pre>
	 * do-while문 연습을 위한 예제1
	 * 입력한 문자열을 반복적으로 출력한다.
	 * 단, exit가 입력되면 반복을 멈춘다.
	 * </pre>
	 */
	public void testDoWhileExample1() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println(str);
		}while(!str.equals("exit"));
		
		System.out.println("반복문종료확인");
		
		sc.close();
	}
}
