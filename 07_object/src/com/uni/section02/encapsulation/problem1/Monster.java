package com.uni.section02.encapsulation.problem1;

public class Monster {
	String name; //몬스터이름
	int hp; //몬스터체력
	
	public void setHp(int hp) {
		if(hp > 0) {
			System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
			this.hp = hp;// this : 인스턴스의 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어있음.
		}else {
			System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
			this.hp = 0;
		}
	}
}
