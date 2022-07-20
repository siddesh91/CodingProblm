package com.blob.oopsconcepts;

public class Association {

	public static void main(String[] args) {
		Bank bank =  new Bank("Axis Bank");
		Employee emp = new Employee("Sid");
		
		System.out.println(emp.getEmployee() + " is employee of " + bank.getBankName());

	}

}

class Bank{
	private String name;
	
	public Bank(String name) {
		this.name = name;
	}
	
	public String getBankName() {
		return this.name;
	}
}

class Employee{
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getEmployee() {
		return this.name;
	}
}
