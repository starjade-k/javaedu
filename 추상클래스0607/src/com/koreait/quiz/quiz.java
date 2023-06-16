package com.koreait.quiz;


class Animal {
	String type;
	String name;
	int kg;
	void move(String type) {
		System.out.println(type +" 가 움직인다.");
	}
	void dog(String type, String name, int kg) {
		System.out.println(type + " 의 이름은 " + name +" 몸무게는 " + kg + " kg");
	}
	void bird(String type) {
		System.out.println("새의 종류는 " + type + ", 날수있다 ");
	}
}

class Dog extends Animal{
	

}

class Bird extends Animal{
	

}
public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Bird bird = new Bird();
		dog.move("강아지");
		bird.move("새");
		dog.dog("강아지","똥개", 4);
		bird.bird("앵무새");
	}

}
