package com.koreait.exam0522;

public class Exam0522_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "잠자기";
		hobby = null;
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2 : "+kind2);
		}

}
