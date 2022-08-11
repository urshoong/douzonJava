package com.uni.section04.assist.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.uni.section04.assist.dto.Phone;

public class ObjectTest {
	public void fileSave() {
		Phone ph = new Phone("삼성", 200000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))) {
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))) {
			Phone ph = (Phone) ois.readObject();
			System.out.println(ph.toString());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
