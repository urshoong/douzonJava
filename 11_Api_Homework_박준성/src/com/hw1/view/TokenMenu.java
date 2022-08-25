package com.hw1.view;

import java.util.Scanner;

import com.hw1.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	//메인 메뉴 출력
	public void mainMenu() {
		do {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					tokenMenu();
					break;
				case 2:
					inputMenu();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					break;
			}
		}while(true);
	}
	
	//토큰 결과 출력
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String after = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + after);
		System.out.println("토큰 처리 후 개수 : " + after.length());
		System.out.println("모두 대문자로 변환 : " + after.toUpperCase());
	}
	
	//첫 글자 대문자, 문자 개수 결과 출력
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String input1 = sc.nextLine();
		String firstCap = tc.firstCap(input1);
		System.out.println("첫 글자 대문자 : " + firstCap);
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char input2 = sc.next().charAt(0);
		int findChar = tc.findChar(input1, input2);
		System.out.println(input2 + " 문자가 들어간 개수 : " + findChar);
	}
}
