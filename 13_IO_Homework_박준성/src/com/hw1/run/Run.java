package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		do {
			// 반복문을 통한 메뉴 실행
			// "****** MyNote ******"
			// "1. 노트 새로 만들기" // fd.fileSave() 실행
			// "2. 노트 열기" // fd.fileOpen() 실행
			// "3. 노트 열어서 수정하기" // fd.fileEdit() 실행
			// "4. 끝내기"
			// "번호를 입력하세요 : "
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("번호를 입력하세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();//버퍼 비우기
			
			switch(menu) {
				case 1:
					fd.fileSave();
					break;
				case 2:
					fd.fileOpen();
					break;
				case 3:
					fd.fileEdit();
					break;
				case 4:
					System.out.println("프로그램 종료");
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
			
		}while(true);
	}
}
