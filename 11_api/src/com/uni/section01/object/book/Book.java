package com.uni.section01.object.book;

import java.util.Objects;

public class Book {
	private int number;
	private String title;
	private String author;
	private int price;
	
	public Book() {}

	public Book(int number, String title, String author, int price) {
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		int result = 1;
		/* 필드마다 곱해줄 소수값을 선언
		 * 31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확율을 증가시킨다.
		 * 31이 통상적인 관례이며 String 클래스의 hashCode에서도 사용한 값이다.
		 * 중복되는 값이 나오지 않게 하기위해 소수를 곱해주는데 값이 너무작으면 중복된값이 발생할수있고 
		 * 값이 너무크면 오버 플로우가 발생할수있기때문에 통상적으로 31 을 곱해준다. */
		
		final int PRIME = 31;
		
		result = PRIME * result + this.number;
		result = PRIME * result + this.title.hashCode();
		result = PRIME * result + this.author.hashCode();
		result = PRIME * result + this.price;
		
		
//		return Objects.hash(author, number, price, title);
		return result;
	}
	
}
