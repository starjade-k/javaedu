import java.util.Scanner;
public class 객체생성0515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4 ;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫번째 정수를 입력해 주세요 :");
		num1 = sc.nextInt();
		System.out.printf("두번째 정수를 입력해 주세요 :");
		num2 = sc.nextInt();
		System.out.printf("첫번째 정수를 입력해 주세요 :");
		num3 = sc.nextInt();
		System.out.printf("두번째 정수를 입력해 주세요 :");
		num4 = sc.nextInt();
		
		result = num1 + num2 + num3 + num4;
		
		System.out.printf("합은 ==>" + result+"입니다.");
//	
//		result = num1 * num2;
//		System.out.printf(num1 + "*" + num2 + "=" + result+"\n");
//		
//		result = num1 / num2;
//		System.out.printf(num1 + "/" + num2 + "=" + result+"\n");
		
	}

}
