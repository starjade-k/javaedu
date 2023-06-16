package com.koreait.exam0605_2;

class Car{
	// protected 라는 명령어는 상속받을 수 있게 해준다
	protected  String color;
	//private String color;  private을 직접 쓰면 접근 불가, 상속 불가
	int speed; // 접근 가능, 상속 가능 (private) 생략됨
}

class Sedan extends Car{
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void setColor(String color) {
		this.color= color;
	}
}
public class Exam0605_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan se = new Sedan();
		
		se.setSpeed(200);
		se.setColor("검정");
		System.out.println("승용차의 속도는 " + se.speed);
		System.out.println("승용차의 색상은 " + se.color);
		// 지금 세단의 속도는 자식클래스의 속도이다.
	}

}
