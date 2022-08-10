package com.uni.sectino01.poly;

public class Application1 {

	public static void main(String[] args) {
		/* 다형성
		 * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
		 * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
		 * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
		 */
		
		/* 다형성의 장점
		 * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
		 * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
		 *    이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
		 *    (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
		 *    하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
		 *    다형성을 이해하기 쉬운 가장 좋은 예 이기도 하다.
		 *    하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
		 * 3. 확장성이 좋은 코드를 작성할 수 있다.
		 * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
		 */
		System.out.println("====== Animal ======");
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
		
		System.out.println("====== Rabbit ======");
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		rabbit.jump();
		
		System.out.println("====== Tiger ======");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		tiger.bite();
		
		/* Rabbit 과 Tiger 는 Animal 클래스를 상속받아서
		 * Rabbit 은 Rabbit 타입이기도 하면서 Animal 타입이기도 하고
		 * Tiger 은 Tiger 타입이기도 하면서 Animal 타입이기도 하다.
		 * ---> 다형성
		 * */
		
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
//		Rabbit r = new Animal();
//		Tieger t = new Aninal();
		
		System.out.println("========동적바인딩확인 ========");
		
		a1.cry();
		a2.cry();
		
		/* 동적바인딩
		 * 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가.
		 * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다. 
		 * */
		
//		현재 레퍼런스 변수 타입은 Animal 이기 때문에 Rabbit 과 Tiger 의 고유 기능을 동작 시키지못한다.
//		a1.jump();
//		a2.bite();
		
		
		/* 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야
		 * 메소드 호출이 가능하다.
		 * class type casting : 클래스 형변환
		 * 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우
		 * ClassCastException 발생할 수 있다.
		 *  */
		System.out.println("========클래스 타입 형변환 확인 ========");
		((Rabbit) a1).jump();
		((Tiger) a2).bite();
		
//		((Tiger) a1).bite();//컴파일 시에느 ㄴ문제가 안됨, 런타임 시 ClassCaseException 발생
		
//		레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자 instanceof
		
		System.out.println("instanceof 확인 ----------------------------");
		System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
		System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
		/* 상속 받은 타입도 함께 가지고 있다(다형성) */
		System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
		/* 모든 클래스는 Object의 후손이다. */
		System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));
		
		if(a1 instanceof Rabbit) {
			((Rabbit) a1).jump();
		}
		
		if(a2 instanceof Tiger) {
			((Tiger) a2).bite();
		}
		
		
		/* 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
		 * up-casting : 상위 타입으로 형변환
		 * down-casting : 하위 타입으로 형변환
		 * 
		 * 또한 작성 여부에 따라 명시적과 묵시적 두 가지로 구분된다. */
		Animal animal1 = (Animal)new Rabbit();//up casting 명시적 형변환
		Animal animal2 = new Rabbit();//up casting 묵시적 형변환
		
		Rabbit rabbit1 = (Rabbit) animal1;//down casting 명시적 형변환
//		Rabbit rabbit2 = animal2;//down casting 은 묵시적 형변환이 안됨
	}

}
