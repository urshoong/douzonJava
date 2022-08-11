package com.uni.section04.run;

import com.uni.section04.assist.buffer.BufferedTest;
import com.uni.section04.assist.data.DataTest;
import com.uni.section04.assist.object.ObjectTest;
import com.uni.section04.assist.object.ObjectsTest;

public class Application {

	public static void main(String[] args) {
//		BufferedTest bt = new BufferedTest();
//		bt.fileSave();
//		bt.fileOpen();
		
//		ObjectTest ot = new ObjectTest();
//		ot.fileSave();
//		ot.fileOpen();
		
//		ObjectsTest ost = new ObjectsTest();
//		ost.fileSave();
//		ost.fileOpen();
		
		DataTest dt = new DataTest();
		dt.fileSaveOpen();
	}

}
