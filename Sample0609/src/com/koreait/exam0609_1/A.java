package com.koreait.exam0609_1;

public class A {
	// 인스턴스 맴버 클래스
	class B{
		int field1 = 1; // 인스턴스 맴버 필드
		
		static int field2 = 2; // static이 붙어있으니 정적 필드
		
		B(){
			System.out.println("B 생성자 실행");
		}
		
		void method1() {
			System.out.println("B_method1 실행");
		}
		
		static void method2() { // 정적 메서드
			System.out.println("B_method2 실행");
		}
	}
	
	void useB() {
		// B 객체 생성 및 인스턴스 필드, 메서드 사용
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		// B 클래스의 정적 필드, 정적 메서드를 호출
		System.out.println(B.field2);
		B.method2();
	}
}
