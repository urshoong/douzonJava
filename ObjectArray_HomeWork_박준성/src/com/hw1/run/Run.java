package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		//객체배열을 크기 3으로 할당
		Employee[] emp = new Employee[3];
		//0번 인덱스에는 기본생성자를 통해 객체 생성
		emp[0] = new Employee();
		//1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		//2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성
		emp[2] = new Employee(0, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		//출력
		for(int i = 0; i < emp.length; i++) {
 			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		
		//3개의 객체 중 값이 없는 필드에 각각 값을 넣음
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		//출력
		System.out.println("=========================================================================");
		for(int i = 0; i < emp.length - 1; i++) {
 			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		//직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		//보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12;
		long e0 = (long)((emp[0].getSalary() + ( emp[0].getSalary() * emp[0].getBonusPoint() )) * 12);
		long e1 = (long)((emp[1].getSalary() + ( emp[1].getSalary() * emp[1].getBonusPoint() )) * 12);
		long e2 = (long)((emp[2].getSalary() + ( emp[2].getSalary() * emp[2].getBonusPoint() )) * 12);
		System.out.println(emp[0].getEmpName() + "의 연봉 : " + e0 + "원");
		System.out.println(emp[1].getEmpName() + "의 연봉 : " + e1 + "원");
		System.out.println(emp[2].getEmpName() + "의 연봉 : " + e2 + "원");
		//3명 직원의 평균을 구하여 출력
		long emp_avg = (e0+e1+e2) / 3;
		System.out.println("직원들의 연봉의 평균 : " + emp_avg + "원");
	}

}
