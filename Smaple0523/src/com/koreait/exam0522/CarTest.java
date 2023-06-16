package com.koreait.exam0522;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car(); // 생성자 Car()처럼 괄호안에 값이 없으면 디폴트값으로 초기화
		myCar1.color = "red";
		myCar1.speed = 0;
		
		Car myCar2 = new Car(); 
		myCar2.color = "blue";
		myCar2.speed = 0;
		
		Car myCar3 = new Car(); 
		myCar3.color = "white";
		myCar3.speed = 0;
		
		myCar1.upSpeed(30);
		System.out.println("자동차의 색상은 " + myCar1.color + 
				"이며, 현재 속도는 " + myCar1.speed + "km입니다.");
		
		myCar2.upSpeed(70);
		System.out.println("자동차의 색상은 " + myCar2.color + 
				"이며, 현재 속도는 " + myCar2.speed + "km입니다.");
		
		myCar3.upSpeed(90);
		System.out.println("자동차의 색상은 " + myCar3.color + 
				"이며, 현재 속도는 " + myCar3.speed + "km입니다.");
	}

}
