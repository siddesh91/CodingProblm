package com.blob.basics;

class Complex{
	
	private double re, im;
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public Complex(Complex c) {
		System.out.println("Copy constructor called");
		re = c.re;
		im = c.im;
	}

	@Override
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}
	
	
}

public class CopyConstructor {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 20);
		
		Complex c2 = new Complex(c1);
		
		Complex c3 = c2;
		System.out.println(c2);

	}

}
