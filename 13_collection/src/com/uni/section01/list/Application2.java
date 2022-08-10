package com.uni.section01.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.uni.section01.list.comparator.AscendingPrice;
import com.uni.section01.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
		
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 제네릭의 타입 제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort가 사용 가능하다.*/
		System.out.println("가격 오름차순==========");
		bookList.sort(new AscendingPrice());
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
//		Comparator가 인터페이스 이기 때문에 인스턴스 생성할 수 없다.
//		bookList.sort(new Comparator<BookDTO>() {});
		
//		익명클래스 활용
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				// TODO Auto-generated method stub
				return o1.getPrice() >= o2.getPrice() ? -1 : 1;
			}
			
		});
		
		System.out.println("가격 내림차순==========");
		bookList.sort(new AscendingPrice());
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		
		bookList.sort(new Comparator<BookDTO>() {
			/* 문자열은 대소비교를 할 수 없다.
			 * 문자 배열로 변경 후 인덱스 하나하나를 비교해서 어느 것이 더 큰 값인지 확인해야 하는데
			 * String클래스의 CompareTo() 메소드에서 이미 정의해 놓았다. */
			
			/* 앞에 값이 더 작은 경우(즉, 바꾸지 않아도 되는 경우) 음수 반환, 
			 * 같으면 0 반환, 
			 * 앞에 값이 더 큰 경우 양수 반환 (즉, 바꿔야 하는 경우)
			 * */
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		System.out.println("제목 오름차순==========");
		bookList.sort(new AscendingPrice());
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		
		bookList.sort((BookDTO o1, BookDTO o2) -> o2.getTitle().compareTo(o1.getTitle()));
		
		System.out.println("제목 내림차순==========");
		bookList.sort(new AscendingPrice());
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
	}

}
