package com.hw6.controller;

import java.util.Calendar;
import java.util.HashMap;

public class DateCalculator {
	public DateCalculator() {}
	
	public long leapDate() {
//		1년 1월 1일부터 오늘까지의 총 날 수를 계산
//		1년부터 현재 연도까지 각 연 도가 윤년이면 총 날수에 366 일을, 
//		평년이면 365일을 더함 
//		해당 현재 연도가 윤년이면 2 월을 29일로 평년이면 28일로 더함
//		월의 날짜 수를 더함 (31일: 1, 3, 5, 7, 8, 10, 12월/ 30일: 4, 6, 9, 11월)
		long result = 0;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int[] monthOfDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		boolean isLeap = false;
		loop:
		for(int y = 1; y <= year; y++) {
			isLeap = isLeapYear(y);
			System.out.println(isLeap ? "윤년" : "평년");
			for(int m = 0; m < 12; m++) {
				if(y == year && m == month) {
					break loop;
				}else {
					result += monthOfDay[m];
					if(isLeap && m == 1) result += 1;//윤달일 때 2월달 29일 처리
				}
			}
		}
		//마지막으로 금년 금월의 일자를 더해주기
		result += day;
		
		return result;
	}
	
	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이 면 false 리턴
		boolean result = false;
//		(윤년: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해)
		if(year % 400 == 0) {
			result = true; 
		}else {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					result = false;
				}else {
					result = true;
				}
			}
		}
		
		return result;
	}
}
