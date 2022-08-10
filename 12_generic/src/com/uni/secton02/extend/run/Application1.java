package com.uni.secton02.extend.run;

import com.uni.secton02.extend.Bunny;
import com.uni.secton02.extend.DrunkenBunny;
import com.uni.secton02.extend.Rabbit;
import com.uni.secton02.extend.RabbitFarm;

public class Application1 {

	public static void main(String[] args) {
		/* 제네릭 클래스 작성시 extends 키워드를 사용하면 특정 타입만 사용하도록 제한을 걸 수 있다. */
//		RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//		RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
//		RabbitFarm<Snake> farm1 = new RabbitFarm<>();
		
		//Rabbit 타입이나 Rabbit 의 후손으로는 인스턴스 생성이 가능
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
		
//		farm1.setAnimal(new Snake());
		farm1.setAnimal(new Rabbit());
		farm1.getAnimal().cry();
		farm2.setAnimal(new Bunny());
		farm2.getAnimal().cry();
		farm3.setAnimal(new DrunkenBunny());
		farm3.getAnimal().cry();
	}

}
