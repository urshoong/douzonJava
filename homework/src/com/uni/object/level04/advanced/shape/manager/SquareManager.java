package com.uni.object.level04.advanced.shape.manager;

import java.util.Scanner;

import com.uni.object.level04.advanced.shape.model.dto.ShapeDTO;

public class SquareManager {
	public void calcPerimeter(ShapeDTO shape) {
		System.out.println("사각형의 둘레는 " + ((shape.getWidth() + shape.getHeight()) * 2) + "입니다.");
	}
	
	public void calcArea(ShapeDTO shape) {
		System.out.println("사각형의 면적은 " + (shape.getWidth() * shape.getHeight()) + "입니다.");
	}
	
	public void printShape(ShapeDTO shape) {
		System.out.println("도형타입 : 사각형");
		System.out.println("높이 : " + shape.getHeight());
		System.out.println("너비 : " + shape.getWidth());
		System.out.println("색상 : " + shape.getColor());
	}
	
	public void paintColor(ShapeDTO shape, String color) {
		shape.setColor(color);
		System.out.println("선택하신 도형을 " + color + "로 색칠합니다.");
	}
}
