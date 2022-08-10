package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[10];
		int count = 0;
		
		while(true) {
			System.out.println("학생의 정보를 입력하세요");
			System.out.print("학년 : ");
			int grade = sc.nextInt(); sc.nextLine();
			System.out.print("반 : ");
			int classroom = sc.nextInt(); sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt(); sc.nextLine();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt(); sc.nextLine();
			System.out.print("수학점수 : ");
			int math = sc.nextInt(); sc.nextLine();
			
			student[count] = new Student(grade, classroom, name, kor, eng, math);
			
			count++;
			
			System.out.print("계속 추가하시겠습니까?(종료:n) : ");
			char gbn = sc.next().charAt(0);
			if(gbn == 'n') break;
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println("Student[" + i + "] : " + student[i].information());
		}
		
		sc.close();
	}

}
