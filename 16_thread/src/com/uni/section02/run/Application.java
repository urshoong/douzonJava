package com.uni.section02.run;

import com.uni.section02.thread.Thread3;

public class Application {

	public static void main(String[] args) {
		Thread3 th3 = new Thread3();
		
		for(int i = 0; i <= 100; i++) {
			Thread th = new Thread(th3);//기본순위 5
			if(i % 2 == 0) {
				th.setPriority(Thread.MAX_PRIORITY);//우선순위 10
				th.setName("Thread 짝수" + i);
			}else {
				th.setPriority(Thread.MIN_PRIORITY);//우선순위 1
				th.setName("Thread 홀수" + i);
			}
			th.start();
		}
		
	}

}
