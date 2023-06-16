package com.koreait.exam0614;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		mycar.setSpeed(-50);
		System.out.println("현재 속도는 : " + mycar.getSpeed());
		
		mycar.setSpeed(100);
		System.out.println("현재 속도는 : " + mycar.getSpeed());
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		System.out.println("현재 속도는 : " + mycar.getSpeed());
	}

}
