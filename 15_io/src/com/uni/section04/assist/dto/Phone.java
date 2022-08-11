package com.uni.section04.assist.dto;

import java.io.Serializable;

public class Phone implements Serializable{
	
	private static final long serialVersionUID = 6681789166312684627L;
	
	private String brand;
	private int price;
	
	public Phone() {
	   // TODO Auto-generated constructor stub
	}

	public Phone(String brand, int price) {
	   super();
	   this.brand = brand;
	   this.price = price;
	}

	public String getBrand() {
	   return brand;
	}

	public void setBrand(String brand) {
	   this.brand = brand;
	}

	public int getPrice() {
	   return price;
	}

	public void setPrice(int price) {
	   this.price = price;
	}

	@Override
	public String toString() {
	   // TODO Auto-generated method stub
	   return "Phone [ brand = "+brand +" , price = "+ price+ "]";
	}
}
