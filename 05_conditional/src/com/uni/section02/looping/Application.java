package com.uni.section02.looping;

public class Application {

	public static void main(String[] args) {
		/**
		 * 반복문 : 프로그램의 수행흐름을 제어하는 제어문중 하나, 어떤 실행코드를 반복적으로 수행시켜준다.
		 * 
		 * for문/while문( do- while문)
		 * 
		 * *for문
		 * 
		 * for(초기식;조건식;증감식){//반복 횟수를 지정하기위해서 제시하는것들 ..반복적으로 실행시키고자 하는 실행 구문..
		 * 
		 * }
		 * 
		 * -초기식 : 반복문이 수행될때 "단 한번만 실행되는 구문" 
		 *		  (보통 반복문 안에서 사용될 변수를 선언하고 초기값을 대입하는 구문) 
		 * -조건식 : "반복문이 수행될 조건" 을 작성하는 구문 
		 *		  조건식이 true일 경우 해당 실행 구문을 실행 
		 *		  조건식이 false일 경우 반복을 멈추고 빠져나옴 (보통 초기식에서 사용된 변수를 가지고 조건식을 작성) 
		 * -증간식 : 반복문을 제어하는 변수값을 증감시키는 부분 
		 *		  (주로 초기식에 제시한 변수를 가지고 증감 연산자 사용)
		 * 
		 * 
		 * for문 초기식--> 조건식 검사 -> true일 경우 실행구문을 실행 --> 증감식 
		 *		   --> 조건식 검사 -> true일 경우 실행구문을 실행 --> 증감식 
		 *		   --반복-- 
		 *		   --> 조건식 검사 -> false일 경우 실행구문을 실행 하지 않음 --> 반복문을 빠져나옴
		 * 
		 * * 알아둘것 ~
		 *   for 문안에 있는 초기식, 조건식, 증감식은 모두 생략 가능 하긴 함(하지만 ; 은 반드시 필수 작성)
		 *   즉,for() 안에서만 생략 될뿐 모두 필요한 요소임.  
		 */
//		A_for a = new A_for();
//		a.testSimpleForStatement();
//		a.testForExample1();
//		a.testForExample2();
//		a.testForExample3();
//		a.testForExample4();
//		a.printSimpleGugudan();
		
//		A_nestedFor b = new A_nestedFor();
//		b.printGugudanFromTwoToNine();
//		b.printUpgradeGugudanFromTwoToNine();
//		b.printStarInputRowTimes();
//		b.printTriangleStarts();
		
//		B_while c = new B_while();
//		c.testSimpleWhileStatement();
//		c.testWhileExample1();
//		c.testWhileExample2();
//		c.testWhileExample3();
		
		C_doWhile d = new C_doWhile();
//		d.testSimpleDoWhileStatement();
		d.testDoWhileExample1();
	}

}
