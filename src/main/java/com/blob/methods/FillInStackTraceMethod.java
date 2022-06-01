package com.blob.methods;

public class FillInStackTraceMethod {

	public static void main(String[] args) throws Throwable{
		FillInStackTraceMethod obj = new FillInStackTraceMethod();
		
		try {
			obj.showResult();
		}catch(Exception ex) {
			System.out.println("Exception: " + ex);
			ex.printStackTrace();
		}

	}
	
	public void showResult() throws Throwable{
		
	}

}
