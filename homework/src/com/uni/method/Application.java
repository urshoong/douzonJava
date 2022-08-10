package com.uni.method;

public class Application {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.checkMethod();
		System.out.println("1부터 10까지의 합 : " +  c.sum1to10());
		c.checkMaxNumber(10, 20);
		System.out.println("10과 20의 합은 : " + c.sumTwoNumber(10, 20));
		System.out.println("10과 5의 차는 : " + c.minusTwoNumber(10, 5));
	}

}
