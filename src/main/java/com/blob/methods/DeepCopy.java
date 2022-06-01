package com.blob.methods;

public class DeepCopy {

	public static void main(String[] args) {
		DeepCopy2 t1 = new DeepCopy2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;

		try {
			DeepCopy2 t2 = (DeepCopy2)t1.clone();
			t2.a =100;
			t2.c.x = 300;
			System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " +t1.c.y);
			System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
		}catch(CloneNotSupportedException ce) {

		}





	}

}

class DeepCopy1{
	int x,y;
}

class DeepCopy2 implements Cloneable{
	int a, b;

	DeepCopy1 c = new DeepCopy1();

	public Object clone() throws CloneNotSupportedException{
		DeepCopy2 t = (DeepCopy2)super.clone();
		t.c = new DeepCopy1();

		return t;
	}
}