package com.koreait.exam0531;

public class Car {
	// 필드 선언
	String company = "자동차회사";
	String model;
	String color;
	int price;
	
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int price){
		this.model = model;
		this.color = color;
		this.price = price;
	}
}
