package com.koreait.exam0609;

// A a = new A(); A 객체가 생성되어야만 B의 객체를 생성할 수 있다.
// A.B b = a.new B();
public class A {
	// 인스턴스 멤버 클래스
	class B { }
	
	B field = new B(); // field 라는 인스턴스 생성
	
	A() { // 생성자
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
}
