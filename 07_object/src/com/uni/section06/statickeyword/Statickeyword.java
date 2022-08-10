package com.uni.section06.statickeyword;

public class Statickeyword {
	/*전역변수 :  non-static(인스턴스변수) 필드와 static필드 (클래스변수, 정적필드)선언 */
	private int nonStaticCount;
	private static int staticCount;
	
	public Statickeyword() {}
	
	public int getNonStaticFieldTest() {
		return this.nonStaticCount;
	}
	
	public int getStaticFieldTest() {
		return Statickeyword.staticCount;
	}
	
	public void increaseNonStaticCount() {
		this.nonStaticCount++;
	}
	
	public void increaseStaticCount() {
		Statickeyword.staticCount++;
	}
}
