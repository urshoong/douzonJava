package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] student = new Student[3];
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		student[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		// 위의 학생 정보 모두 출력
		for(int i = 0; i < student.length; i++) {
			System.out.println("student[" + i + "] : " + student[i].information());
		}
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] employee = new Employee[10];
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		label:
		while(true) {
			System.out.println("사원정보를 입력해주세요.");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt(); sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			employee[count] = new Employee(name, age, height, weight, salary, dept);
			
			// 한 명씩 추가 될 때마다 카운트함
			count++;
			System.out.println("계속 추가하시겠습니까?(y,n)");
			char gbn = sc.next().charAt(0); sc.nextLine();
			switch(gbn) {
				case 'y':
				case 'Y':
					// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
					continue;
					// ‘n’일 경우 더 이상 그만 입력 받도록..
				case 'n':
					System.out.println("입력을 종료합니다.");
					break label;
				default:
					break;
			}
		}

		// 배열에 담긴 사원들의 정보를 모두 출력
		for(int i = 0; i < count; i++) {
			System.out.println("employee[" + i + "] : " + employee[i].information());
		}
		
		sc.close();
	}

}
