package com.uni.method.section01;

public class Application2 {

	public static void main(String[] args) {
		System.out.println("main() 시작됨");
		
		Application2 app2 = new Application2();
		app2.methodA();
		app2.methodB();
		app2.methodC();

		System.out.println("main() 종료됨");
	}
	
	public void methodA() {
		System.out.println("mothodA() 호출됨");
		
		System.out.println("mothodA() 종료됨");
	}
	
	public void methodB() {
		System.out.println("mothodB() 호출됨");
		
		System.out.println("mothodB() 종료됨");
	}
	
	public void methodC() {
		System.out.println("mothodC() 호출됨");
		
		System.out.println("mothodC() 종료됨");
	}

}
