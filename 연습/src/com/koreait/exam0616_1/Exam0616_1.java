package com.koreait.exam0616_1;

public class Exam0616_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"100","1oo"};
		
		for(int i =0; i < array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]" + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 초과됨 : " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 형 변환 불가 : " + e.getMessage());
			}
		}
	}

}
