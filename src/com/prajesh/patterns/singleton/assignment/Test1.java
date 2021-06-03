package com.prajesh.patterns.singleton.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.prajesh.patterns.singleton.DateUtil;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil dateUtil1=DateUtil.getInstance();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("/prajesh.ser")));
		 oos.writeObject(dateUtil1);
		DateUtil dateUtil2=null;
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("/prajesh.ser")));
		dateUtil2=(DateUtil) ois.readObject();
		System.out.println(dateUtil1);
		System.out.println(dateUtil2);
		System.out.println(dateUtil1==dateUtil2);
	}
}
