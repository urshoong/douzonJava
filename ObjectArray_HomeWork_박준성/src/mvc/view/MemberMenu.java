package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		label:
		while(true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("========================");
			System.out.print("메뉴 : ");
			int menu = sc.nextInt(); sc.nextLine();
			
			switch(menu) {
				case 1:
					this.insertMember();
					break;
				case 2:
					this.searchMember();
					break;
				case 3:
					this.updateMember();
					break;
				case 4:
					this.deleteMember();
					break;
				case 5:
					this.printAllMember();
					break;
				case 6:
					this.sortMember();
					break;
				case 9:
					System.out.println("프로그램 종료");
					break label;
				default:
					System.out.println("올바른 번호르 입력해주세요.");
					break;
			}
		}
		
		sc.close();
	}
	
	public void insertMember() {
		int memberCount = mc.getMemberCount();
//		System.out.println(memberCount);
		if(memberCount >= MemberController.SIZE) {
			System.out.println("회원수가 가득찼습니다.");
			return;
		}
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
//		String userPwd = "";
//		String name = "";
//		int age = 0;
//		char gender = '\u0000';
//		String email = "";
		
		Member check = mc.checkId(userId);
		if(check != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			return;
		}
		
		System.out.print("패스워드 : ");
		String userPwd = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt(); sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0); sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		Member m = new Member(userId, userPwd, name, age, gender, email);
		mc.insertMember(m);
	}
	
	public void searchMember() {
		label:
		while(true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.println("========================");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt(); sc.nextLine();
			
			switch(menu) {
				case 1://아이디
				case 2://이름
				case 3://이메일
					System.out.print("검색 내용 : ");
					String search = sc.nextLine();
					Member m = mc.searchMember(menu, search);
					if(m == null) {
						System.out.println("검색된 결과가 없습니다.");
					}else {
						System.out.println(m.information());
					}
					break;
				case 9:
					break label;
				default:
					System.out.println("올바른 메뉴를 선택해주세요");
					break;
			}
		}
	}
	
	public void updateMember() {
		label:
		while(true) {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.println("========================");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt(); sc.nextLine();
			
			switch(menu) {
				case 1://비밀번호
				case 2://이름
				case 3://이메일
					System.out.print("변경할 회원 아이디 : ");
					String userId = sc.nextLine();
					
					Member m = null;
					m = mc.checkId(userId);
					if(m == null) {
						System.out.println("변경할 회원이 존재하지 않습니다.");
						break;
					}else {
						System.out.print("변경할 내용 : ");
						String update = sc.nextLine();
						mc.updateMemeber(m, menu, update);
						System.out.println("회원의 정보가 변경되었습니다.");
					}
					
					break;
				case 9:
					break label;
				default:
					System.out.println("올바른 메뉴를 선택해주세요");
					break;
			}
		}
	}
	
	public void deleteMember() {
		label:
		while(true) {
			System.out.print("삭제할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			Member check = mc.checkId(userId);
			if(check == null) {
				System.out.println("삭제할 회원이 존재하지 않습니다.");
			}else {
				System.out.println(check.information());
				System.out.print("정말 삭제하시겠습니까?(y/n) : ");
				char gbn = sc.next().charAt(0);
				switch(gbn) {
					case 'y':
					case 'Y':
						mc.deleteMember(userId);
						System.out.println("회원의 정보가 삭제되었습니다.");
						break label;
					case 'n':
						break label;
					default:
						break;
				}
			}
		}
	}
	
	public void printAllMember() {
		Member[] mem = mc.getMem();
		for(int i = 0; i < MemberController.SIZE; i++) {
			if(mem[i] != null) {
				System.out.println(mem[i].information());
			}
		}
	}
	
	public void sortMember() {
		Member[] sortMem = null;
		label:
		while(true) {
			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");
			System.out.println("========================");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt(); sc.nextLine();
			switch(menu) {
				case 1://아이디 오름차순
					sortMem = mc.sortIdAsc();
					break;
				case 2://아이디 내림차순
					sortMem = mc.sortIdDesc();
					break;
				case 3://나이 오름차순
					sortMem = mc.sortAgeAsc();
					break;
				case 4://나이 내림차순
					sortMem = mc.sortAgeDesc();
					break;
				case 5://성별 내림차순(남여순)
					sortMem = mc.sortGenderDesc();
					break;
				case 9:
					break label;
				default:
					break;
			}
			
			for(Member m : sortMem) {
				System.out.println(m.information());
			}
		}
	}
}
