package com.uni.object.level03.hard.emp.run;

import java.util.Scanner;

import com.uni.object.level03.hard.emp.model.dtl.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int number = sc.nextInt(); sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		System.out.print("직급 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("월급 : ");
		int salary = sc.nextInt(); sc.nextLine();
		System.out.print("보너스 : ");
		double bonusPoint = sc.nextDouble(); sc.nextLine();
		System.out.print("휴대폰 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		EmployeeDTO employee = new EmployeeDTO();
		employee.setNumber(number);
		employee.setName(name);
		employee.setDept(dept);
		employee.setJob(job);
		employee.setAge(age);
		employee.setGender(gender);
		employee.setSalary(salary);
		employee.setBonusPoint(bonusPoint);
		employee.setPhone(phone);
		employee.setAddress(address);
		
		System.out.println(employee.getNumber());
		System.out.println(employee.getName());
		System.out.println(employee.getDept());
		System.out.println(employee.getJob());
		System.out.println(employee.getAge());
		System.out.println(employee.getGender());
		System.out.println(employee.getSalary());
		System.out.println(employee.getBonusPoint());
		System.out.println(employee.getPhone());
		System.out.println(employee.getAddress());
		
		sc.close();
	}

}
