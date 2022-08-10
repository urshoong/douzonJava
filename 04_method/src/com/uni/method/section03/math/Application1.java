package com.uni.method.section03.math;

public class Application1 {

	public static void main(String[] args) {
		
		/* API란?
		 * Application Programming Interface는 응용프로그램에서 사용할 수 있도록,
		 * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
		 * 쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)들을 의미한다.
		 * 더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.
		 * 모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있다.
		 * */
		
		/* java.lang.Math */
		/* Math 클래스는 수학에서 자주 사용하는 상수들과 함수 들을 미리 구현해놓은 클래스이다.
		 * API문서 보는거 설명하면서 static member로만 구성되어 있는 것을 보여준다.
		 * 다른 클래스에 정의된 static 메소드호출을 할 수 있을 것이다.
		 * */
		
		/* 절대값 출력 */
		System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
		
		
		/* java.lang 패키지는 java에서 이미 추가되어 컴파일되어 있기 때문에 import하지 않아도 사용할 수 있다. */
		System.out.println("-7의 절대값 : " + (Math.abs(-7)));
		
		//10, 20 최대값, 최소값
		System.out.println("10과 20의 최대값은 : " + Math.max(10, 20));
		System.out.println("10과 20의 최소값은 : " + Math.min(10, 20));
		
		// 0.0 ~ 0.999999.. 사이의 난수
		System.out.println("난수발생 : " + Math.random());
	}

}
