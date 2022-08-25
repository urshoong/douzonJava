package practice3.model.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		for(int i = 0; i < animal.length; i++) {
			int choice = (int)(Math.random()*2);
			if(choice % 2 == 0) {
				animal[i] = new Dog("멍"+i, "품종"+i, i+10);
			}else {
				animal[i] = new Cat("냥"+i, "품종"+i, "위치"+i, "색상"+i);
			}
		}
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].speek();
		}
	}

}
