package com.uni.section06.singleton;

public class EagerSingleton {
	private static EagerSingleton eager = new EagerSingleton();//클래스가 초기화 되는 시점에 인스턴스를 생성, 즉 프로그램이 로딩될 때 생성
	
	private EagerSingleton() {//외부에서 인스턴스 생성 제한
		
	}
	
	public static EagerSingleton getInstance() {//public 메소드를 호출하면 인스턴스를 반환하도록 한다.
		return eager;//생성된 인스턴스를 반환
	}
	
	
}
