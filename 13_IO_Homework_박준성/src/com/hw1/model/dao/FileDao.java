package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		// “파일에 저장할 내용을 반복해서 입력하시오("exit"을 입력하면 내용 입력 끝) :”
		System.out.println("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) :");
		while(true) {
			// 값을 Scanner로 입력 받고 해당 입력 값이 “exit”일 경우 반복문 빠져나감
			String input = sc.nextLine();
			if(input.equals("exit")) {
				break;
			}else {
				// 아닐 경우 sb에 추가
				sb.append(input + "\n");
			}
		}
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		// “저장하시겠습니까? (y/n)”
		System.out.println("저장하시겠습니까? (y/n)");
		try { // BufferedWriter와 FileWriter 스트림 사용
			// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			if(sc.next().equalsIgnoreCase("y")) {
				sc.nextLine();//버퍼 비우기
				// 저장할 파일명을 입력 받음
				System.out.println("저장할 파일명을 입력하시요 : ");
				String fileName = sc.nextLine();
				// “입력받은 파일명.txt” 파일에 해당 sb 데이터출력
				fw = new FileWriter(new File(fileName + ".txt"));
				bw = new BufferedWriter(fw);
				bw.append(sb);
				// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.” 콘솔창 출력
				System.out.println(fileName+".txt 파일에 성공적으로 저장하였습니다.");
			}else {
				// 입력 받은 값이 y가 아니면 “다시 메뉴로 돌아갑니다.” 출력하고 메뉴로..
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
		}catch( IOException e ) {
			 e.printStackTrace();
		}finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void fileOpen() {
		// “열기 할 파일명 : “
		System.out.println("열기 할 파일명 : ");
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		String fileName = sc.nextLine();
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
			fr = new FileReader(new File(fileName+".txt"));
			br = new BufferedReader(fr);
			String temp = null;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		}catch( FileNotFoundException e ) {
			// 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨
			// “존재하는 파일이 없습니다.”
			System.out.println("존재하는 파일이 없습니다.");
		}catch( IOException e ) {
			e.printStackTrace();
		}finally {	
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		// “수정 할 파일명 : “
		System.out.println("수정 할 파일명 : ");
		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter
		String fileName = sc.nextLine();
		// 스트림 사용
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File file = new File(fileName+".txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String temp = null;
			while((temp = br.readLine()) != null) {
//				System.out.println(temp);
				sb.append(temp + "\n");
			}
			
			
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			// “파일에 추가할 내용을 입력하시오 : “
			System.out.println("파일에 추가할 내용을 입력하시오 : ");
			while(true) {
				// 값을 Scanner로 입력 받고 해당 입력 값이 “exit”일 경우 반복문 빠져나감
				String input = sc.nextLine();
				// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기
				if(input.equals("exit")) {
					break;
				}else {
					// 아닐 경우 sb에 추가
					sb.append(input + "\n");
				}
			}
			// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			try { // BufferedWriter와 FileWriter 스트림 사용
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
				if(sc.next().equalsIgnoreCase("y")) {
					sc.nextLine();//버퍼 비우기
					// 저장할 파일명을 입력 받음
					bw.append(sb);
					// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.” 콘솔창 출력
					System.out.println("입력받은 "+fileName+".txt 파일의 내용이 변경되였습니다.");
				}else {
					// 입력 받은 값이 y가 아니면 “다시 메뉴로 돌아갑니다.” 출력하고 메뉴로..
					System.out.println("다시 메뉴로 돌아갑니다.");
				}
			}catch( IOException e ) {
				 e.printStackTrace();
			}finally {
				try {
					if(bw != null) bw.close();
					if(br != null) br.close();
					if(fw != null) fw.close();
					if(fr != null) fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”
		}catch( FileNotFoundException e ) {
			e.printStackTrace();
		}catch( IOException e ) {
			e.printStackTrace();
		}finally {
			// 열었던 스트림 close
		}

	}
}
