import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<7; i++) {
//			System.out.printf(i+i);
//		}
		
//		int sum = 0;
//		for(int i = 1; i <=10; i++) {
//			sum += i;
//			System.out.printf("1부터 10의 합은 : %d 입니다.\n", sum);
//		}
		
		//****구구단 예제****
		
//		Scanner sc = new Scanner(System.in);
//		int gugudan;
//		
//		System.out.printf("원하는 구구단은 ?");
//		gugudan = sc.nextInt();
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("%d X %d = %2d\n", gugudan, i, gugudan*i);
//		}
		
		//****구구단 전체 출력****
		// 시간날 때 출력값이 한줄에 나타나도록 변경해보기
		for(int i =2; i <=9; i++) {
			for(int j=1; j <=9; j++) {
				System.out.printf("%2d X %2d = %2d\n", i,j,i*j);
			}
			System.out.printf("\n");
		}
	}

}
