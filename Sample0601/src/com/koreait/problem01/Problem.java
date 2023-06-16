package com.koreait.problem01;

class Animal{
	private String type;
	private int age;
	
	void move() {
		System.out.println(this.type +" 가 움직인다.");
	}
	String getType() {
		return type;
	}
	
	int getAge() {
		return age;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Problem {
	// 클래스 필드에 private가 선언되면 직접접근이 불가능해서 set을 사용해서 값을 바꿔서 접근해야한다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani1 = new Animal();
		ani1.setType("강아지");
		ani1.setAge(12);
		
		Animal ani2 = new Animal();
		ani2.setType("고양이");
		ani2.setAge(14);
		
		ani1.move();
		ani2.move();
		
		System.out.println(ani1.getType() + "는 " + ani1.getAge() + "개월 입니다.");
		System.out.println(ani2.getType() + "는 " + ani2.getAge() + "개월 입니다.");
	}

}
