package quiz;
import java.util.Scanner;
public class quiz1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 수 입력 : ");
		int first = sc.nextInt();
		
		System.out.printf("연산자 입력 : ");
		String sam = sc.next();
		
		System.out.printf("두번째 수 입력 : ");
		int second = sc.nextInt();
		if(sam == "+") {
			System.out.println("결과는 : " + (first+second));
			res += (first+second);
		} else if (sam == "-") {
			System.out.println("결과는 : " + (first-second));
			res += (first-second);
		} else if (sam == "/") {
			System.out.println("결과는 : " + (first/second));
			res += (first/second);
		} else if (sam == "*") {
			System.out.println("결과는 : " + (first*second));
			res += (first*second);
		} else if(res == 0) {
			try {
				Exception e = new Exception();
				throw e;
			} catch(Exception e) {
				System.out.println("발생오류 : 0으로 곱하면 0입니다");
			}
		}
		
		
		
	
		
		
	}

}
