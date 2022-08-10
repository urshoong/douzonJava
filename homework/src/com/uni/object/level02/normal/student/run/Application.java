package com.uni.object.level02.normal.student.run;

import java.util.Scanner;

import com.uni.object.level02.normal.student.model.dto.StudentDTO;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보를 입력해주세요.");
		System.out.print("학년 : ");
		int grade = sc.nextInt(); sc.nextLine();
		System.out.print("반 : ");
		int classroom = sc.nextInt(); sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("키 : ");
		double height = sc.nextDouble(); sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		StudentDTO student = new StudentDTO(grade, classroom, name, height, gender);
		student.printInformation();
		
		sc.close();
	}

}
