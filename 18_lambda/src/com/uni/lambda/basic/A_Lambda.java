package com.uni.lambda.basic;

public class A_Lambda {
	/*
	 * 람다식(Lambda Expressions)
	 *	- 자바는 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원한다.
	 *	- 람다식은 익명 함수를 생성하기 위한 식으로 객체 지향 언어보다는 함수 지향 언어에 가깝다.
	 *	- 람다식은 매개 변수를 가지는 함수와 같은 코드 블록이지만 런타임시에는 인터페이스의 익명 구현 객체를 생성한다.
	 *	- 람다식을 사용하면 코드가 간결해지고, 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 가져올 수 있다.
	 *	
	 *	[표현법]
	 *		([타입 매개변수, ...]) -> {
	 *			실행문;
	 *			...
	 *		};
	 *	
	 *		- "([타입 매개변수, ...])"는 중괄호 블록({ })을 실행하는 필요한 값을 제공하는 역할을 한다.(매개변수)
	 *		- "->" 기호는 매개 변수를 이용해서 중괄호({ })를 실행한다는 뜻으로 생각하면된다.
	 *		- 예시)
	 *			1) 어떠한 수(a)를 단순히 출력하는 메소드를 작성(기본형)
					(int a) -> { System.out.println(a); }
				
				2) 매개 변수의 타입은 런타임 시에 대입되는 값에 따라 자동으로 인식,  매개 변수의 타입은 일반적으로 생략, 하나의 매개 변수만 존재할 때는 소괄호를 제거 
					a -> { System.out.println(a); }
				
					*	 매개 변수가 없다면 소괄호를 반드시 붙여준다.
					()-> { System.out.println(“출력”); }
				
				3) 중괄호 안에 실행문이 하나인 경우는 중괄호 생략 가능
					a -> System.out.println(a);
				
				4) 중괄호를 실행하고 결과값을 리턴하는 경우 
					(x + y) -> { return x + y; };
				
				5) 중괄호 안에 return문만 있을 경우 중괄호와 return문을 제거
					(x, y) -> x + y;
	 */
	public void method1() {
		/*
		 * 익명객체 (익명클래스 )
		 * 일회성의 구현객체이다 . 원래는 소스파일을 만들어서 그안에 클래스를 선언해서 사용해왔다.  
		 * 익명클래스를 사용하면 소스파일을 만들지 않고도 구현객체를 만들수있고  이것은 일시적으로 사용되고 버려진다. 재사용불가능, 
		 * 무명클래스라고도 하는데 이름이 없으니 다시 부를 일이없다.는것 
		 *  (따라서 일회성으로 비지니스로직을 작성해야하고 클래스를 생성하는것이 비효율적일떄 사용 - 스레드,단발성이벤트 처리)
		 * 
		 * /* 일반적인 케이스 
				// 상속
				class 클래스이름1 extends 부모클래스 {...}
				부모클래스 변수 = new 클래스이름1();
				
				// 구현
				class 클래스이름2 implements 인터페이스 {...}
				인터페이스 변수 = new 클래스이름2();
				
				
			/* 익명 객체 
				// 상속
				부모클래스 변수 = new 부모클래스() {...};
				
				// 구현
				인터페이스 변수 = new 인터페이스() {...};
				
				
		 * 주의 : 단독생성이 불가능, 클래스를 상속(익명자식객체)하거나 인터페이스(익명구현객체)를 구현할 경우에만 생성가능 
		 *		마지막에 ;  로 마무리해야함
		 *		익명객체 내부에서 외부의 필드나 메서드를 사용가능, 하지만 실체 메소드에서만 사용 가능하고 외부에서는 사용할 수 없음
		 * 
		 * 인터페이스변수 = new 인터페이스(){
		 *		 // 인터페이스에 선언된 추상메소드의 실체 메소드를 구현 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		Thread thread;
		Runnable runnable;
		
//		runnable = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("익명 구현 객체를 사용한 Thread 생성");
//			}
//		};
//		
//		thread = new Thread(runnable);
//		thread.start();
		
		
//		thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("익명 구현 객체를 사용한 Thread 생성2");
//			}
//		});
//		
//		thread.start();
		
		
//		thread = new Thread(() -> System.out.println("Lambda를 사용한 Thread 생성") );
//		thread.start();
		
		
		runnable = () -> System.out.println("Lambda를 사용한 Thread 생성2");
		thread = new Thread(runnable);
		thread.start();
	}
}
