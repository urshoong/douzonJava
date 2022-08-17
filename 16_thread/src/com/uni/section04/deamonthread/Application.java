package com.uni.section04.deamonthread;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) {
		Thread t = new CountDown();
		
		t.start();
		
		System.out.println(JOptionPane.showInputDialog("아무문자열이나 입력하세요"));
		
		System.out.println("메인 스레드 종료 ");
	}

}
