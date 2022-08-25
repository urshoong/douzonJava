package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDate {
	public SetDate() {}
	
	public String todayPring() {
//		오늘의 년, 월, 일, 시, 분, 초를 각 변수에 담은 후 오늘을 String으로 리턴
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		return sf.format(c.getTime());
	}
	
	public String setDay() {
//		“2011년 3월 21일 월요일”을 세팅 하여 출력
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		c.set(2011, 2, 21);
		
		return sf.format(c.getTime());
	}
}
