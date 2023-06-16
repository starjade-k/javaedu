package com.koreait.exam0601_2;

class Animal{
	String type;
	int age;
	
	void move() {
		System.out.println(this.type +" 가 움직인다.");
	}
	int getAge() {
		return this.age;
	}
}
public class exam0601_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani1 = new Animal();
		ani1.type = "강아지";
		ani1.age = 12;
		
		Animal ani2 = new Animal();
		ani2.type = "고양이";
		ani2.age = 14;
		
		ani1.move();
		ani2.move();
		
		System.out.println(ani1.type + "는 " + ani1.age + "개월 입니다.");
		System.out.println(ani2.type + "는 " + ani2.age + "개월 입니다.");
	}

}