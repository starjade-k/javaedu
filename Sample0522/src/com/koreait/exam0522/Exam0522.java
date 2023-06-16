package com.koreait.exam0522;

public class Exam0522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1;
		int [] arr2;
		int [] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		// 첫번째가 거짓이 나오는 이유는 new 연산자는 객체를 새로 생성하기때문에
		// new가 붙은 저 배열들은 값은 똑같지만 메모리주소가 다르기때문
		// 참고로 new 연산자의 데이터생성은 heap 메모리영역에 만들어지고
		// 일반적인 변수생성은 스택메모리 영역에 생성되는데 
		// heap 메모리영역의 데이터들은 생성시 각각의 데이터 주소를 갖게됨
		// 두번째가 참이 나오는 이유는 arr3 == arr2 이렇게 해버리면
		// arr3은 arr2의 메모리주소와 값을 전부 같게 만들기 때문에 참이 나온다.
		// 참조 타입 변수값이 null 이여도 초기화가 된거다.
	}

}
