package com.uni.lambda.standard_functional;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.uni.lambda.standard_functional.dto.Student;

/*
 * Predicate<T> - test(T t) - 파라미터 있고 리턴값(boolean) 있는 CASE
 *   - Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
 *   - 이 메소드들은 매개값을 조사해서 true/false를 리턴하는 역활을 한다.
 * 
 */
public class E_Predicate {
	public void method1() {
		Predicate<String> predicate1 = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length() > 5;//매개변수값을 ㅂ다아서 true/false 를 반환할 조건식
			}
		};
		
		String str = "lambda";
		boolean r1 = predicate1.test(str);
		System.out.println(r1);
		
		Predicate<Integer> predicate2 = value -> value > 1000;
		int number = 99;
		boolean r2 = predicate2.test(number);
		System.out.println(r2);
		
		
		Predicate<Integer> predicate3 = value -> value > 10;
		boolean r3 = predicate2.and(predicate3).test(5);
		System.out.println(r3);
		
		boolean r4 = predicate2.or(predicate3).test(15);
		System.out.println(r4);
		
		System.out.println("-----------------------------------------------------");
		
		Student st1 = new Student("유재석", 20, "M", 80, 70);
		Student st2 = new Student("이효리", 20, "F", 100, 70);
		
		
		Predicate<Student> predicate = s -> s.getGender().equals("M");
		System.out.println(st1.getName() + " 남자입니까? " + predicate.test(st1));
		System.out.println(st2.getName() + " 남자입니까? " + predicate.test(st2));
		System.out.println("유재석의 평균 점수는 : " + avg(s -> s.getMath() > 50 && s.getEnglish() > 50 , st1));
		
		IntPredicate intPredicate = i -> i > 100;
		System.out.println(intPredicate.test(100));
		System.out.println(intPredicate.test(1000));
		
		
		
		
		
		
		
	}
	
	
	public double avg(Predicate<Student> predicate, Student student) {
		double avg = 0;
		if(predicate.test(student)) {
			avg = (student.getMath() + student.getEnglish()) / 2.0;
		}
		return avg;
	}
}
