package com.koreait.exam0609_3;

public class A {
	static class B{
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
}
