package com.uni.section02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	//프로그램 --> 외부매체(파일)
	public void fileSave() {
		FileOutputStream fout = null;
		
		
		
		try {
			fout = new FileOutputStream("a_byte.txt");
			
			fout.write(97);
			fout.write('b');
//			fout.write("강");//한글은 2byte 여서 깨져서 저장
			
			byte[] bArr = {99, 100, 101};
			fout.write(bArr);
			
//			write(byte[] b, int off, int len) : off 인덱스 부터 len 개 만큼
			fout.write(bArr, 0, 1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				//반드시 스트림 이용 후 닫아주자
				if(fout != null) fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <- 파일 (입력 : 파일로부터 데이터를 받아오자)
	public void fileRead() {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.txt");
			
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());

			int value = 0;
			while((value = fis.read()) != -1) {//end of file (EOF) : 파일의 끝 -1을 반환
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
