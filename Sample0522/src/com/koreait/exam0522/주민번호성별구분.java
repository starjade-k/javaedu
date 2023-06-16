package com.koreait.exam0522;
public class 주민번호성별구분 {
	public static void main(String[] args) {
//		String ssn = "9111302008745";
//		char ch = ssn.charAt(6);
//		
//		switch(ch) {
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자");
//			break;
//		}
		
		//주민등록번호 자리수 체크
		
//		String ssn = "9111302008745";
//		int length = ssn.length();
//		
//		if(length == 13) {
//			System.out.println("주민등록번호 자릿수가 맞습니다");
//		} else {
//			System.out.println("주민등록번호 자릿수가 맞지 않습니다");
//		}
		
		// 특정한 문자열 찾기 ==> indexOf()
		
//		String subject = "자바 프로그래밍";
//		int index = subject.indexOf("프로그래밍");
//		
//		// 주어진 문자열이 포함되어 있지 않으면 -1을 리턴
//		int index = subject.indexOf("프로그래밍");
//		if(index == -1) {
//			
//		} else {
//			
//		}
		// indexOf()는 안에있는 문자가 몇번째 인덱스에 있는지 찾아줌
		// 그러므로 아래 구문에서 location은 3이 되는것 "프로그래밍" 이 3번째에 있으니
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
		
		
	}
}
