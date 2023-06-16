package com.koreait.exam0531;

public class NationalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		National k1 = new National("홍길동","135215-0000001");
		
		System.out.println("k1.nation : "+k1.nation);
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn : "+k1.ssn);
		System.out.println();
		National k2 = new National("이순신","190000-0000001");
		
		System.out.println("k2.nation : "+k2.nation);
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.ssn : "+k2.ssn);
		
	}

}
