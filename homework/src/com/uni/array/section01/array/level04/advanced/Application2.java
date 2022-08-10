package com.uni.array.section01.array.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
			
			/* 숫자 야구게임 만들기 
			 * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
			 * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
			 * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
			 * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
			 * 
			 * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
			 * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
			 * 
			 * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
			 * 횟수는 차감하지 않는다.
			 * 
			 * -- 프로그램 예시 (난수 7416 의 경우) --
			 *
			 * 10회 남으셨습니다.
			 * 4자리 숫자를 입력하세요 : 1234
			 * 아쉽네요 0S 2B 입니다.
			 * 9회 남으셨습니다.
			 * 4자리 숫자를 입력하세요 : 5678
			 * 아쉽네요 0S 2B 입니다.
			 * 8회 남으셨습니다.
			 * 4자리 숫자를 입력하세요 : 7416
			 * 정답입니다.
			 * */
		final int SIZE = 4;
		int[] num = new int[SIZE];
		
		int loop = 1;
		label:
		while(loop <= SIZE) {
			//0~9 난수 생성
			int r = (int)(Math.random()*10);
			//num 배열에서 중복되는 값 확인하고 있으면 while문 처음부터 다시 시작
			for(int i = 0; i < SIZE; i++) {
				if(num[i] == r) {
	//				System.out.println("중복 발생");
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
		
//		System.out.println("정답확인");
		print(num);
//		System.exit(0);
		
		Scanner sc = new Scanner(System.in);
		int process = 10;
		label2:
		while(process > 0) {
			//인덱스 같으면 s 다른데 있으면 b
			System.out.println(process + "회 남으셨습니다.");
			System.out.print("4자리 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			if(!(input / 1000 > 0)) {
				System.out.println("4자리의 정수를 입력해야 합니다.");
				continue label2;
			}
			
			//입력받은 값을 자리수 순서대로 잘라서 배열에 넣기
			int[] inputNum = new int[SIZE];
			int temp = input;
			for(int i = 0, step = 3; i < SIZE; i++) {
				int stepVal = (int) Math.pow(10, step--);
				int number = temp / stepVal;
				inputNum[i] = number;
				temp -= (number * stepVal);
			}
			
			//inputNum 확인
//			print(inputNum);
//			System.exit(0);
			
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(num[i] == inputNum[j]) {
						if(i == j)	strike++;
						else		ball++;
					}
				}
			}
			if(strike == 4) {
				System.out.println("정답입니다.");
				break;
			}else{
				System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
			}
			process--;
		}
		
		System.out.println("정답은");
		print(num);
		System.out.println("입니다");
		System.out.println("게임 종료");
		
		sc.close();
	}
	
	public static void print(int[] iarr) {
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
	}
}
