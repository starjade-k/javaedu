package com.koreait.answer;

class Animal{
	public void move() {
		System.out.println("애완동물이 움직인다.");
	}
}

class Dog extends Animal{
	String name;
	int weight;
	
	int getWeight() {
		return weight;
	}
}

class Bird extends Animal{
	String type;
	boolean flightYN;
	
	boolean getFlight() {
	
		return flightYN;
	}
}
public class answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		dog.name = "똥개";
		dog.weight = 4;
		
		bird.type = "앵무새";
		bird.flightYN = true;
		
		dog.move();
		bird.move();
		
		System.out.println("강아지의 이름은 "+ dog.name + "이고, 몸무게는" + dog.weight + " kg" );
		System.out.println("새의 종류는 " + bird.type + ", " + bird.flightYN);
	}

}
