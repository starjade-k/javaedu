package com.koreait.exam0613_3;
import java.util.*;
public class HashExam0613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		//객체 저장
		set.add("java");
		set.add("Oracle");
		set.add("My-SQL");
		set.add("java");
		set.add("Spring");
		
		int size = set.size();
		System.out.println("총 객체의 수는 : "+ size);
	}

}
