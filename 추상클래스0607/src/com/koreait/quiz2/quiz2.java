package com.koreait.quiz2;


class Animal{
	public void move() {
		System.out.println("애완동물이 움직인다.");
	}
}


class Bird extends Animal{
	String type;
	public void move(String type) {
		System.out.println(this.type +" 가 움직인다.");
	}
		
}
public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		
		bird.type = "새";
		bird.move();
		bird.move(bird.type);
		
		
		
	
		
	}

}