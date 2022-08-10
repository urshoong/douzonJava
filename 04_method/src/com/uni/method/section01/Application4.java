package com.uni.method.section01;
/* alt + shift =  */
/**
 * <pre>
 * Class : 클래스의 이름
 * Comment : 클래스에 대한 설명
 * History
 * 2020/09/08 (작성자) 처음 작성함
 * </pre>
 * @author 작성자
 * @version 1.0.0
 * @see 참고할 class나 외부 url
 * */
public class Application4 {

	public static void main(String[] args) {
		/* 여러 개의 전달인자를 이용한 메소드 호출 테스트 */
		/* 1. 여러 개의 매개변수를 가진 메소드 호출 */
		
		Application4 app4 = new Application4();
		
		app4.testMethod("홍길동", 20, '남');
//		app4.testMethod(20, "유재석", 0);
		
		/* 2. 변수에 값을 저장해서 전달하여 호출 */
		String name = "유재석";
		int age = 20;
		char gender = '여';
		
		app4.testMethod(name, age, gender);
		
	}
	/**
	 * <pre>
	 * 이름과 나이와 성별을 전달받아 한 번에 출력해주는 기능을 제공합니다.
	 * </pre>
	 * @param name 출력할 이름을 전달해주세요
	 * @param age 출력할 나이를 전달해주세요
	 * @param gender 출력할 성별을 전달해주세요. 성별은 변경되지 않을 것을 보장합니다.
	 */
	private void testMethod(String name, int age, final char gender) {
		/* 매개변수도 일종의 지역변수로 분류된다.
		 * 매개변수 역시 final 키워드를 사용할 수 있다.
		 * 지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다.
		 * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다. (써도 되고 안써도 됨)
		 * */
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
	}
	
	/** 문서화 주석 다는 이유 
	 * 어떤값을 받아서 어떤 값을 반환하는지 작성 하여 다른 사람들이 그리고 내가 확인 하고 어떤 메소드인지 쉽게 알수있다.협업에 용이 
	 * <pre>
	 *  기능설명
	 * </pre>
	 * @param  파람에 개한 설명을 개별적으로 작성
	 * @return  반환할 값에 대해 작성 
	 * api 에보면 모두 설명이 작성되어있다. 그것과 같은맥락 
	 * @author 최초작성자
	 * @since 최초만든날짜 
	 * @version 버전작성 1.0.0 수정되면 버전을 올린다. 수정사항수정내용작성자도 함께 작성 
	 * 
	 * 메소드에 마우스 올리면 내가작성한 주석이 보인다. 
	 * 
	 * **/

}
