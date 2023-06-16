package com.koreait.exam0525_1;

public class CarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		myCar1.color = "red";
		myCar1.speed = 0;
		
		myCar1.upSpeed(40);
		System.out.println("자동차의 색상은 " + myCar1.color + 
				"이며, 현재 속도는 " + myCar1.speed + "km입니다.");

		System.out.println("자동차의 색상은 " + myCar1.getColor() + 
				"이며, 현재 속도는 " + myCar1.getSpeed() + "km입니다.");
		

	}

}
