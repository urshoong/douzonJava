package com.uni.section03.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");

		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("driver.dat"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.dat"), "jdbc driver");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop2 = new Properties();
		
		try {
			prop2.load(new FileInputStream("driver.dat"));
			prop2.load(new FileReader("driver.dat"));
			prop2.loadFromXML(new FileInputStream("driver.dat"));
			prop2.list(System.out);
			System.out.println(prop2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
