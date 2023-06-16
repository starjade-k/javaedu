package com.koreait.quiz;
import java.util.Scanner;

public class quiz {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("+---------------------------------------+");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("+---------------------------------------+");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("계좌 생성\n");
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	//계좌생성하기
	private static void createAccount() {
		//작성 위치
		System.out.println("계좌 번호 입력 : ");
		String ano = scanner.nextLine();
		
		System.out.println("이름 입력 : ");
		String owner = scanner.nextLine();
		
		System.out.println("입금액 : ");
		int money = scanner.nextInt();
		
		for (int i =0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano,owner,money);
				System.out.println("계좌 생성완료");
				break;
			}
		}
		
	}

	//계좌목록보기
	private static void accountList() {
		//작성 위치
		System.out.println("계좌 목록");
		for(int i =0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println(accountArray[i].getAno() + accountArray[i].getOwner() + accountArray[i].getBalance() );
		}
	}

	//예금하기
	private static void deposit() {
		//작성 위치
		System.out.println("예금");
		
		System.out.println("계좌번호 : ");
		String ano = scanner.nextLine();
		
		System.out.println("금액 : ");
		int dep = scanner.nextInt();
				
		if(findAccount(ano) == null) {
			System.out.println("다시 시도해주세요");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep );
		}
		
	}

	//출금하기
	private static void withdraw() {
		//작성 위치
		System.out.println("출금");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		System.out.print("금액 : ");
		int dep = scanner.nextInt();
				
		if(findAccount(ano) == null) {
			System.out.println("다시 시도해주세요");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep );
		}
	}
	
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
	
	
}
