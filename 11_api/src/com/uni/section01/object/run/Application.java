package com.uni.section01.object.run;

import com.uni.section01.object.book.Book;

public class Application {

	public static void main(String[] args) {
		Book book1 = new Book(1, "언어의 온도", "이기주", 50000);
		Book book2 = new Book(2, "개미", "베르나르", 30000);
		Book book3 = new Book(3, "개미", "베르나르", 30000);
		
		// toString() 오버라이딩 전 : 인스턴스가 생성될 때 사용한 full class name과 @ 그리고 16진수 해쉬코드가 문자열 반환
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
	}

}
