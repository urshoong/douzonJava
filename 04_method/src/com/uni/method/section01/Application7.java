package com.uni.method.section01;

/**
 * <pre>
 * Class : Application7
 * Comment : 인자를 전달받아 값을 리턴하는 메소드 실습
 * History
 * 2022/08/02 박준성 처음 작성함
 * </pre>
 * @author 박준성
 * @version 1.0.0
 * */
public class Application7 {

	public static void main(String[] args) {
		Application7 app7 = new Application7();
		
		int first = 20;
		int second = 10;
		
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first, second));
		
	}

	/**
	 * <pre>
	 * 두 수를 받아 나눈 결과를 리턴하는 메소드
	 * </pre>
	 * @param first 첫번째 int 형 값
	 * @param second 두번째 int 형 값
	 * @return 첫번째 값에 두번째 값을 나눈 결과 리턴
	 */
	public int divideTwoNumbers(int first, int second) {
		return first/second;
	}

	/**
	 * <pre>
	 * 두 수를 받아 곱한 결과를 리턴하는 메소드
	 * </pre>
	 * @param first 첫번째 int 형 값
	 * @param second 두번째 int 형 값
	 * @return 첫번째 값에 두번째 값을 곱한 결과 리턴
	 */
	public int multipleTwoNumbers(int first, int second) {
		return first*second;
	}

	/**
	 * <pre>
	 * 두 수를 받아 뺀 결과를 리턴하는 메소드
	 * </pre>
	 * @param first 첫번째 int 형 값
	 * @param second 두번째 int 형 값
	 * @return 첫번째 값에 두번째 값을 뺀 결과 리턴
	 */
	public int minusTwoNumbers(int first, int second) {
		return first-second;
	}

	/**
	 * <pre>
	 * 두 수를 받아 더한 결과를 리턴하는 메소드
	 * </pre>
	 * @param first 첫번째 int 형 값
	 * @param second 두번째 int 형 값
	 * @return 첫번째 값에 두번째 값을 더한 결과 리턴
	 */
	public int plusTwoNumbers(int first, int second) {
		return first+second;
	}
	
}
