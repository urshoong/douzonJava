package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private int memberCount = 0;
	private Member[] mem = new Member[SIZE];
	
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	
	public int getMemberCount() {
		int count = 0;
		for(int i = 0; i < mem.length; i++) {
			if(mem[i] != null) count++;
		}
		return this.memberCount = count;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		Member member = null;
		for(int i = 0; i < SIZE; i++) {
			if(mem[i] != null) {
				if(mem[i].getUserId().equals(userId)) member = mem[i];
			}
		}
		return member;
	}
	
	public void insertMember(Member member) {
		for(int i = 0; i < SIZE; i++) {
			if(mem[i] == null) {
				mem[i] = member;
				this.memberCount++;
				break;
			}
		}
	}
	
	public Member searchMember(int menu, String search) {
		Member member = null;
		for(int i = 0; i < SIZE; i++) {
			if(mem[i] != null) {
				switch(menu) {
					case 1://아이디
						if(mem[i].getUserId().equals(search)) member = mem[i];
						break;
					case 2:
						if(mem[i].getName().equals(search)) member = mem[i];
						break;
					case 3:
						if(mem[i].getEmail().equals(search)) member = mem[i];
						break;
					default:
						break;
				}
			}
		}
		return member;
	}
	
	public void updateMemeber(Member member, int menu, String update) {
		for(int i = 0; i < SIZE; i++) {
			if(mem[i] != null) {
				if(mem[i].hashCode() == member.hashCode()) {
					switch(menu) {
					case 1://비밀번호
						mem[i].setUserPwd(update);
						break;
					case 2://이름
						mem[i].setName(update);
						break;
					case 3://이메일
						mem[i].setEmail(update);
						break;
					default:
						break;
					}
				}
			}
		}
	}
	
	public void deleteMember(String userId) {
		for(int i = 0; i < SIZE; i++) {
			if(mem[i] != null) {
				if(mem[i].getUserId().equals(userId)) {
					mem[i] = null;
					this.memberCount--;
				}
			}
		}
	}
	
	public Member[] sortIdAsc() {
		Member[] copy = this.extractMember(mem);
		for(int i = 1; i < copy.length; i++) {
			for(int j = 0; j < copy.length; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
//					System.out.println("i : " + i + " j : " + j);
//					System.out.println(copy[i].information());
//					System.out.println(copy[j].information());
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
	
	public Member[] sortIdDesc() {
		Member[] copy = this.extractMember(mem);
		for(int i = 1; i < copy.length; i++) {
			for(int j = 0; j < copy.length; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
	
	public Member[] sortAgeAsc() {
		Member[] copy = this.extractMember(mem);
		for(int i = 1; i < copy.length; i++) {
			for(int j = 0; j < copy.length; j++) {
				if(copy[i].getAge() < copy[j].getAge()) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
	
	public Member[] sortAgeDesc() {
		Member[] copy = this.extractMember(mem);
		for(int i = 1; i < copy.length; i++) {
			for(int j = 0; j < copy.length; j++) {
				if(copy[i].getAge() > copy[j].getAge()) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
	
	public Member[] sortGenderDesc() {
		Member[] copy = this.extractMember(mem);
		for(int i = 1; i < copy.length; i++) {
			for(int j = 0; j < copy.length; j++) {
				if(copy[i].getGender() > copy[j].getGender()) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
	
	/**
	 * <pre>
	 * null인 데이터들을 제거하고 sort하기 위해서 추출함수 생성
	 * </pre>
	 * @param member 원본 member배열 객체
	 * @return 원본 member배열 값 중 유효한 값만 새로 배열 생성해서 리턴
	 */
	public Member[] extractMember(Member[] member) {
		Member[] extract = new Member[this.memberCount];
		int count = 0;
		for(int i = 0; i < SIZE; i++) {
			if(mem[i] != null) extract[count++] = mem[i];
		}
		return extract;
	}
}
