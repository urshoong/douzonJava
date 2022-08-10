package com.uni.section06.statickeyword;

public class StaticMethodTest {
	private int count;
	private static int staticCount;
	
	public void nonStaticMethod() {
		this.count++;
		StaticMethodTest.staticCount++;
		System.out.println("nonStaticMethod 호출됨");
	}
	
	public static void staticMethod() {
//		this.count++;// static 은 인스턴스 생성전에 프로그램 실행 시 이미 메모리에 올라가있고 인스턴스 생성하지 않고도 사용하는 스태틱 메소드이므로 this 주소를 사용할 수 없다.
		staticCount++;//스태틱으로 메모리에 올라가져있으니 사용가능하고, 같은 클래스 내에서는 클래스명. 생략 가능
		System.out.println("StaticMethod 호출됨");
	}
}
