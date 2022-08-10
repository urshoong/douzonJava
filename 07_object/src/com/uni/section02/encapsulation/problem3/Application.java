package com.uni.section02.encapsulation.problem3;

public class Application {

	public static void main(String[] args) {
		
		//몬스터 4개 만들고, 정보출력
		Monster monster1 = new Monster();
		monster1.setInfo("드라큘라");
		monster1.setHp(200);
		
		Monster monster2 = new Monster();
		monster2.setInfo("프랑켄슈타인");
		monster2.setHp(300);
		
		Monster monster3 = new Monster();
		monster3.setInfo("미이라");
		monster3.setHp(400);
		
		Monster monster4 = new Monster();
		monster4.setInfo("마빈");
		monster4.setHp(500);
		
		System.out.println("monster1 name : " + monster1.getInfo());
		System.out.println("monster2 name : " + monster2.getInfo());
		System.out.println("monster3 name : " + monster3.getInfo());
		System.out.println("monster3 name : " + monster4.getInfo());
		
		monster4.kinds = "두치";
		monster4.hp = 200;
		
		System.out.println(monster4.kinds);
		System.out.println(monster4.hp);
	}

}
