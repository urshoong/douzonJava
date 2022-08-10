package com.uni.section01.list;

import java.util.Stack;

public class Application4 {

	public static void main(String[] args) {
		/* Stack */
		/* Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현하였다.
		 * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며 
		 * 후입선출(LIFO - Last Input First Out)방식의 자료 구조라 불린다. 
		 * */
		
		/* Stack 인스턴스 생성 */
		Stack<Integer> integerStack = new Stack<>();
		
		/* Stack에 값을 넣을 때는 push() 메소드를 이용한다. 
		 * add()도 이용 가능하지만 Vector의 메소드이다. 
		 * push()를 사용하는 것이 좋다.
		 * */
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		
		System.out.println(integerStack);
		
		/* 스택에서 요소를 찾을 때 search()를 이용할 수 있다. */
		/* 인덱스가 아닌 위에서부터의 순번을 의미한다.
		 * 또한 가장 상단의 위치가 0이 아닌 1부터 시작한다.
		 * 
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1    <-5   번쨰
		 * */
		System.out.println(integerStack.search(5));      //1 반환
		
		/* stack에서 값을 꺼내는 메소드는 크게 2가지로 볼 수 있다.
		 * peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 
		 * pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거
		 * */
		
		System.out.println("peek() : " + integerStack.peek());
		System.out.println(integerStack);
		
		/* 꺼내면서 요소를 제거하기 때문에 스택이 비어 있는 경우 에러 발생할 수 있다. */
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
//		System.out.println("pop() : " + integerStack.pop());      //EmptyStackException 발생
		System.out.println(integerStack);
	}

}
