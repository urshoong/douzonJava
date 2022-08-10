package com.uni.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		/* 5명의 자바 점수를 정수로 이벽받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보세요 */
		Scanner sc = new Scanner(System.in);
		final int SIZE = 5;
		double[] darr = new double[SIZE];
		for(int i = 0; i < SIZE; i++) {
			System.out.print("점수를 입력해 주세요 : ");
			darr[i] = sc.nextDouble();
		}
		
		System.out.println("=====================");
		double sum = 0;
		for(int i = 0; i < SIZE; i++) {
			sum += darr[i]; 
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / SIZE));
		System.out.println("=====================");
		
		System.out.println("프로그램종료확인");
		sc.close();
	}

}
