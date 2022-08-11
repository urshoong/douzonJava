package com.uni.section04.assist.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.uni.section04.assist.dto.Phone;

public class ObjectsTest {
	public void fileSave() {
		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		
		phoneList.add(new Phone("엘지", 100000));
		phoneList.add(new Phone("엘지1", 200000));
		phoneList.add(new Phone("엘지2", 300000));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))) {
			
			for(int i = 0; i < phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone1.txt"))) {
			int i = 0;
			while(true) {
				phoneList.add((Phone) ois.readObject());
				
				System.out.println(phoneList.get(i));
				i++;
			}
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
