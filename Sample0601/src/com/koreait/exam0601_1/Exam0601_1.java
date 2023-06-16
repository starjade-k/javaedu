package com.koreait.exam0601_1;

class Car{
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed += value; // speed = speed + value
		
	}
	
	void downSpeed(int value) {
		speed -= value; // speed = speed + value
		
	}
	// 두 단어가 결합되면 두번째 단어의 첫 번째는 항상 대문자로 표기

	String getColor() { // 자동차의 색상을 반환
		return color;
	}

	int getSpeed() { // 자동차의 속도를 반환
		return speed;
	}

	void setColor(String color) {
		this.color = color; // this 는 객체를 뜻함
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

public class Exam0601_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		
		myCar1.upSpeed(200);
		System.out.println("자동차의 색상은 "+ myCar1.getColor() + 
				"이며, 현재 속도는 "+ myCar1.getSpeed()+ "km 입니다.");
	}

}
