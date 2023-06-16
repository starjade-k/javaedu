package com.koreait.exam0525_1;

class Car {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -= value;
	}

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}
	
	
	/*
	// 현재 자동차의 색상을 반환
	String getColor() {
		return color;
	}
	
	// 현재 자동차의 속도를 반환
	int getSpeed() {
		return speed;
	}
	*/
}
