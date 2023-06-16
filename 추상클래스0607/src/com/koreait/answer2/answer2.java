package com.koreait.answer2;


class Animal{
	public void move() {
		System.out.println("애완동물이 움직인다.");
	}
}
class Dog extends Animal{
	
}


class Bird extends Animal{
	String type;
	public void move() {
		System.out.println("새가 움직인다.");
	}
}
public class answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Bird bird = new Bird();
		dog.move();
		bird.move();
	}

}
