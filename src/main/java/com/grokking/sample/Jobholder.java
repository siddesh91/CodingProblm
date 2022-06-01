package com.grokking.sample;

import java.io.Serializable;

public class Jobholder implements Serializable {
	
	private String name;
	private int age;
	private transient int salary;
	
	public Jobholder(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Jobholder [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	

}
