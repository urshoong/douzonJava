package com.uni.section01.extend;

public class RacingCar extends Car{
	
	public RacingCar() {
		System.out.println("RacingCar클래스 기본생성자 호출됨");
	}

	@Override
	public void run() {
		System.out.println("레이싱 카가 전속력으로 질주합니다");
	}

	@Override
	public void soundHormn() {
		System.out.println("레이싱카는 경적을 울리지 않습니다");
	}

	@Override
	public void stop() {
		System.out.println("레이싱카가 멈춥니다.");
	}
}
