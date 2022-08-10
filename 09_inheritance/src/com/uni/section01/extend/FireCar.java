package com.uni.section01.extend;

public class FireCar extends Car{
	
	public FireCar() {
		//super();//묵시적으로 선언되어 있다.
		System.out.println("FireCar 클래스 기본생성자가 호출됨");
	}

	/* @Override 어노테이션
	 * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
	 * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
	 * */
	@Override
	public void soundHormn() {
		if(isRunning()) {
			System.out.println("빠아아앙아아아아앙~~!!");
		}else {
			System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세여!!");
		}
	}
	
	public void sprayWater() {
		System.out.println("불이 난 곳을 발견했습니다. 물을 뿌립니다!!");
	}
}
