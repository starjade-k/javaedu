package com.koreait.quiz2;
/* 메세지를 출력하는 디폴트 생성자를 갖는 클래스를 작성한다.
이 클래스에 객체를 생성하여 메세지가 출력되는지 확인하는 소스를 코딩하시오.*/

class Message{
	String str;
	
	// 메세지 출력 확인 메소드
	void msg(){
		System.out.println("출력 메세지 : " +str);
	}
	//디폴트 생성자
	Message(){
		
	}

}

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message me = new Message();
		me.msg();


	}

}
