package com.blob.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyword implements Serializable {

	int i =10, j=20;
	transient int k = 30;
	transient static int l = 40;
	transient final int m = 50;


	public static void main(String[] args) {
		TransientKeyword input = new TransientKeyword();

		try {
			FileOutputStream fos = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(input);
		}catch(Exception ex) {

		}
		
		try {
			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			TransientKeyword output = (TransientKeyword)ois.readObject();
			
			System.out.println("i = " + output.i);
			System.out.println("j = " + output.j);
			System.out.println("k = " + output.k);
			System.out.println("l = " + output.l);
			System.out.println("m = " + output.m);
			
		}catch(Exception ex) {
			
		}


	}

}
