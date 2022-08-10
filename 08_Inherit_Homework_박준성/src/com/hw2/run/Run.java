package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		// 위의 사용 데이터를 참고하여 각각 초기화
		// 각 도형의 draw 메소드 실행 --> 향상된 for문 이용해서
		Circle[] circle = new Circle[2];
		circle[0] = new Circle(1, 2, 3);
		circle[1] = new Circle(3, 3, 4);
		Rectangle[] rectangle = new Rectangle[2];
		rectangle[0] = new Rectangle(-1, -2, 5, 2);
		rectangle[1] = new Rectangle(-2, 5, 2, 8);
		
		for(Circle c : circle) {
			c.draw();
		}
		
		for(Rectangle r : rectangle) {
			r.draw();
		}
	}

}
