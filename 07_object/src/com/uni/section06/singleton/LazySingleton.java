package com.uni.section06.singleton;

public class LazySingleton {
	private static LazySingleton lazy;//클래스가 초기화되는 시점에는 정적필드를 선언해두고 null로 초기화
	
	private LazySingleton() {//외부에서 인스턴스 생성 제한
		
	}
	
	public static LazySingleton getInstance() {
		//인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환, 생성한 인스턴스가 있는 경우 만들어둔 인스턴스 반환
		if(lazy == null) {
			lazy = new LazySingleton();
		}
		return lazy;
	}
}
