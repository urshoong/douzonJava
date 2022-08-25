package com.hw3.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

import com.hw3.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void fileSave() {
		Book[] bk = new Book[5]; // Book객체를 받을 객체 배열
		// 객체 배열을 3번의 사용데이터로 초기화
		// (출판날짜는 아래 setCalendar 메소드를 활용)
		{
			bk[0] = new Book("C언어", "김씨", 10000, setCalendar(2012, 2, 2), 0.1);
			bk[1] = new Book("자바", "이씨", 20000, setCalendar(2013, 3, 3), 0.2);
			bk[2] = new Book("C++", "박씨", 30000, setCalendar(2014, 4, 4), 0.3);
			bk[3] = new Book("넛지", "서씨", 40000, setCalendar(2015, 5, 5), 0.4);
			bk[4] = new Book("개미", "최씨", 50000, setCalendar(2016, 6, 6), 0.5);
		}
		// try with resource 구문으로 “books.dat”파일에 저장되게 ObjectOutputStream과
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			for(int i = 0; i < bk.length; i++) {
				oos.writeObject(bk[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// FileOutputStream을 생성
		// 파일에 객체 배열의 값 저장
	}
	
	public Calendar setCalendar(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date);
		return cal;
	}
	
	public void fileRead() {
		Book[] readBook = new Book[10];

		// try with resource 구문 (FileNotFoundException과 ClassNotFoundException,
		// 으로 “books.dat”파일을 불러오게 ObjectInputStream과 FileInputStream을 생성
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))){
		
			int i = 0;
			while(true) {
				readBook[i] = ((Book) ois.readObject());
				System.out.println(readBook[i]);
				i++;
			}
			
			// EOFException, IOException 처리)
			// (EOFException 활용)
		} catch (EOFException e) {
			// 반복문을 통해 값을 다 읽어 들인 후 “books.dat 읽기 완료!” 출력
			System.out.println("books.dat 읽기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
