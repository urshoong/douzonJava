package com.uni.section05.parameter;

public class ParameterTest {
	public void testPrimaryTypeParameter(int num) {

		System.out.println("매개변수로 전달받은 값 : " + num);

	}

	public void testPrimaryTypeArrayParameter(int[] iarr) {

		/*
		 * 배열의 주소가 전달된다. 즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킨다.(얕은복사)
		 */
		System.out.println("매개변수로 전달받은 값 : " + iarr);

		/* 배열의 값 출력 */
		System.out.print("배열의 값 출력 : ");
		for (int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();

		/* 배열의 0번인덱스에 값 변경 */
		iarr[0] = 99;

		/* 값 변경 후 배열의 값 출력 */
		System.out.print("변경 후 배열의 값 출력 : ");
		for (int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();

	}
	
//	public void testVariableLengthArrayParameter(String...hobby) {}
//	public void testVariableLengthArrayParameter(String...hobby, String name) {//에러 - 인자가 여러개인 경우에 가변인자는 앞에 올 수 없다
	
	public void testVariableLengthArrayParameter(String name, String...hobby) {
		System.out.println("이름 : " + name);
		System.out.println("취미의 갯수 : " + hobby.length);
		System.out.print("취미 : ");
		for(int i = 0; i < hobby.length; i++) {
		   System.out.print(hobby[i] + " ");
		}
		System.out.println();
	}

}
