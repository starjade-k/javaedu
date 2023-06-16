package com.koreait.exam0607_2;


interface Car {
	static final int CAR_COUNT = 0; // final이 붙으면 상수이므로 상수는 대문자로 표기
	
	abstract void work();
}
// interface car를 구현
class Sedan implements Car{
	// 인터페이스와 추상 메서드를 완성하려고 한다면 서브클래스에서 public 키워드를 사용해야함
	public void work() { // 추상 메서드 오버라이딩
		System.out.println("승용차가 사람을 태우고 간다.");
	}
	
}

class Truck implements Car{
	// 인터페이스와 추상 메서드를 완성하려고 한다면 서브클래스에서 public 키워드를 사용해야함
	public void work() { // 추상 메서드 오버라이딩
		System.out.println("트럭이 짐을 싣고 간다.");
	}
	
}
public class exam0607 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan se = new Sedan();
		se.work();
		
		Truck tr = new Truck();
		tr.work();
	}

}
