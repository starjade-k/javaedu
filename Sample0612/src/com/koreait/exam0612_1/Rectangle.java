package com.koreait.exam0612_1;

public class Rectangle extends Shape{
	int w,h;
	
	Rectangle(){
		this(1,1);
	}
	
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	// 메서드 오버라이딩
		// Shape 클래스의 추상 메서드인 area, length 메서드를 오버라이딩해서 사용
	@Override
	double area() {
		return (w*h);
	}
	@Override
	double length() {
		return (w + h )*2;
	}
}
