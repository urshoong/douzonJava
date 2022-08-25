package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] cList = new Book[5];
		
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				cList[i] = bList[i];
			}
		}
		/*
		Book[] cList = null;
		for(int i = 0, size = 0, idx = 0; i < 2; i++) {
			//cList 초기화
			if(i == 1) cList = new Book[size];
			
			for(int j = 0; j < bList.length; j++) {
				String title = bList[j].getTitle();
				if(i == 0) {
					//cList 초기화할 size check
					if(title.contains(keyword)) {
						size++;
					}
				}else {
					//cList로 필요한 데이터 카피
					if(title.contains(keyword)) {
						cList[idx++] = bList[j];
					}
				}
			}
		}
		*/
		return cList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index-1] instanceof AniBook) {//만화책
			if(mem.getAge() < ((AniBook)bList[index-1]).getAccessAge() ) {
				result = 1;
			}
		}else if(bList[index-1] instanceof CookBook) {//요리책
			if(((CookBook)bList[index-1]).isCoupon()) {
				result = 2;
				mem.setCouponCount(mem.getCouponCount() + 1);
			}
		}
		return result;
	}
}
