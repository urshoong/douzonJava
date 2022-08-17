package com.uni.section02.thread;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		//우선순위가 그나마 적용되게 하기 위한 delay코드
//		for(int i = 0; i < Integer.MAX_VALUE; i++) {
//			for(int j = 0; i < Integer.MAX_VALUE; j++) {
//				
//			}
//		}
		for(int i = 0; i < 1000; i++) {
			for(int j = 0; i < 1000; j++) {
				
			}
		}
		
		System.out.println(Thread.currentThread().getName());//Thread.currentThread() : 현재 실행중인 쓰레드 반환
	}
	
}
