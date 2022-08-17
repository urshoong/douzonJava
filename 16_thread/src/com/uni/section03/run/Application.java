package com.uni.section03.run;

import java.util.Scanner;

import com.uni.section03.thread.Thread4;

public class Application {

	public static void main(String[] args) {
		//interrupt : sleep()나 join()에 의해 일시 정지 상태인 스레드를 실행 대기 상태로 만든다. 
		//해당 쓰레드에서는 InterruptException이 발생하게 되어 일시 정지를 벗어난다
		
		Thread4 th4 = new Thread4();
		Thread th = new Thread(th4);
		
		th.start();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아무 문자열이나 입력하세요.");
		
		String str = sc.nextLine();
		
		th.interrupt();
	}

}
