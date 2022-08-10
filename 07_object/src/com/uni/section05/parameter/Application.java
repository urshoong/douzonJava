package com.uni.section05.parameter;

public class Application {

	public static void main(String[] args) {
		/* 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하며 호출할 수 있다. 
		 * 
		 * 매개변수(parameter)로 사용 가능한 자료형
		 * 1. 기본자료형
		 * 2. 기본자료형 배열
		 * 3. 클래스자료형
		 * 4. 클래스자료형 배열
		 * 5. 가변인자
		 * */
		
		ParameterTest pt = new ParameterTest();
		int num = 20;
		pt.testPrimaryTypeParameter(num);
		
		int[] iarr = new int[] {1, 2, 3, 4, 5};
		pt.testPrimaryTypeArrayParameter(iarr);
		System.out.println("변경 후 배열의 값 출력 : ");
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
		
		RectAngle r1 = new RectAngle(12.6, 22.5);
		
		System.out.println("인자로 전달하는 값 : " + r1);
		
		r1.testClassTypeParameter(r1);
		
		System.out.println("변경 후 사각형의 넓이와 둘레 ========================");
		r1.calcArea();
		r1.calcRound();
		
//		pt.testVariableLengthArrayParameter()//에러
		pt.testVariableLengthArrayParameter("로운");//가변인자는 전달하지 않아도 된다
		pt.testVariableLengthArrayParameter("로운", "볼링");
		pt.testVariableLengthArrayParameter("로운", "볼링", "골프", "서핑");
		pt.testVariableLengthArrayParameter("로운", new String[]{"볼링", "골프", "서핑"});
	}
	
}
