package com.uni.section08.initblock;

public class Product {
	//1. 아무 초기화 없이 product 객체 생성후 출력시 JVM이 정한 기본값으로 객체 생성되어있음
//	private String name;
//	private int price;
//	
//	private static String brand;
	
	//2. 필드에 명시적 초기화 한후 객체생성 해서 출력
	private String name = "은하수";
	private int price = 9000000;
	
	private static String brand = "삼성";
	
	
	//3. STATIC 블록 - 클래스변수를 초기화 시키는 블럭, 프로그램 시작시 단한번만 초기화
	static {
//		name = "아이돌"; -> static 블럭에서 인스턴스 변수를 초기화 못함
//		price = 1000000;
		
		brand = "엘지";
		
		System.out.println("정적 초기화 블럭 동작");
	}
	
	
	//4. 인스턴스 블록 - 인스턴스 변수를 초기화 시키는 블럭, 객체 생성시 마다 초기화. 생성자보다 먼저 실행됨.
	{
		name = "아이돌";
		price = 1000000;
		
		brand = "애플";
		
		System.out.println("인스턴스 초기화 블럭 동작");
	}
	
	
	
	
	public Product() {
		System.out.println("기본생성자가 호출됨");
	}
	
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		Product.brand = brand;
		
		System.out.println("매개변수있는 생성자 호출됨");
	}

	/* 필드값 문자열 합치기 한 문자열 반환용 메소드 */
	public String getInformation() {
		return "Product [name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";
	}
}
