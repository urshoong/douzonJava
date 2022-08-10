package com.uni.method.section03.scanner;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		
		/* 스캐너 주의 사항 */
		/* 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
		 * 그래서 크게 두 가지 사항을 주의해야 한다.
		 * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때 
		 * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
		 * */
		
		/* 스캐너 객체 생성 */
		Scanner sc = new Scanner(System.in);
		
		/* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때  */
		
		System.out.print("문자열을 입력해주세요 : ");
		String str1 = sc.next();            //공백이나 개행문자 전 까지를 읽어온다.
		System.out.println("str1 : " + str1);
		sc.nextLine();
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();            //정수 값을 읽어온다.
		System.out.println("num1 : " + num1);
		
		
		/* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
		System.out.print("다시 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println("num2 : " + num2);
		
		System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
		sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		
		/**
		 * sc.nextLine() : 버퍼에서 '엔터' 이전까지의 모든 값을 가져온 후 '엔터'를 비워주는 역할
		 * 그 외의 메소드  : 버퍼에서 '엔터' 이전까지의 값을 가져온 후 '엔터'를 비워주지 않음
		 * 
		 * 따라서 sc.nextInt() 후 sc.nextLine()이 오게 되면 버퍼에 남아있는 '엔터'를 sc.nextLine()이 인식하여 사용자가  값을 입력했다고 생각한 후 읽어오고 넘어가버림
		 * 
		 * (실행 한 후 sc.nextLine() 적어주기) 
		 * sc.nextLine() 메소드를 제외한 다른 메소드들 (sc.next() 또는 sc.nextXXX())은
		 * 해당 값만 읽어온 채 사용자가 입력한 '엔터'는 버퍼에 남아있게된다.
		 * 
		 * 하지만 sc.nextLine() 메소드는 사용자가 입력한 한 줄에 대한 정보 모두 
		 * 즉, 엔터까지 모둘 읽어온다. 다시 말하면 나이를 입력할 때 sc.nextInt() 할 때 데이터를 입력하고 엔터를 쳤을 때 
		 * 값만 age에는 정수 값만 저장되고 '엔터'는 버퍼에 남아있는 상태이다.
		 * 
		 * 따라서 주소 값일 입력받을 때 사용되는 sc.nextLine() 메소드가 버퍼에 남아있는 '엔터'를 자동으로 읽어와서 입력이 끝났다고
		 * 생각하는 것 --> address 라는 문자열에는 빈값이 들어감
		 * 
		 * 결론 : sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드를 사용하게 된다면 버퍼에 남아있는 '엔터'를 빼주기 위해
		 * sc.nextLine() 메소드를 한 번 더 써주자
		 */
		
		
	}

}
