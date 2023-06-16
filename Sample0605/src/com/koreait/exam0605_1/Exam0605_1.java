package com.koreait.exam0605_1;

class Car{
	Car(){
		System.out.println("부모 클래스 생성자()");
	}
	
	Car(String str){
		System.out.println("부모 클래스 생성자() =>" + str);
	}
}

class Sedan extends Car {
	
	Sedan(String str){
		super(str);
		// super는 부모클래스의 생성자를 불러오는 명령어이다.
		// super에 괄호안에 아무것도 안적으면 부모클래스의 디폴트 생성자를 불러오는 뜻
		// 지금 괄호에 str을 적었으니 부모클래스의 매개변수 str을 불러오는 뜻이다.
		// super는 선언문 맨 첫줄에 적어야 한다.
		System.out.println("자식 클래스 생성자() =>" + str);
	}
}
public class Exam0605_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan se = new Sedan("요기요");
		// 상속 관계에서는 부모클래스가 자식클래스보다 우선권을 갖는다
		// 부모클래스를 먼저 초기화를 시켜주어야 하기때문
		// 하지만 매개변수가 주어졌을 경우엔 그냥 생성자이름에 따라 실행됨
	}

}
