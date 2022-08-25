package com.hw1.model.vo;

public class Book {
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	public Book() {}

	public Book(String title, int category, String author) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
	}

	@Override
	public String toString() {
		/*
		필드 값 문자열 합친 후 리턴
		category 분류 별로 출력
		1 : 인문 / 2 : 자연과학
		3 : 의료 / 4 : 기타
		*/
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + category + ", author=" + author + "]";
	}

	public int getbNo() {
		return bNo;
	}

	public String getTitle() {
		return title;
	}

	public int getCategory() {
		return category;
	}

	public String getAuthor() {
		return author;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
