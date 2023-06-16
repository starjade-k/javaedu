import java.util.Scanner;
public class If문0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 200;
//		
//		if(a < 100) {
//			System.out.printf("참일때 실행");
//			System.out.printf("참일때 실행1");
//		} else {
//		System.out.printf("거짓일때 실행\n");
//		System.out.printf("거짓일때 실행1");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.printf("정수를 입력하세요 : ");
//		num = sc.nextInt();
//
//		if(num % 2 ==0) {
//			System.out.printf("짝수를 입력하셨군요.\n");
//		}
//		else {
//			System.out.printf("홀수를 입력하셨군요.\n");
//		}
		
		// ****if 중첩문****
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		System.out.printf("점수를 입력해 주세요 : ");
//		num = sc.nextInt();
//		
//		if(num >= 90) {
//			System.out.printf("A 학점입니다.");
//		}
//		else if(num >= 80) {
//			System.out.printf("B 학점입니다.");
//		}
//		else if(num >= 70) {
//			System.out.printf("C 학점입니다.");
//		}
//		else if(num >= 60) {
//			System.out.printf("D 학점입니다.");
//		}
//		else {
//			System.out.printf("F 학점입니다.");
//		}
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		char ch;
		
		System.out.printf("첫번째 정수를 입력해 주세요 : ");
		num1 = sc.nextInt();
		System.out.printf("계산할 연산식(+,-,*,/)을 입력하시오 : ");
		ch = sc.next().charAt(0);
		System.out.printf("두번째 정수를 입력해 주세요 : ");
		num2 = sc.nextInt();
		
		if(ch == '+') {
			System.out.printf("%d + %d = %d 입니다. \n", num1, num2, num1+num2);
		}
		else if(ch == '-') {
			System.out.printf("%d - %d = %d 입니다. \n", num1, num2, num1-num2);
		}
		else if(ch == '*') {
			System.out.printf("%d * %d = %d 입니다. \n", num1, num2, num1*num2);
		}
		else if(ch == '/') {
			System.out.printf("%d / %d = %d 입니다. \n", num1, num2, num1/num2);
		}
	}
}
