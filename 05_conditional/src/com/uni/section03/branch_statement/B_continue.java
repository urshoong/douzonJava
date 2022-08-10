package com.uni.section03.branch_statement;

public class B_continue {
	/* continue문은 반복문 내에서 사용한다.
	 * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
	 * 일반적으로 if(조건식) { continue; } 처럼 사용된다.
	 * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
	 * */
	
	/* 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력 */
	public void testSimpleContinueStatement() {
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0 && i % 5 == 0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}
	
	public void testSimpleContinueStatement2() {
		/* 구구단 2~9단까지 출력
		 * 단 각 단의 수가 짝수인 경우 출력을 생략한다.
		 * */
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				if(su % 2 == 0)	{
					continue;
				} else {
					System.out.println(dan + " X " + su + " = " + (dan * su));
				}
			}
			System.out.println();
		}
	}
	
	public void testJumpContinue(){
		label:
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				if(su % 2 == 0)	{
					continue label;
				} else {
					System.out.println(dan + " X " + su + " = " + (dan * su));
				}
			}
			System.out.println();
		}
	}
}
