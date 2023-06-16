package com.koreait.exam0531;

public class National {
	// 멤버 필드
	String nation = "대한 민국";
	String name;
	String ssn;
	
	// 클래스에도 public이 있으니 생성자에도 public 써준다
	public National(String n, String s) {
		name = n;
		ssn = s;
	}
}
