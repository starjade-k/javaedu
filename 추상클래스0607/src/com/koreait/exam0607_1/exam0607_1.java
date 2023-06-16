package com.koreait.exam0607_1;

abstract class Car{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
	
	abstract void work();
}

class Sedan extends Car{
	void work() {
		//오버라이딩
		System.out.println("사람을 태우고 간다.");
	}
}

class Truck extends Car{
	void work() {
		System.out.println("짐을 싣고 간다.");
	}
}
public class exam0607_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan se = new Sedan();
		se.work();
		
		Truck tr = new Truck();
		tr.work();
		
	}

}