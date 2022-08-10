package com.uni.section02.assignment_operator;

public class Application1 {

	public static void main(String[] args) {
		/* 대입연산자와 산술 복합 대입 연산자  */
		/* '='  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
		 * '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
		 * '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
		 * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
		 * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
		 * '%=' : 왼족의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
		 * */
		
		int num = 12;
		System.out.println("num : " + num);//12
		
		num = num + 3;
		System.out.println("num : " + num);//15
		
		num += 3;
		System.out.println("num : " + num);//18
		
		num -= 5;
		System.out.println("num : " + num);//13
		
		num *= 2;
		System.out.println("num : " + num);//26
		
		num /= 2;
		System.out.println("num : " + num);//13
		
		num =- 5;//-5
		System.out.println("num : " + num);//-5
	}

}
