package com.koreait.exam0605_3;

class Car{
	int speed = 0;
	// final 명령어는 필드를 고정시켜주는 역할을 한다 필드 상수화라고 말함
	// final이 붙은것은 아래 Sedan 클래스처럼 메서드를 재 정의 하는것을 못하게 함
	final void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재 속도는 : "+ this.speed);
	}
}

class Sedan extends Car{
	void upSpeed(int speed) {
		this.speed += speed;
		// 아래 if 문처럼 부모클래스를 상속받아서 메서드를 재 정의 하는 것을
		// 메서드 오버라이딩이라고 한다. 오버로딩과는 다른 뜻
		if(this.speed > 170) {
			this.speed = 150;
		}
		System.out.println("현재 속도는 : " + this.speed);
	}
}

class Truck extends Car{
	
}
public class Exam0605_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan se = new Sedan();
		Truck tu = new Truck();
		
		System.out.println("승용차 -> ");
		se.upSpeed(250);
		
		System.out.println("승용차 -> ");
		tu.upSpeed(250);
	}

}
