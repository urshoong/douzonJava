package com.uni.section02.dementional_array;

public class Application3 {

	public static void main(String[] args) {
		/* 1. 배열의 선언 및 할당
		 * 가변 배열의 경우 각 인덱스별 배열을 따로 할당을 해야만 한다.
		 * 선언과 동시에 모든 배열을 할당할 수 없으며, 할당할 배열의 갯수만  지정하고 각 인덱스에 서로 다른 길이의 배열을 따로 할당해야 한다.
		 * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][];
		 * 변수명[배열 인덱스] = new 자료형[배열의 길이];
		 * */
		/* 1-1. 주소를 관리하는 배열의 주소를 보관하기 위한 변수 선언 */
		int[][] iarr = new int[3][];
		
		iarr[0] = new int[3];
		iarr[1] = new int[2];
		
		int[] arr = new int[5];
//		iarr[2] = new int[5];
		iarr[2] = arr;
		
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
//		iarr[0][3] = 4; //존재하지 않는 인덱스에 접근하는 경우 ArrayIndexOutOfBoundsException 발생하기 때문에 주의!!
		//때문에 주의!! 런타임에러
		
		iarr[1][0] = 4;
		iarr[1][1] = 5;
		
		iarr[2][0] = 6;
		iarr[2][1] = 7;
		iarr[2][2] = 8;
		iarr[2][3] = 9;
		iarr[2][4] = 10;
		
//		System.out.print(iarr[0][0] + " ");
//		System.out.print(iarr[0][1] + " ");
//		System.out.print(iarr[0][2] + " ");
//		
//		System.out.println();
//		
//		System.out.print(iarr[1][0] + " ");
//		System.out.print(iarr[1][1] + " ");
//		
//		System.out.println();
//		
//		System.out.print(iarr[2][0] + " ");
//		System.out.print(iarr[2][1] + " ");
//		System.out.print(iarr[2][2] + " ");
//		System.out.print(iarr[2][3] + " ");
//		System.out.print(iarr[2][4] + " ");
//		
//		System.out.println();
		
		
		
		int[] lengths = {3, 2, 5};
		int[][] iarr2 = new int[3][];
		int value = 1;
		
		for(int i = 0; i < lengths.length; i++) {
			iarr2[i] = new int[lengths[i]];
			for(int j = 0; j < lengths[i]; j++) {
				iarr2[i][j] = value++; 
			}
		}
		
		for(int i = 0; i < iarr2.length; i++) {
			for(int j = 0; j < iarr2[i].length; j++) {
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
