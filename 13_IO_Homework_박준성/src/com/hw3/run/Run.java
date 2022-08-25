package com.hw3.run;

import com.hw3.controller.BookManager;

public class Run {

	public static void main(String[] args) {
		BookManager bk = new BookManager();
		bk.fileSave();
		bk.fileRead();
	}

}
