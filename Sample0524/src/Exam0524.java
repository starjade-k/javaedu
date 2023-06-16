import java.util.Scanner;
public class Exam0524 {
	static int calc(int v1, int v2, int op) {
		int result;
		
		switch(op) {
		case 1: result = v1+v2; break;
		case 2: result = v1-v2; break;
		case 3: result = v1*v2; break;
		case 4: result = v1/v2; break;
		default: result = 0;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res;
		int oper, num1,num2;
		
		System.out.printf("연산자 입력(1 : +, 2: -, 3: *, 4: /) : ");
		oper = sc.nextInt();
		
		System.out.printf("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		

		res = calc(num1,num2,oper);
		
		System.out.printf("계산 결과는 : %d\n",res);
	}
	
}
