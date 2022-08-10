package com.uni.section01.list.dto;

public class BookDTO {
	private int number;
	private String title;
	private String author;
	private int price;
	
	/* 기본 생성자 */
	public BookDTO() {}

	/* 모든 필드를 초기화 하는 생성자 */
	public BookDTO(int number, String title, String author, int price) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	/* toString 오버라이딩 */
	@Override
	public String toString() {
		return "BookDTO [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public int getNumber() {
		return number;
	}

	/* setter/getter */
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
	
	
}
