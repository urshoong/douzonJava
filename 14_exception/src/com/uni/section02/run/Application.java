package com.uni.section02.run;

import java.util.Scanner;

import com.uni.section02.exception.MyException;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요~ : ");
		
		int num = sc.nextInt();
		//checkNum() 만들고
		//입력받은 수가 10보다 작은 수일 경우: MyException("10보다 작은 수입니다") 발생시킴
		//아닌경우 sysout : 10보다 크거나 같은 수구나!
		Application app = new Application();
		try {
			app.checkNum(num);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public void checkNum(int num) throws MyException {
		if(num < 10) {
			throw new MyException("10보다 작은 수입니다");
		}else {
			System.out.println("10보다 크거나 같은 수구나!");
		}
	}

}
