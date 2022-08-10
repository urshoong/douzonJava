package com.uni.section01.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Queue */
		/* Queue는 선형 메모리 공간에 데이터를 저장하는
		 * 선입선출(FIFO - First Input First Out)방식의 자료구조이다. */
		
		/* Queue 자체로는 인터페이스 이기 때문에 인스턴스 생성이 불가능하다 */
//		Queue<String> que = new Queue<>();      //에러남
		
		/* LinkedList로 인스턴스 생성 - Queue api 보면 컬렉션 상속받아있다   */
		Queue<String> que = new LinkedList<>();
		
		/* 큐에 데이터를 넣을 때에는 offer()를 이용한다. */
		que.offer("first");
		que.offer("second");
		que.offer("third");
		que.offer("fourth");
		que.offer("fifth");
		
		System.out.println(que);
		
		/* 큐에서 데이터를 꺼낼 때는 2 가지가 있다
		 * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 오쇼)를 반환한다.
		 * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거한다.
		 * */
		System.out.println("peek() : " + que.peek());      //first
		System.out.println("peek() : " + que.peek());      //first
		
		System.out.println(que);         //5개 다 나옴
		
		System.out.println("poll() : " + que.poll());      //first
		System.out.println("poll() : " + que.poll());      //second
		
		System.out.println(que);
	}

}
