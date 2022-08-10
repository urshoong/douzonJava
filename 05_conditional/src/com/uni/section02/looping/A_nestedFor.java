package com.uni.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
	public void printGugudanFromTwoToNine() {
		/* 2단부터 단을 1씩 증가시키는 반복문 */
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + " 단");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " X " + su + " = " + (dan * su));
			}
		}
	}
	
	public void printUpgradeGugudanFromTwoToNine() {
		/* 단을 2단부터 9단까지 하나씩 증가시킨다. */
		for(int dan = 2; dan < 10; dan++) {
			
			/* 한 단씩 구구단을 출력하는 메소드를 호출하며 인자로 단을 전달한다. */
			printGugudanOf(dan);
			/* 한 단을 출력하고 한 줄을 띄운다. */
			System.out.println();
		}
	}
	
	public void printGugudanOf(int dan) {
		for(int su = 1; su <= 9; su++) {
			System.out.println(dan + " X " + su + " = " + (dan * su));
		}
	}
	
	public void printStarInputRowTimes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 행 수를 입력하세요");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
//			for(int j = 1; j <= 5/*i*/; j++) {
//				System.out.print("*");
//			}
			printStar(5);
			System.out.println();
		}
	}
	
	public void printStar(int times) {
		for(int j = 1; j <= times; j++) {
			System.out.print("*");
		}
	}
	
	public void printTriangleStarts() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 행 수를 입력하세요");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
			printStar(i);
			System.out.println();
		}
	}
}
