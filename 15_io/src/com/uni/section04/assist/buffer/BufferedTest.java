package com.uni.section04.assist.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	
	public void fileSave() {
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("감사합니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		*/
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));){
			bw.write("안녕하세요\n");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("감사합니다.");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public void fileOpen() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));){
			String temp = null;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
