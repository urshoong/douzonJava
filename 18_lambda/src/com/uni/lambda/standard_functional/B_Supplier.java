package com.uni.lambda.standard_functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
/*
 * Supplier<T>  - get() : 파라미터 없고 리턴값있는 CASE
 *   - Supplier 함수적 인터페이스는 매개 변수가 없고 리턴값이 있는 getXXX() 메소드를 가지고 있다.
 *   - 이 메소드들은 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역활을 한다.
 *      @param <T> the type of results supplied by this supplier
		 T get() :  T 타입으로 정해진 값을 반환한
 */
public class B_Supplier {

	public void method1() {
		Supplier<String> supplier1 = new Supplier<String>() {
			
			@Override
			public String get() {
				return "익명객체 - <T> Type 으로 정해진 값을 반환";
			}
		};
		System.out.println(supplier1.get());
		
		Supplier<String> supplier = () -> "Supplier : 제네릭으로 지정된 타입의 객체를 리턴";
		System.out.println(supplier.get());
		
		
		/* 
		Supplier 에서 파생된 인터페이스		   
		BooleanSupplier :  boolean 타입으로 반환 getAsBoolean()
		DoubleSupplier  :  double 타입으로 반환 getAsDouble()
		IntSupplier  :  int 타입으로 반환 getAsInt()
		LongSupplier  :  long 타입으로 반환 getAsLong()
		 */
		
		IntSupplier intSupplier = () -> 10 + 20;
		System.out.println("IntSupplier : int 값 리턴");
		System.out.println("리턴값 : " + intSupplier.getAsInt());
	}
	
}
