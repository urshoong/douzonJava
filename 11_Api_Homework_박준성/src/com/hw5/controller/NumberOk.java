package com.hw5.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOk {
	private int ran;
	
	public NumberOk() {}
	
	public void numGame() {
//		사용자에게 숫자를 입력 받 고 입력 받은 숫자가 임의 의 난수와 비교 했을 때 작 은지 큰지, 
//		몇 번 만에 맞추 는지, 맞추면 계속 할지 끝 낼지 묻는 메소드
		Scanner sc = new Scanner(System.in);
		
		ran = (int)(Math.random()*100) + 1;
		System.out.println(ran);
		
		int count = 1;
		boolean flag = false;
		do {
			try {
				if(flag) {
					sc.nextLine();//버퍼 비우기
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					System.out.println("계속 하시겠습니까?(y/n)");
					String as = sc.next();
					if(as.equalsIgnoreCase("n")) {
						break;
					}else if(as.equalsIgnoreCase("y")) {
						flag = false;
					}else {
						throw new InputMismatchException();
					}
				}
				
				System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
				int input = sc.nextInt();
				
				if(input >= 1 && input <= 100) {
					if(input == ran) {
						System.out.println(count + "번 만에 맞췄습니다!");
						System.out.println("계속 하시겠습니까?(y/n)");
						String as = sc.next();
						if(as.equalsIgnoreCase("n")) {
							break;
						}else if(as.equalsIgnoreCase("y")){
							ran = (int)(Math.random()*100) + 1;
						}else {
							throw new InputMismatchException();
						}
					}else {
						if(input > ran) {
							System.out.println(input + "보다 작습니다." + count + "번째 실패!!");
						}else {
							System.out.println(input + "보다 큽니다." + count + "번째 실패!!");
						}
						count++;
					}
				}else {
					throw new InputMismatchException();
				}
			}catch (InputMismatchException e) {
				flag = true;
			}
		}while(true);
	}
}
