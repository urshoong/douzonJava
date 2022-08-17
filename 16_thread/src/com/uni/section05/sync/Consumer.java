package com.uni.section05.sync;

//공유자원을 꺼내서 소비하는 소비자 클래스
public class Consumer extends Thread{
	
	private Buffer criticalData;
	
	public Consumer(Buffer buffer) {
		this.criticalData = buffer;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			criticalData.getData();
		}
	}
	
}
