package com.uni.section01.thread;

//2. Runnable 인터페이스로 구현
//단일 상속만 지원하기 때문에 Thread 클래스를 상속받지 못하는 경우는 Runnable 로 구현
public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("스레드 2 [ " + i + " ] ##########");
		}
	}
	
}
