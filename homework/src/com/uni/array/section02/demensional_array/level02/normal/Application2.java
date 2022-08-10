package com.uni.array.section02.demensional_array.level02.normal;

public class Application2 {

public static void main(String[] args) {
		
		/* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
		 * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
		 * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
		 * 
		 * -- 출석부 --
		 * 1. 홍길동
		 * 2. 이순신
		 * 3. 유관순
		 * 4. 윤봉길
		 * 5. 장영실
		 * 6. 임꺽정
		 * 7. 장보고
		 * 8. 이태백
		 * 9. 김정희
		 * 10. 대조영
		 * 11. 김유신
		 * 12. 이사부
		 * 
		 * -- 출력 예시 --
		 * == 1분단 ==
		 * 홍길동 이순신
		 * 유관순 윤봉길
		 * 장영실 임꺽정
		 * 
		 * == 2분단 ==
		 * 장보고 이태백
		 * 김정희 대조영
		 * 김유신 이사부
		 */
		
	 
		int h = 3;
		int v = 2;
		String[] sarr = {"홍길동","이순신","유관순","윤봉길","장영실","임꺽정","장보고","이태백","김정희","대조영","김유신","이사부"};
		
		String[][] ssarr1 = new String[3][2];
		String[][] ssarr2 = new String[3][2];
		
		int sarrIndex = 0;
		for(int i = 0; i < ssarr1.length; i++) {
			for(int j = 0; j < ssarr1[i].length; j++) {
				ssarr1[i][j] = sarr[sarrIndex++];
			}
		}
		for(int i = 0; i < ssarr2.length; i++) {
			for(int j = 0; j < ssarr2[i].length; j++) {
				ssarr2[i][j] = sarr[sarrIndex++];
			}
		}
		
		print(ssarr1, 1);
		print(ssarr2, 2);
	}

	public static void print(String[][] sarr, int bundan) {
		System.out.println("== " + bundan + "분단 ==");
		for(int i = 0; i < sarr.length; i++) {
			for(int j = 0; j < sarr[i].length; j++) {
				System.out.print(sarr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
