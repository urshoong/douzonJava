package com.uni.section02.uses;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberManager memberManager = new MemberManager();
		MemberDTO[] members = null;
		
		menu:
		while(true) {
			System.out.println("=====회원관리프로그램=====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원 전체조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1:
					members = memberManager.signUpMembers();
					break;
				case 2:
					memberManager.printAllMember(members);
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break menu;
				default:
					System.out.println("잘못된 번호를 입력하셨습니다.");
					break;
			}
		}
		
		sc.close();
	}

}
