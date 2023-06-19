package com.koreait.exam0619;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class HandPhone {
	static String fname = "c:\\temp\\juso.txt";
	static class address {
		
		String name;
		String age;
		String phone;
		String email;
		address(String s1, String s2, String s3, String s4) {
			this.name = s1;
			this.age = s2;
			this.phone = s3;
			this.email = s4;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String select = "";
		System.out.printf(" \n==== 연락처 목록====\n");

		while (select != "4") {
			print_menu();
			select = sc.next();

			switch (select) {
			case "1":
				checkList();
				break;
			case "2":
				add_juso();
				break;
			case "3":
				delete_juso();
				break;
			case "4":
				return;
			default:
				System.out.printf("\n 잘못 입력했어요. 다시 선택하세요.\n");
			}
		}
	}

	static void print_menu() {
		System.out.printf("\n");
		System.out.printf("1. 연락처 조회 \n");
		System.out.printf("2. 연락처 등록 \n");
		System.out.printf("3. 연락처 삭제 \n");
		System.out.printf("4. 끝내기 \n");
	}

	static void checkList() throws IOException {
		Scanner sc =  new Scanner(System.in);
		System.out.println("조회 할 이름 : ");
		String name = sc.next();
		ArrayList<address> al = new ArrayList<address>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fname));
            while(true) {
                String text = br.readLine();            //텍스트 파일 내 데이터를 한 줄 씪 읽음
                
                //무한 반복 현상을 막기 위해 텍스트 내 데이터가 없으면 끝내도록
                if(text == null) {
                    break;
                }               
                String[] strArray = text.split("\t");
        
                address an = new address(strArray[0], strArray[1],strArray[2],strArray[3]);
                String[] res = {an.name, an.age, an.phone, an.email};
//                System.out.println(Arrays.toString(res));
                
                for(int i=0; i < res.length; i++) {
                	if(res[i].contains(name)) {
                		System.out.println("이름 : " + res[i] + "\n나이 : " + res[i+1] +"\n전화번호 : " +  res[i+2] + "\n이메일 : " + res[i+3]);
                	}else {
                		break;
                	}
                }
            }
            
		}catch(Exception e) {
        		e.printStackTrace();
        }
	}
	
	


	static void add_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		address adr = new address("" ,"", "", "");

		String wstr = "";

		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));

		System.out.printf("이름을 입력 ==> ");
		adr.name = sc.nextLine();
		System.out.printf("나이를 입력 ==> ");
		adr.age = sc.nextLine();
		System.out.printf("전화번호를 입력 ==> ");
		adr.phone = sc.nextLine();
		System.out.printf("이메일을 입력 ==> ");
		adr.email = sc.nextLine();
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone + "\t" + adr.email;
		bw.write(wstr);
		bw.newLine();

		bw.close();
	}

	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		String[] read_str = new String[50]; 
		String str = "";
		int del_line, i, count = 0;

		BufferedReader br = new BufferedReader(new FileReader(fname));

		if (!br.ready()) {
			System.out.printf("\n!! 연락처 파일이 없습니다. !!\n");
			return;
		}

		System.out.printf("\n삭제할 행 번호는 ? ");
		del_line = sc.nextInt();

		for (i = 0; i < 50; i++) {
			if ((str = br.readLine()) == null)
				break;

			if (i + 1 != del_line) {
				read_str[count] = str;
				count++;
			} else
				System.out.printf("%d 행이 삭제되었습니다. \n", del_line);
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));

		for (i = 0; i < count; i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}
		bw.close();
	}

	
}
