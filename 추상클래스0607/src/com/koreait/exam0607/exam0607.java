package com.koreait.exam0607;

abstract class Car{
	// abstract는 추상클래스를 뜻 한다. 추상클래스에선 객체생성이 불가하다.
	
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan extends Car{
	// 상속받은 클래스를 오버라이딩 하지 않고 그대로 사용한다.
}

class Truck extends Car{
	// 상속받은 클래스를 오버라이딩 하지 않고 그대로 사용한다.
}
public class exam0607 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car car1 = new Car(); 추상 클래스여서 인스턴스 생성 불가
		Sedan se = new Sedan();
		System.out.println("인스턴스 생성");
		
		Truck tr = new Truck();
		System.out.println("인스턴스 생성");
		
	}

}
