package com.uni.section03.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		int cnt = 0;
		while(cnt < 10) {
			System.out.println(cnt++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("인터럽트로 인하여 쓰레드 종료");
				cnt = 10;
				e.printStackTrace();
			}
		}
	}
	
}
