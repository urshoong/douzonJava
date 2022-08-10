package com.uni.sectino01.poly;

public class Application2 {

	public static void main(String[] args) {
		//상위타입으로 객체 배열 5개 만들고 각 인덱스에 인스턴스 생성 해서 대입 (랜덤하게 알아서)
		//cry 메소드 실행
		//instanceof 연산자를 사용하여 각 고유 기능 실행, 토끼나 호랑이가 아니면 "토끼나 호랑이가 아닙니다" 출력
		Animal[] animal = new Animal[5];
		int r = 0;
		for(int i = 0; i < animal.length; i++) {
			r = (int)(Math.random() * 3);
			switch(r) {
				case 0: animal[i] = new Rabbit(); break;
				case 1: animal[i] = new Tiger(); break;
				case 2: animal[i] = new Animal(); break;
				default: break;
			}
		}
		
		for(int i = 0; i < animal.length; i++) {
			System.out.println("====== animal[" + i + "] ======");
			animal[i].cry();
			if(animal[i] instanceof Rabbit) {
				((Rabbit) animal[i]).jump();
			}else if(animal[i] instanceof Tiger) {
				((Tiger) animal[i]).bite();
			}else {
				System.out.println("토끼나 호랑이가 아닙니다");
			}
		}
		
	}

}
