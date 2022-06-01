package com.grokking.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Jobholder worker = new Jobholder("Mike", 38, 50000);
		
		String file = "C:\\Temp\\byteStream.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(worker);
			
			fos.close();
			oos.close();
			System.out.println("Employee Object is serialized : " + worker);
			
		}catch(IOException e1){
			System.out.println("IOException is caught");
		}
		
		
		try(FileInputStream fis = new FileInputStream(file); 
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
			Jobholder jis = (Jobholder) ois.readObject();
			System.out.println("Employee Object is deserialized" + jis);
			
		}catch(IOException e1) {
			System.out.println("IOException is caught");
		}catch(ClassNotFoundException e2) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

}
