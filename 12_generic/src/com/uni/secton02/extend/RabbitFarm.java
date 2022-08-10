package com.uni.secton02.extend;

public class RabbitFarm<T extends Rabbit> {
	private T animal;
	
	public RabbitFarm() {}
	public RabbitFarm(T animal) {
		super();
		this.animal = animal;
	}
	
	public T getAnimal() {
		return animal;
	}
	
	public void setAnimal(T animal) {
		this.animal = animal;
	}
}
