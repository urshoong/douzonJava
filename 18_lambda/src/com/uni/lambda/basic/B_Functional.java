package com.uni.lambda.basic;

import com.uni.lambda.functional.A_FuncInterface;
import com.uni.lambda.functional.B_FuncInterface;
import com.uni.lambda.functional.C_FuncInterface;

public class B_Functional {
	/*
	 * 타겟타입(Target Type)
	 *  - 람다식은 대립될 인터페이스의 종류에 따라서 작성 방법이 달라지기 때문에 람다식이 대입될 인터페이스를 타겟 타입 이라고 한다.
	 *  - 람다식은 매개 변수를 가진 코드 블록이기 때문에 자바의 메소드 선언처럼 보여지지만
	 *    자바는 메소드를 단독으로 선언할 수 없고 항상 클래스의 구성 멤버로 선언하기 때문에 람다식은 단순히 메소드를 
	 *    선언하는 것이 아니라 이 메소드를 가지고 있는 객체를 생성한다.
	 *  - 람다식은 인터페이스 변수에 대입되고 람다식은 인터페이스의 익명 구현 객체를 생성한다.
	 *  - 람다 표현식을 사용할 때는 람다 표현식을 저장하기 위한 참조 변수의 타입을 결정하는데 이때 참조변수형 타입을 함수형 인터페이스 라고 함. 
		함수형인터페이스 변수 = 람다식

	 *  
	 *
	 * 함수적 인터페이스(Functional Interface)
	 *  - 모든 인터페이스가 타겟 타입으로 사용할 수 없다.
	 *  - 람다식은 하나의 메소드를 정의하기 때문에 두 개 이상의 추상 메소드가 선언된 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다.
	 *  - 즉, 하나의 추상 메소드가 선언된 인터페이스만 람다식의 타겟이 될 수 있는데 이러한 인터페이스 함수적 인터페이스라고 한다.
	 *  - 함수적 인터페이스를 선언할 때 @FunctionalInterface 어노테이션을 붙이면 두 개 이상의 추상메소드가 선언되지 않도록 컴파일러가 
	 *    체크해준다. (두 개 이상의 추상메소드가 선언되면 컴파일 에러가 발생한다.)
	 *  - 물론 @FunctionalInterface 어노테이션이 없다고해서 함수적 인터페이스가 아니란 뜻은 아니고, 실수로 두 개 이상의 추상 메소드를 
	 *    선언하는 것을 방지하고 싶다면 붙여준다.
	 *  - 디폴트메소드, 정적메소드가 포함되고 추상메소드가 하나이거나 Object 클래스의 메소드를 오버라이드 한 경우 
	 *    compare메소드와 같이 추상메서드가 하나인경우는 가능하다. 
	 */
	
	private int num = 100;
	private int num2 = 100000;

	public void method1() {
//		A_FuncInterface f1 = new A_FuncInterface() {
//		
//		@Override
//		public void method() {
//			System.out.println("익명 구현 객체를 사용한 인터페이스 구현");
//		}
//		};
//		
//		f1.method();
		
		//함수형인터페이스 변수 = 람다식
//		A_FuncInterface f1 = () -> {
//		String str = "매개변수와 반환값이 없는 람다식";
//		System.out.println(str);
//		};
		
//		A_FuncInterface f1 = () -> {
//		System.out.println("매개변수와 반환값이 없는 람다식");
//		};
		
		A_FuncInterface f1 = () -> System.out.println("매개변수와 반환값이 없는 람다식");
		
		f1.method();
		
		
	}
	
	public void method2() {
		B_FuncInterface f1 = (int num) -> {
		System.out.println(num * 100);
		};
		
		f1.method(10);
		
		//매개변수의 자료형 생략
		f1 = (num) -> {
		System.out.println(num * 100);
		};
		
		f1.method(20);
		
		//실행문이 한줄이므로 {} 생략가능, 매개변수 1개 이므로 () 생략가능
		f1 = num -> System.out.println(num * 100);
		
		f1.method(30);
		
		System.out.println();
	}
	
	public void method3() {
		C_FuncInterface f1 = new C_FuncInterface() {
		@Override
		public int method(int a, int b) {
			return a+b;
		}
		};
		System.out.println("10 + 20 = " + f1.method(10, 20));
		
		
		f1 = (int x, int y) -> {
		return x+y;
		};
		System.out.println("10 + 20 = " + f1.method(10, 20));
		
		
		f1 = (x, y) -> x+y;
		System.out.println("10 + 20 = " + f1.method(10, 20));
		
		
		f1 = (x, y) -> sum(x, y);
		System.out.println("10 + 20 = " + f1.method(10, 20));
		
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public void method4(int arg) {
		int num = 20;
		
		A_FuncInterface f1 = new A_FuncInterface() {
		int num = 30;
		@Override
		public void method() {
			System.out.println(this.num);// 익명클래스에서 this 는 인스턴스 자신
			System.out.println(this.getClass());
		}
		};
		
		f1.method();
		
		System.out.println("----------------------------------------------------------------------------");
		
		A_FuncInterface f2 = () -> {
		System.out.println("this.num : " + this.num);//lambda 에서 this는 바깥 인스턴스에 대한 참조
		System.out.println("num : " + num);
		System.out.println("this.getClass() : " + this.getClass());
		
		//num = 0;
		num2 = 1;//인스턴스 변수는 재할당이 가능, final 이 아니어도 된다.
		//자유변수(Free Variable) : 람다식에 정의된 매개변수가 아니고 외부에서 정의된 변수
		//람다식 내부에서 자유변수를 참조하는 행위를 람다 캡쳐링(Lambda Capturing)이라고 한다.
		System.out.println(num2);
		System.out.println(num);
		};
		
//		num = 1;//자바 8 이후 내부족으로 지역변수(매개변수) 를 final이거나 effectively final 이어야함.
//		arg = 2;
		f2.method();
		
		
		// 람다식에서 로컬변수(매개변수)를 이용할 경우 로컬변수(매개변수) final이거나 effectively final 이어야한다.
		//  - 로컬변수(매개변수)는 람다식에서 읽는 것은 허용하지만, 람다식 내부에서 또는 외부에서 변경 할 수 없다.
		//  - 초기화 된 이후 값이 한번도 변경되지 않는 변수를 effectively final이라고 한다.
		//  - 자바 8 이후 내부적으로 final로 인식
	}
}
