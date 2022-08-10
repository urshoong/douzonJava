package com.uni.object.level04.advanced.shape.views;

import java.util.Scanner;

import com.uni.object.level04.advanced.shape.manager.SquareManager;
import com.uni.object.level04.advanced.shape.manager.TriangleManager;
import com.uni.object.level04.advanced.shape.model.dto.ShapeDTO;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private double height;
	private double width;
	private int type;
	public void mainMenu() {
		while(true) {
			System.out.println("============ 도형계산기 ============");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("===================================");
			System.out.print("계산하려는 도형을 선택하세요 : ");
			/* int */type = sc.nextInt(); sc.nextLine();
//			double height = 0;
//			double width = 0;
			switch(type) {
				case 3:
					System.out.print("높이 : ");
					height = sc.nextDouble(); sc.nextLine();
					System.out.print("너비 : ");
					width = sc.nextDouble(); sc.nextLine();
					ShapeDTO triangle = new ShapeDTO(type, height, width);
					triangleMenu(triangle);
					break;
				case 4:
					System.out.print("높이 : ");
					height = sc.nextDouble(); sc.nextLine();
					System.out.print("너비 : ");
					width = sc.nextDouble(); sc.nextLine();
					ShapeDTO square = new ShapeDTO(type, height, width);
					squareMenu(square);
					break;
				case 9:
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요");
					break;
			}
			
			if(type == 9) {
				break;
			}
		}
		
		sc.close();
	}
	
	private void triangleMenu(ShapeDTO shape) {
		TriangleManager tm = new TriangleManager();
		while(true) {
			System.out.println("========= 삼각형 계산기 =========");
			System.out.println("1. 삼각형의 둘레 구하기");
			System.out.println("2. 삼각형의 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형의 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("===============================");
			System.out.print("메뉴를 선택하세요 : ");
			int menu = sc.nextInt(); sc.nextLine();
			
			switch(menu) {
				case 1:
					tm.calcPerimeter(shape);
					break;
				case 2:
					tm.calcArea(shape);
					break;
				case 3:
					tm.printShape(shape);
					break;
				case 4:
					String color = inputColor();
					tm.paintColor(shape, color);
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다");
					break;
				default:
					System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요");
					break;
			}
			
			if(menu == 9) {
				break;
			}
		}
	}
	
	private void squareMenu(ShapeDTO shape) {
		SquareManager sm = new SquareManager();
		while(true) {
			System.out.println("========= 삼각형 계산기 =========");
			System.out.println("1. 사각형의 둘레 구하기");
			System.out.println("2. 사각형의 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형의 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("===============================");
			System.out.print("메뉴를 선택하세요 : ");
			int menu = sc.nextInt(); sc.nextLine();
			
			switch(menu) {
				case 1:
					sm.calcPerimeter(shape);
					break;
				case 2:
					sm.calcArea(shape);
					break;
				case 3:
					sm.printShape(shape);
					break;
				case 4:
					String color = inputColor();
					sm.paintColor(shape, color);
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다");
					break;
				default:
					System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요");
					break;
			}
			
			if(menu == 9) {
				break;
			}
		}
	}
	
	private String inputColor() {
		System.out.print("어떤 색으로 도형을 칠할까요? : ");
		String color = sc.nextLine();
		return color;
	}
}
