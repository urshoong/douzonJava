package com.uni.section06.race.run;

import com.uni.section06.race.thread.Heart;
import com.uni.section06.race.thread.Star;

public class Application {

	public static int tot1 = 0;
	public static int tot2 = 0;
	
	public static void main(String[] args) {
		Heart h = new Heart();
		Star s = new Star();
		
		Thread th1 = new Thread(h);
		Thread th2 = new Thread(s);
		
		try {
			th1.start();
			
			Thread.sleep(500);
			
			th2.start();
			
			th1.join();//main 쓰레드가 th1의 작업이 끝날 때 까지 대기
			th2.join();//main 쓰레드가 th2의 작업이 끝날 때 까지 대기
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = Application.tot1 > Application.tot2 ? "하트 승" : (Application.tot1 < Application.tot2 ? "별 승" : "무승부");
		System.out.println(str);
	}

}
