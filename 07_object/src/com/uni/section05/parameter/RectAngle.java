package com.uni.section05.parameter;

public class RectAngle {
	private double width;
	private double height;
	
	public RectAngle() {}
	
	public RectAngle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	/**<pre>
	 *	사각형의 넓이를 구하는 용도의 메소드
	 * </pre>
	 * */
	public void calcArea() {
		
		double area = width * height;
		
		System.out.println("이 사각형의 넓이는 " + area + "입니다.");
	}
	
	/**<pre>
	 *	사각형의 둘레를 구하는 용도의 메소드
	 * </pre>
	 * */
	public void calcRound() {
		
		double round = (width + height) * 2;
		
		System.out.println("이 사각형의 둘레는 " + round + "입니다.");
	}
	
	public void testClassTypeParameter(RectAngle rectAngle) {
		/* 인스턴스도 주소가 전달된다. 
		 * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 서로 동일한 인스턴스를 가리킨다. (얕은복사)*/
		System.out.println("매개변수로 전달받은 값 : " + rectAngle);
		
		/* 사각형의 넓이와 둘레 출력 */
		System.out.println("변경 전 사각형의 넓이와 둘레 ========================");
		rectAngle.calcArea();
		rectAngle.calcRound();
		
		/* 사각형의 너비와 높이를 변경 */
		rectAngle.setWidth(100);      //자동형변환 적용됨
		rectAngle.setHeight(100);
		
		/* 변경 후 사각형의 넓이와 둘레 출력 */
		System.out.println("변경 후 사각형의 넓이와 둘레 ========================");
		rectAngle.calcArea();
		rectAngle.calcRound();
	}
	

}
