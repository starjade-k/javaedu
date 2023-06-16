import java.util.Scanner;
public class While문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		
//		int i = 1;
//		while(i<=10) {
//			sum = sum+i;
//			i++;
//		}
//		System.out.printf("1 부터 10 까지의 합은 : " +sum );
//		
//		
//	}
/*		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		while(true) {
			System.out.printf("첫 번째 정수 입력 : ");
			num1 = sc.nextInt();
			System.out.printf("두 번째 정수 입력 : ");
			num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", num1,num2, num1+num2);
		}
*/		
//		int num = 100;
//		
//		while(num == 200) {
//			System.out.printf("이 문장이 화면에 보여질까요?\n");
//		}
//		
//		// do ~ while문
//		do {
//			System.out.printf("do ~ while구문 안에 있는 문장이 화면에 보여질까요?\n");
//		} while(num == 200);
		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		while(true) {
//			System.out.printf("첫 번째 정수 : ");
//			num1 = sc.nextInt();
//			System.out.printf("두 번째 정수 : ");
//			num2 = sc.nextInt();
//			
//			if(num1 == 0) {
//				break;
//			}
//			
//			System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);
//		}
//		System.out.printf("0이 입력되어서 while 구문을 종료합니다.");
//		int sum = 0;
//		int j;
//		//여기 i 오류나는거 영상 다시보기
//		for(int i = 1;i<=100; i++) {
//			sum = sum+i;
//			if(sum>=1000) {
//				break;
//			}
//			System.out.printf("1~1000까지의 합에서 1000이 넘어가는 숫자는 : %d\n",j);
//		}
		
		// ****이 부분 다시 보기****
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,sum;
		sum=0;
		
		System.out.printf("시작값 : ");
		num1 = sc.nextInt();
		System.out.printf("끝 값 : ");
		num2 = sc.nextInt();
		System.out.printf("배수값 : ");
		num3 = sc.nextInt();
		
		int i = num1;
		while(i <= num2) {
			if(i%num3 == 0)
				sum = sum + i;
			i++;
		}
//		for(int i=num1; i % 4 ==0; i++) {
//			sum = sum+=i;
//		}
		System.out.printf("%d 부터 %d 까지의 %d의 배수의 합은 : %d\n", num1,num2,num3,sum);

	}
}
