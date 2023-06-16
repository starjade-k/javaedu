package com.koreait.quiz;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.printf("1. 연락처 출력\n2. 연락처 저장 \n3. 연락처 삭제 \n4. 종료\n");
		num = sc.nextInt();
		while(num < 5) {
			
				switch(num) {
				case 1: 
					System.out.printf("연락처 출력\n");
					break;
					
				case 2: 
					System.out.printf("연락처 저장\n ");
					break;
				case 3: 
					System.out.printf("연락처 삭제 \n");
					break;
				case 4: 
					System.out.printf("종료\n");
					break;
				}
			System.out.printf("1.연락처 출력\n2. 연락처 저장 \n3. 연락처 삭제 \n4. 종료\n");	
			break;
		}
	}
		
}


