package com.uni.section01.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크(Collection Framework) */
		/* 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
		 * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
		 * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다. */
		
		/* Collection Framework는 크게 3가지 인터페이스중 한 가지를 상속받아 구현해 놓았다.
		 * 1. List 인터페이스
		 * 2. Set 인터페이스
		 * 3. Map 인터페이스
		 * 
		 * List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
		 * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
		 * */
		
		/* 각 인터페이스 별 특징
		 * 1. List 인터페이스
		 *  - 순서 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
		 *  - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
		 * 2. Set 인터페이스
		 *  - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
		 *  - HashSet, TreeSet 등이 있다.
		 * 3. Map 인터페이스
		 *  - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
		 *  - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
		 *  - value는 중복된 값을 저장할 수 있다.
		 *  - HashMap, TreeMap, HashTable, Properties 등이 있다.
		 *  */
		
		/* List와 Set의 공통인 Collection 인터페이스 주요 메소드
		 * add(), clear(), contains(), equals(), isEmpty(), 
		 * iterator(), remove(), size(), toArray() 등이 있다.
		 *  */
		
		/* ArrayList
		 * 가장 많이 사용되는 컬렉션 클래스 이다.
		 * JDK 1.2부터 제공된다.
		 * 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
		 * 
		 * ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
		 * 배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
		 * ArrayList는 저러한 배열의 단점을 보완하고자 
		 * 크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
		 * 자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
		 * */
		
		ArrayList alist = new ArrayList();
		
//		다형성이 적용 되어 상위레퍼런스로 ArrayList 객체를 만들 수 있다
		List list = new ArrayList();
		
		Collection clist = new ArrayList();
		
		alist.add("apple");
		alist.add(123);//autoBoxing 처리됨(값 -> 객체)
		alist.add(45.67);
		alist.add(new Date());
		
//		toString 이 오버라이딩 되어 있다.
		System.out.println(alist.toString());
		
//		arraylist 의 키그릴 확인, 요수의 갯수 반환
		System.out.println(alist.size());
		
//		index가 지정되어 있어 for문으로 접근 가능
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));//값을 가져올 때 get()
		}
		
//		중복 저장 가능
		alist.add("apple");
		System.out.println(alist);
		
//		원하는 인덱스 위치에 값을 추가 가능, 값을 추가하는 경우 덮어쓰는것이 아니고 
//		새로운 값이 들어가는 인덱스 위치 넣고 인덱스가 하나씩 뒤로 밀림
		alist.add(1, "banana");
		System.out.println(alist);

		
		alist.remove(2);//저장된 값 삭제할 때 remove()
		System.out.println(alist);
		
		alist.set(1, new Boolean(true));
		System.out.println(alist);
		
		
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
//		stringList.add(123);
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("mango");
		stringList.add("grape");
		
		System.out.println("stringList : " + stringList);
		
		/* Collection 인터페이스가 아닌 Collections 클래스이다.
		 * Collection에서 사용되는 기능들을 static 메소드들로 구현한 클래스이며
		 * 인터페이스명 뒤에 s가 붙은 클래스들은 관례상 비슷한 방식으로 작성된 클래스를 의미하게 된다.
		 * */
		Collections.sort(stringList);
		
//		sort 메소드 사용시 list가 오름차순으로 정렬
		System.out.println("stringList sort : " + stringList);
		
		stringList = new LinkedList<>(stringList);
		/* Iterator란?
		 * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
		 * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
		 * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
		 * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
		 * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
		 * 
		 * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false를 반환
		 * next() : 다음 요소를 반환
		 * */
		
		Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
		
		List<String> descList = new ArrayList<String>(stringList);
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		System.out.println(descList);
	}

}
