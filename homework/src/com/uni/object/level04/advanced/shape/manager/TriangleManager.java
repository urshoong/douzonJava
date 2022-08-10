package com.uni.object.level04.advanced.shape.manager;

import com.uni.object.level04.advanced.shape.model.dto.ShapeDTO;

public class TriangleManager {
	public void calcPerimeter(ShapeDTO shape) {
		double d = shape.getHeight() + shape.getWidth() + (Math.sqrt(Math.pow(shape.getHeight(), 2) + (Math.pow(shape.getWidth(), 2))));
		System.out.println("삼각형의 둘레는 " + (Math.round(d * 100) / 100.0) + "입니다.");
	}
	
	public void calcArea(ShapeDTO shape) {
		System.out.println("삼각형의 면적은 " + ((shape.getHeight() * shape.getWidth()) / 2.0) + "입니다.");
	}
	
	public void printShape(ShapeDTO shape) {
		System.out.println("도형타입 : 삼각형");
		System.out.println("높이 : " + shape.getHeight());
		System.out.println("너비 : " + shape.getWidth());
		System.out.println("색상 : " + shape.getColor());
	}
	
	public void paintColor(ShapeDTO shape, String color) {
		shape.setColor(color);
		System.out.println("선택하신 도형을 " + color + "로 색칠합니다.");
	}
}
