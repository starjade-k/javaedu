package com.koreait.quiz5;
/* 두 개의 메서드를 가지는 클래스를 작성한다
   첫 번째 메서드 내부에서는 두 번째 메서드를 호출하되,
   처음에는 this를 사용하지 않고 두 번쨰 호출에서는 this를 사용한다.
   이 코드가 잘 동작되는지 확인해본다.*/
 
class Test{
	String test;
	
	void first() {
		second(""); // 두번째 메소드 호출
		second(this.test); // this를 사용하여 두 번째 호출
		second(test);
	}
	
	void second(String str) {
		System.out.println("두 번째 메서드 호출 완료");
	}
}
public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test te = new Test();
		
		te.first();

	}

}
