package com.uni.section02.abstractclass;

public class SmartPhone extends Product{
	

	@Override
	public void abstMethod() {
		/* extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속하지 못한다. (모호성 제거)(단일상속)
		 * 추상클래스가 가지는 추상 메소드를 반드시 오버라이딩 해야 한다. (강제성 부여) */
		
		System.out.println("Product 클래스의 abstMethod를 오버라이딩한 메소드");
	}
	
	public void printSmartPhone() {
		System.out.println("printSmartPhone 메소드를 호출함");
	}
	
}
