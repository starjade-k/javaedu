package com.koreait.exam0522;

public class Exam0522_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		
		System.out.println("문자열 str1 => ["+ str1+ "]");
		System.out.println("문자열 str1 => ["+ str2+ "]");
		System.out.println("문자열 str1 => ["+ str3+ "]");
		
		System.out.println("str1 == str2 결과는 : \t" + (str1 == str2));
		System.out.println("str1.equals(str2)결과는 : \t" + str1.equals(str2));
		System.out.println("str1 == str3 결과는 : \t" + (str1 == str3));
		System.out.println("str1.equals(str2)결과는 : \t" + str1.equals(str3));
	}

}
