package com.hw1.model.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.hw1.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	public void mainMenu() {
		/*
		도서 관리 프로그램에 해당하는 메인 메뉴
		출력, 각 메뉴에 해당하는 메소드 실행
		*/
		do {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.print("메뉴 번호 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					insertBook();
					break;
				case 2:
					deleteBook();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					selectList();
					break;
				case 0:
					System.out.println("프로그램 종료");
					return;
				default:
					break;
			}
		}while(true);

	}
	
	public void insertBook() {
		/*
		제목, 카테고리, 저자명을 키보드로 입력 받
		고 입력 받은 값을 가지고 Book객체 생성
		생성한 Book 객체를 BookManager의
		insertBook 메소드로 전달
		*/
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt();
		sc.nextLine();//버퍼 비우기
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author);
		bm.insertBook(book);
	}
	
	public void deleteBook() {
		/*
		삭제할 도서 번호를 키보드로 입력 받아
		BookManager의 deleteBook 메소드로 전달
		 리턴 받은 결과 값을 가지고
		성공, 실패 여부 출력
		*/
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();//버퍼 비우기
		int result = bm.deleteBoiok(bNo);
		switch(result) {
			case 0://실패
				System.out.println("삭제할 도서가 존재하지 않습니다.");
				break;
			case 1://성공
				System.out.println("성공적으로 삭제");
				break;
			default:
				break;
		}
	}
	
	public void searchBook() {
		// “도서 제목 : “ >> 입력 받음 (title)
		// BookManager의 searchBook 메소드로 title 전달
		//  리턴 값 전달 받음 (searchList)
		// searchList가 비어 있을 경우 >> “검색 결과가 존재하지 않습니다.”출력
		// searchList가 비어있지 않을 경우 >> for문을 이용하여 searchList 출력
		System.out.print("도서 제목 : ");
		String tilte = sc.nextLine();
		ArrayList<Book> searchList = bm.searchBook(tilte);
		for(Book b : searchList) {
			System.out.println(b);
		}
	}
	
	public void selectList() {
		// BookManager의 selectList() 메소드 호출
		//  리턴 값 전달 받음 (bookList)
		ArrayList<Book> bookList = bm.selectList();
		if(bookList.size() == 0) {
			// bookList가 비어 있을 경우 >> “도서 목록이 존재하지 않습니다.”출력
			System.out.println("도서 목록이 존재하지 않습니다.");
		}else {
			// bookList가 비어있지 않을 경우 >> for loop문을 이용하여 bookList 출력
			//							>> 또는 for each 문 이용하여 출력
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
		
		
	}
	
}
