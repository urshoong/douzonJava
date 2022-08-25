package com.hw1.model.vo;

public class Guests {
	private String name;
	private int age;
	private char gender;
	private double height;
	
	public Guests() {}

	public Guests(String name, int age, char gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 키 : " + height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getHeight() {
		return height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
