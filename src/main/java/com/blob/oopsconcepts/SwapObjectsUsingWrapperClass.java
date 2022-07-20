package com.blob.oopsconcepts;

public class SwapObjectsUsingWrapperClass {
	
	public static void swap(CarWrapper cw1, CarWrapper cw2) {
		Car temp = cw1.c;
		cw1.c = cw2.c;
		cw2.c = temp;
	}

	public static void main(String[] args) {
		Car c1 = new Car(101, 1);
		Car c2 = new Car(202, 2);
		
		CarWrapper cw1 = new CarWrapper(c1);
		CarWrapper cw2 = new CarWrapper(c2);
		
		swap(cw1, cw2);
		
		cw1.c.print();
		cw2.c.print();

	}

}


class Car{
	int model, no;

	public Car(int model, int no) {
		super();
		this.model = model;
		this.no = no;
	}
	
	void print() {
		System.out.println("Class = " + no +  ", model = " + model);
	}
}

class CarWrapper{
	Car c;
	public CarWrapper(Car c) {
		this.c = c;
	}
}