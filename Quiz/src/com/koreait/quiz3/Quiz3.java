package com.koreait.quiz3;
/* 위의 2번 문제의 코드에 오버로드된 생성자를 추가하여 이 생성자에서는
  String 인자를 하나 받아서 출력한다.*/
 
class Message{
	String str;
	
	// 메세지 출력 확인 메소드
	void msg(){
		System.out.println("출력 메세지 : " +str);
	}
	// 디폴트 생성자
	Message(){
		
	}
	// 생성자 오버로드
	Message(String str){
		this.str = str;
	}
}

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message me = new Message();
		me.msg();
		
		Message me2 = new Message("안녕하세요");
		me2.msg();

	}

}
