package com.uni.section07.kindofvariable;

public class KindOfVariable {
	/**
	 * 클래스 == "필드" + 생성자 + 메소드   의 조합
	 * 
	 * >> 변수구분
	 * 
	 * - 전역변수 : 클래스 영역에 바로 선언하는 변수 --> 클래스 내에서면 어디서든 사용 가능
	 * - 지역변수 : 클래스 영역안의 어떤 특정한 구역 ({})에 선언하는 변수  --> 그 지역에서만 사용 가능
	 *           메소드, 제어문(if, for) 등등 
	 *           
	 * 1. 전역변수
	 * -  멤버변수 (인스턴스 변수)
	 *    생성 시점 : new 연산자를 통해서 객체 생성 시 멤버변수 --> 메모리 할당
	 *    소멸 시점 : 객체 소멸 시 같이 소멸
	 *    
	 * -  클래스변수 (static 변수) : static이라는 예약어가 붙은 변수
	 *    생성 시점 : 프로그램 실행(해당 객체 생성이 안되도)과 동시에 무조건 static 메모리 영역에 할당
	 *    소멸 시점 : 프로그램이 종료될 때 소멸
	 *    >> 클래스변수는 어떤걸 의미하냐면 프로그램 실행과 동시에 메모리에 올려놓고 공유하면서 쓸 목적으로 선언하는거임!!
	 * 
	 * 2. 지역변수
	 *    생성 시점 : 특정한 구역({}) 실행(호출)시 메모리 영역에 할당 (ex. 메소드 실행시)
	 *    소멸 시점 : 특정한 구역({}) 종료 시 소멸 (ex. 메소드 종료시)
	 *    
	 */
	
	/* 클래스 영역
	 * 필드와 메소드 작성가능 
	 * 클래스 영역에 작성하는 변수를 필드라고 한다.
	 * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	 * */
	
	/* non-static field를 인스턴스변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수라는 의미)- 생성자호출시 힙에할당 */
	private int globalNum;
	
	/* static file를 정적필드(클래스변수) 라고 한다. (정적(클래스) 영역에 생성되는 변수라는 의미이다)
	 *  -프로그램 실행될때 스테틱 키워드가 붙은것들을 모두 로드해서 공간을 할당하고 나서 프로그램동작됨.
	 *  메인메소드 동작이전에 스테틱 필드가 생성되어있다. */
	private static int staticNum;
	
	public void testMethod(int num) {//num 매개변수 : 지역변수
		//메소드 영역에서 작성하는 변수 - 지역변수
		int localNum;
		
		System.out.println(num);//매개변수는 호출시 값이 넘어와서 변경되기 때문에 초기화가 필요없다.
		
//		System.out.println(localNum);//지역변수는 초기화가 반드시 되어야 한다.
		
		System.out.println(globalNum);//전역변수는 클래스 전역에서 사용가능하다.
		System.out.println(staticNum);
	}
	
	public void testMethod2() {
//		System.out.println(localNum);//지역변수는 해당 지역(쁠럭) 내에서만 사용가능하다.
		System.out.println(globalNum);//전역변수는 클래스 전역에서 사용가능하다.
		System.out.println(staticNum);
	}
}//클래스 영역 끝

//public class Member() {}//퍼블릭은 1개만 가능
class Member {} //같은 패키지 내에서는 접근이 가능하며, 다른 패키지에서는 접근이 불가능하다.
