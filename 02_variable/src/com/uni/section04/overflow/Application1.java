package com.uni.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 오버플로우 - 자료형별 값의 최대 범위를 벗어나는 경우 */
		
		byte num1 = 127;
		System.out.println("num1 : " + num1); //127 : byte의 최대 저장 범위
		
		num1++; //1 증가
		System.out.println("num1 : " + num1); //-128 : byte의 최소 저장 범위
		
		/* 언더플로우 - 오버플로우의 반대 개념으로 최소 범위보다 작은수를 발생시키는 경우 발생하는 현상 */
		
		byte num2 = -128;
		System.out.println("num2 : " + num2);
		num2--;
		System.out.println("num2 : " + num2);
		
		
		num1 = 127;
		System.out.println(num1);
		byte result1 = (byte) (num1 + 3);
		System.out.println(result1);
		
		int firstNum = 1000000;
		int secondNum = 780000;
		int multi = firstNum * secondNum;
		System.out.println(multi);
		long longMulti = (long)firstNum * secondNum;
		System.out.println(longMulti);
	}

}
