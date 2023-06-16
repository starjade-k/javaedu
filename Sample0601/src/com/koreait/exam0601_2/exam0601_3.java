package com.koreait.exam0601_2;

class Car{
	private String color;
	private int speed;
	
	Car(String color, int speed){
		this.color = "검정";
		this.speed = 0;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}
public class exam0601_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car("검정",0);
		Car myCar2 = new Car("흰색",0);
	}

}
