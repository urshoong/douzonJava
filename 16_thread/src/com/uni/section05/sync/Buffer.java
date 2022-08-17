package com.uni.section05.sync;

public class Buffer {
	private int data;
	private boolean empty = true;
	
	public synchronized void getData() {
		
		while(empty) {
			try {
				System.out.println("wait getData()");
				wait();//대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("소비자 : " + data + " 번 상품을 소비하였습니다.");
		
		empty = true;
		
		notify();//해제
		System.out.println("getData notify()");
	}
	
	public synchronized void setData(int data) {
		
		while(!empty) {
			try {
				wait();
				System.out.println("wait setData()");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.data = data;
		System.out.println("생산자 : " + data + " 번 상품을 생산하였습니다.");
		
		empty = false;
		
		notify();
		System.out.println("setData notify()");
	}
}
