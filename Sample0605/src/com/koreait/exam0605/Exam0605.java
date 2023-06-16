package com.koreait.exam0605;

class Car{
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
}

class Sedan extends Car{
	int seatNumber; // Sedan 클래스의 멤버필드
	
	int getSeatNumber() {
		return seatNumber;
	}
}
public class Exam0605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan(); // 컴포지션
		sedan1.upSpeed(200);
		
		sedan1.seatNumber = 6;
		
		System.out.println("승용차의 속도는 " + sedan1.speed + "km,"
				+ "좌석 수는 "+ sedan1.getSeatNumber() + "입니다");
	}

}
