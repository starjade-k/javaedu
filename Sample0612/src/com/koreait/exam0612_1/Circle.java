package com.koreait.exam0612_1;

public class Circle extends Shape{
	double r;
	
	Circle(){
		this(1);
	}
	
	Circle(double r){
		this.r = r;
	}
	// 메서드 오버라이딩
	// Shape 클래스의 추상 메서드인 area, length 메서드를 오버라이딩해서 사용
	@Override
	double area() {
		return (r*r) * Math.PI;
	}
	@Override
	double length() {
		return (r*2) * Math.PI;
	}
}
