package com.uni.section01.generic;

public class GenericTest<T> {
	/* 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다. 
	 * 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
	 * */
	
	/* 다이아몬드 연산자 내부에 작성한 T는 타입 변수라고 부른다.
	 * 타입변수를 자료형 대신 사용할 것인데, 가상으로 존재하는 타입이며
	 * T가 아닌 다른 영문자를 사용해도 무방하다.
	 * 또한 여러 개의 타입변수를 작성할 때는 ,를 이용해서 여러 개 기술할 수 도 있다.
	 * 사용하는 쪽에서는 작성한 제네릭 클래스를 이용할 시
	 * 실제 사용할 타입을 타입변수 자리에 맞춰서 넣어주게 되면 컴파일이 시점에서 타입이 결정되게 된다.
	 * */
	
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
}
