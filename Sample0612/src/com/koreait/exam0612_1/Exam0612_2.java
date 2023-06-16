package com.koreait.exam0612_1;
import java.util.ArrayList;
import java.util.List;
public class Exam0612_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		list.add(new Circle(3.0));
		list.add(new Rectangle(3,4));
		list.add(new Circle(5));
		list.add(new Rectangle(5,6));
		
		System.out.println("전체 도형의 면적의 합 : "+ sumArea(list));
		System.out.println("전체 도형의 둘레의 합 : "+ sumLength(list));
		
	}
	
	private static double sumLength(List list) {
		double sumLength = 0;
		
		for(int i = 0; i < list.size(); i++) {
			Shape s = (Shape)list.get(i);
			sumLength += s.length();
		}
		
		return sumLength;
	}
	
	private static double sumArea(List list) {
		double sumarea = 0;
		
		for(int i =0; i < list.size(); i++) {
			sumarea += ((Shape)list.get(i)).area();
		}
		return sumarea;
	}
}
