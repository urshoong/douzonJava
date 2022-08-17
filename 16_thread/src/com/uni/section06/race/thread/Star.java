package com.uni.section06.race.thread;

import com.uni.section06.race.run.Application;

public class Star implements Runnable{

	@Override
	public void run() {
		int ran = 0;
		
		try {
			for(int i = 0; i < 10; i++) {//콘솔창 개행(클리어용)
				for(int k = 0; k < 30; k++) {
					System.out.println();
				}
				if(i == 0) {
					System.out.println("준비");
					System.out.println("♡");
					System.out.println("★");
				}else {
					ran = (int)(Math.random() * 5) + 1;
					Application.tot2 += ran;
					
					//랜덤한 수만큼 누적되서 - 로 표시
					for(int j = 0; j < Application.tot1; j++) {
						System.out.print("-");
					}
					System.out.println("♡");
					
					for(int j = 0; j < Application.tot2; j++) {
						System.out.print("-");
					}
					System.out.println("★");
				}
				
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
