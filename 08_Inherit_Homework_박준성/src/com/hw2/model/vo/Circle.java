package com.hw2.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("===== circle =====");
		System.out.println("(x, y) : (" + this.getX() + ", " + this.getY() + ")");
		double area = Math.round(Math.PI * this.radius * this.radius * 10) / 10.0;
		double round = Math.round(Math.PI * this.radius * 2 * 10) / 10.0;
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
