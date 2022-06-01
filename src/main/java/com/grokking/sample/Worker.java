package com.grokking.sample;

public enum Worker {
	
	Jake(38), Mike(15), John(20), Lisa(12), Dave(25);
	
	private int age;
	
	int getAge() {
		return age;
	}
	
	private Worker(int age) {
		this.age = age;
		System.out.println("Constructor called for : " + this.toString());
	}
	
	public static void main(String[] args) {
		System.out.println("Age of Jake is : " + Worker.Jake.getAge());
	}

}
