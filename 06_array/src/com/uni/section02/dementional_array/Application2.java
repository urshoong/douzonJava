package com.uni.section02.dementional_array;

public class Application2 {
	public static void main(String[] args) {
		/* 2차원 정변배열을 선언 및 할당 하고 차례로 값을 대입해서 출력해보자 */
		
		/* 1. 배열의 선언 및 할당
		 * 정변 배열의 경우 각 인덱스별 배열을 따로 할당할 수 도 있지만
		 * 선언과 동시에 모든 배열을 할당할 수 있다.
		 * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];
		 * */
		int[][] iarr = new int[3][5];      //길이 5의 배열을 3개 할당하고 그 주소를 묶어 관리하는 배열의 주소를 stack의 iarr에 저장한다.
		
		int value = 1;
		for(int i = 0; i < iarr.length; i++) {
			for (int j = 0, len = iarr[i].length; j < len; j++) {
				iarr[i][j] = value++;
//				iarr[i][j] = (i*len) + (j+1);
			}
		}
		
		for(int i = 0; i < iarr.length; i++) {
			for (int j = 0, len = iarr[i].length; j < len; j++) {
				System.out.print(iarr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
