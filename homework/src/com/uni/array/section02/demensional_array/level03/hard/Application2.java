package com.uni.array.section02.demensional_array.level03.hard;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 홀수를 하나 입력 받아 입력받은 크기 만큼의 정사각형 형태의 2차원 배열을 할당하고
		 * 모래시계 모양으로 *을 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 홀수 하나를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * *****
         *  *** 
         *   *  
         *  *** 
         * *****
         * 
         * 단, 홀수를 입력하지 않은 경우 "홀수만 입력해야 합니다." 출력
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("홀수만 입력해야 합니다.");
		}else {
			/*
			//배열 안쓰고 푼거
			int start = 1;
			int end = num;
			for(int i = 1; i <= num; i++) {//라인 출력 수
				int min = Math.min(start, end);
				int max = Math.max(start, end);
				int blank = num - max;
				for(int b = 0; b < blank; b++) {
					System.out.print(" ");
				}
				
				for(int s = min; s <= max; s++) {
					System.out.print("*");
				}
				start++;
				end--;
				System.out.println();
			}
//			*/
			
//			/*
			//배열 쓰고 푼거
			int start = 0;
			int end = num - 1;
			
			char[][] carr = new char[num][num];
			
			for(int i = 0; i < num; i++) {
				int min = Math.min(start, end);
				int max = Math.max(start, end);
				for(int j = 0; j < num; j++) {
					if(j >= min && j <= max) {
						carr[i][j] = '*';
					}
				}
				start++;
				end--;
			}
			
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num; j++) {
					System.out.print(carr[i][j]);
				}
				System.out.println();
			}
//			*/
		}
		
		sc.close();
	}
}
