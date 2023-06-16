package com.koreait.exam0616;

public class exam0616 {

//		public static void printLength(String data) {
//			int result = data.length();
//			System.out.println("문자의 수는 :"+result);
//		}
//		
//		public static void main(String[] args) {
//			System.out.println("프로그램\n");
//			printLength("This is java program");
//			printLength(null);
//			System.out.println("프로그램 종료");
//		}
	
	// 예외처리 구문 작성
//		public static void printLength(String data) {
//			try {
//				int result = data.length();
//				System.out.println("문자의 수는 :"+result);
//			} catch(NullPointerException e){
//				System.out.println(e.getMessage());
//			} finally {
//				System.out.println("프로그램 마무리 실행");
//			}
//		}
//	
//		public static void main(String[] args) {
//			System.out.println("프로그램\n");
//			printLength("This is java program");
//			printLength(null);
//			System.out.println("프로그램 종료");
//		}
	
		public static void printLength(String data) {
			try {
				int result = data.length();
				System.out.println("문자의 수는 :"+result);
			} catch(NullPointerException e){
				//System.out.println(e.toString()); 예외 종류까지 리턴
				//System.out.println(e.getMessage()); 예외 발생한 이유를 리턴
				e.printStackTrace(); // 예외가 어디서 발생했는지 추적
			} finally {
				System.out.println("프로그램 마무리 실행");
			}
		}
	
		public static void main(String[] args) {
			System.out.println("프로그램\n");
			printLength("This is java program");
			printLength(null);
			System.out.println("프로그램 종료");
		}
}
