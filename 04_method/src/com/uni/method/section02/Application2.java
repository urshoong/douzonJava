package com.uni.method.section02;
// ctrl + shift + o 임포트 정리
import com.uni.method.section01.Calculator;
import static com.uni.method.section01.Calculator.maxNumberOf;

public class Application2 {

	public static void main(String[] args) {
		
		/* 패키지와 임포트 */
		/* 임포트 : 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
		 *        하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
		 *        그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
		 *        import는 package 선언문과 class 선언문 사이에 작성하며
		 *        어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
		 * */
		
		/* non static 메소드 */
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(30, 20);
		System.out.println(min);
		
		/* static 메소드 */
		int max = Calculator.maxNumberOf(30, 20);
		System.out.println(max);
		
		/* static 메소드 */
		int max1 = maxNumberOf(30, 20); // import static 해주고 나서 사용
		System.out.println(max);
	}

}
