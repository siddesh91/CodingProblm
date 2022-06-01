package com.grokking.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setStudentId(1);
		st.setStudentName("Lisa");
		st.setAge(20);
		st.setDeptId(10);
		st.setDeptName("IT");
		st.setCapacity(60);

		String file = "c:\\Temp\\object1.ser";

		try(FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(st);
			System.out.println("Student Object is serialized : \n" + st);
		}catch(IOException e) {
			e.printStackTrace();
		}

		try(FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
			Student st1 = (Student) ois.readObject();
			System.out.println("Student Object is de-serialized : \n" + st1);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
