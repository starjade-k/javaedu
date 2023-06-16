package com.koreait.exam_0609_5;

public class A {
	void useB() {
		class B{
			int field1 = 1;
			
			static int field2 = 2;
			
			B(){
				System.out.println("B-생성자 실행");
			}
			
			void method1() {
				System.out.println("B-메서드1 실행");
			}
			
			static void method2() {
				System.out.println("B-메서드2 실행");
			}
		}
		B b = new B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(b.field2);
		b.method2();
	}
}
