package com.uni.section03.incre_decre_operator;

public class Application1 {

	public static void main(String[] args) {
		/* 증감연산자 */
		/* 피연산자의 앞 or 뒤에 사용이 가능하다. */
		/* '++' : 1 증가의 의미
		 * '--' : 1 감소의 의미
		 * */
		
		int num = 20;
		System.out.println("num : " + num);
		
		num++;      //1 증가
		System.out.println("num : " + num);
		
		++num;      //1 증가
		System.out.println("num : " + num);
		
		num--;      //1 감소
		System.out.println("num : " + num);
		
		--num;      //1 감소
		System.out.println("num : " + num);
		
		/* 단항으로 사용될 때는 1 증가/1 감소의 의미를 가진다. */
		
		/* 하지만! 문제는 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다. */
		/* 다른 연산자와 함께 사용할 때 증감 연산자의 의미
		 * '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
		 * 'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
		 * '--var' : 피연산자의 값을 먼저 1 감소 시킨 후 다른 연산을 진행함
		 * 'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
		 * (증감연산자)값 : 전위 연산자 --> 선증감 후처리
		 * 값(증감연산자) : 후위 연산자 --> 선처리 후증감
		 * */
		
		int firstNum = 20;
		int result1 = firstNum++ * 3;
		System.out.println("result1 : " + result1);//60
		System.out.println("firstNum : " + firstNum);//21
		
		int secondNum = 20;
		int result2 = ++secondNum * 3;
		System.out.println("result2 : " + result2);//63
		System.out.println("secondNum : " + secondNum);//21
		
		int num1 = 10;
		int addNum = num1++;
		System.out.println("addNum : " + addNum);
		
		/*
		 * int a = 10;
		 * int b = 20;
		 * int c = 30;
		 * System.out.println(a++);// a = 10(11)
		 * System.out.println((++a) + (b++));// a = 12, b = 20(21) --> 32
		 * System.out.println((a++) + (--b) + (--c));// a = 12(13), b = 20, c = 29 --> 61
		 * System.out.println("a : " + a);
		 * System.out.println("b : " + b);
		 * System.out.println("c : " + c);
		 */
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;// a = 6, b = 10 --> c = 16
		int d = c / a;// a = 6, c = 16 --> d = 2
		int e = c % a;// a = 6, c = 16 --> e = 4
		int f = e++;// e = 4(5) --> f = 4
		int g = (--b)+ (d--);// b = 9, d = 2(1) --> g = 11
		int h = 2;
		int i = a++ + b / (--c / f ) * (g-- - d) % (++e + h);
		// a = 6(7), b = 9, c = 15, d = 1, e = 6, f = 4, g = 11(10), h = 2 --> i == 12  
		
		// 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2) = 
		// 6 + 9 / 3 * 10 % 8
		// 6 + 3 * 10 % 8
		// 6 + 30 % 8
		// 6 + 6
		// --> 12
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
	}

}
