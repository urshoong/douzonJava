package com.uni.method.section01;

public class Application3 {

	public static void main(String[] args) {
		
		/* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출 */
		/* 지금까지 우리개 배운 변수는 지역변수에 해당한다.
		 * 다양한 변수의 종류들이 존재하는데 차차 배워 내갈 것이다.
		 * 
		 * 변수의 종류
		 * 1. 지역변수
		 * 2. 매개변수
		 * 3. 전역변수(필드)
		 * 4. 클래스(static)변수
		 * 
		 * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
		 * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
		 * 이 때 전달하는 값을 전달인자(argument)라고 부르고, 
		 * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
		 * */
		
		Application3 app3 = new Application3();
		
		/* 1. 전달인자로 값 전달 테스트 */
		/* 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과, 갯수, 순서가 일치하게 값을 넣어 호출해야 한다. */
		app3.testMethod(40);
//		app3.testMethod("40");
//		app3.testMethod(40, 20, 30);
		
		
		/* 2. 변수에 저장한 값 전달 테스트 */
		/* 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있다. */
		int age = 20;
		app3.testMethod(age);
		
		
		/* 2-2. 자동형변환을 이용하여 값 전달을 할 수 있다. */
		byte byteAge = 10;
		app3.testMethod(byteAge);
		
		
		/* 2-3. 강제형변환을 이용하여 값 전달을 할 수 있다. */
		long longAge = 80L;
		app3.testMethod((int) longAge);
		
		
		/* 2-4. 연산 결과를 이용해서 값 전달을 할 수 있다. */
		app3.testMethod(age * 3);
		
	}
	
	public void testMethod(int age) {
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}
	
	public void testMethod1(int age, int age2, int age3) {
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}

}
