package com.koreait.exam0613;

public class Example0613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "Hello";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 500;
		int i = box2.content;
		System.out.println(i);
	}

}
