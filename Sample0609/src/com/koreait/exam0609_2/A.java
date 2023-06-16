package com.koreait.exam0609_2;

// B 객체는 A클래스 내부 어디에서든 객체를 생성 가능
public class A {
	
	static class B{}
	
	B field1 = new B();
	
	static B field2 = new B();
	
	A(){
		B b = new B();
	}
	
	void method1() {
		B b = new B();
	}
	
	static void method2() {
		B b = new B();
	}
		
	
}
