package com.koreait.exam0601;

class Car{
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed += value; // speed = speed + value
		
	}
	
	void downSpeed(int value) {
		speed -= value; // speed = speed + value
		
	}
	// 두 단어가 결합되면 두번째 단어의 첫 번째는 항상 대문자로 표기

	public String getColor() { // 자동차의 색상을 반환
		return color;
	}

	public int getSpeed() { // 자동차의 속도를 반환
		return speed;
	}
}

public class Exam0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car(); // 객체가 생성
		myCar1.speed = 0;
		myCar1.color = "검정";
		
		myCar1.upSpeed(200);
		
		System.out.println("자동차의 색상은 "+ myCar1.color + 
				"이며, 현재 속도는 "+ myCar1.speed+ "km 입니다.");
	}

}
