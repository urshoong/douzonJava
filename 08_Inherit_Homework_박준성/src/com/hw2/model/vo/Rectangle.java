package com.hw2.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("===== rectangle =====");
		System.out.println("(x, y) : (" + super.getX() + ", " + super.getY() + ")");
		int area = width * height;
		System.out.println("면적 : " + area);
		int round = 2 * (width + height);
		System.out.println("둘레 : " + round);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
