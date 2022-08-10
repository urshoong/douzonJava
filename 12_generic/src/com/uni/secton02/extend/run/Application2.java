package com.uni.secton02.extend.run;

import com.uni.secton02.extend.Bunny;
import com.uni.secton02.extend.DrunkenBunny;
import com.uni.secton02.extend.Rabbit;
import com.uni.secton02.extend.RabbitFarm;
import com.uni.secton02.extend.WildCardFarm;

public class Application2 {

	public static void main(String[] args) {
		/* 와일드카드(WildCard) 
		 * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
		 * 그 객체의 타입 변수를 제한할 수 있다.
		 * 
		 * <?> : 제한 없음
		 * <? extends Type> : 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
		 * <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
		 * */
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
//		농장생성 자체가 불가능한 경우
//		wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
		
//		어떤 토끼농장이던 매개변수로 사용 가능
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
//		Bunny이거나 후손 토끼 농장만 매개변수로 사용 가능, 상위타입은 불가능
//		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
//		Bunny이거나 상위타입 토끼 농장만 매겨변수로 사용 가능, 하위 타입은 불가능
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
//		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
	}

}
