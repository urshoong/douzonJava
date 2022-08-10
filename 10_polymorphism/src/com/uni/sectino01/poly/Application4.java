package com.uni.sectino01.poly;

public class Application4 {

	public static void main(String[] args) {
		Application4 app = new Application4();
		Animal randomAnimal = app.getRandomAnimal();
		randomAnimal.cry();
		app.getRandomAnimal().eat();
		
	}

	public Animal getRandomAnimal() {//리턴 타입에 다형성 적용
		int random = (int) (Math.random() * 2);
		return random == 0 ? new Rabbit() : new Tiger();
	}
}
