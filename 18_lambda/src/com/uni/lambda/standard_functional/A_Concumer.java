package com.uni.lambda.standard_functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;
/*
 *  Consumer<T> - accpet(T t) : 파라미터 있고 리턴값없는  CASE
 *   - Consumer 함수적 인터페이스는 리턴값이 없는 accept() 메소드를 가지고 있다.
 *   - accept() 메소드는 단지 매개값을 소비하는 역활을한다. (사용만하고 리턴값이 없다.)
 *   @param <T> the type of the input to the operation
		  void accept(T t) 
 *   
 */
public class A_Concumer {
	public void method1() {
		Consumer<String> consumer1 = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		consumer1.accept("consumer test");
		
		//람다로 변경
		Consumer<String> consumer = t -> System.out.println(t);
		consumer.accept("Consumer : 한개의 매개값(제네릭으로 지정된 타입) 을 받아서 소비한다");
		
		Consumer<String> consumer2 = t -> System.out.println("매개값 출력 -> " + t);
		consumer2.accept("consumer test1");
		
		System.out.println("-----------------------------------");
		
		consumer2.andThen(consumer).accept("consumer test2");
		
		
		
		/* 
		Consumer 에서 파생된 인터페이스
		BiConsumer :  파라미터 2개 
		DoubleConsumer : double타입의 파라미터
		IntConsumer : int타입의 파라미터
		LongConsumer : long타입의 파라미터
		ObjDoubleConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 double
		ObjIntConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 int
		ObjLongConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 long
		*/
		
		BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);
		biConsumer.accept("BiConsumer : ", "두개의 매개값을 받아서 소비한다.");
		
		DoubleConsumer dConsumer = (value) -> {
			System.out.println("DoubleConsumer :  하나의 double값을 받아서 소비한다.");
			System.out.println("\tvalue : " + value);
		};
		dConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (str, i) -> {
			System.out.println("objIntConsumer : 두개의 매개값(제네릭으로 지정된 타입 int) 을 받아서 소비한다.");
			System.out.println(str + i);
		};
		objIntConsumer.accept("java", 8);
	}
}
