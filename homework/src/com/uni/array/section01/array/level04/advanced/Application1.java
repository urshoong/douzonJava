package com.uni.array.section01.array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {
		
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		final int SIZE = 6;
		int[] num = new int[SIZE];
		
		int loop = 1;
		label:
		while(loop <= SIZE) {
			//1~45 난수 생성
			int r = (int)(Math.random()*45) + 1;
			//num 배열에서 중복되는 값 확인하고 있으면 while문 처음부터 다시 시작
			for(int i = 0; i < SIZE; i++) {
				if(num[i] == r) {
//					System.out.println("중복 발생");
					continue label;
				}
			}
			//num 배열에서 초기값(0)인 부분에 난수 r 입력
			for(int i = 0; i < SIZE; i++) {
				if(num[i] == 0) {
					num[i] = r;
					break;
				}
			}
			
			loop++;
		}
		
		//값 정렬
		for(int i = 1; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(num[i] < num[j]) {
					int temp = 0;
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < SIZE; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
