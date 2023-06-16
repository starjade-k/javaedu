import java.util.Scanner;
public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int num1,num2,num3,num4;
//		int sum;
//		
//		System.out.printf("1번째 숫자 입력 : ");
//		num1 = sc.nextInt();
//		System.out.printf("2번째 숫자 입력 : ");
//		num2 = sc.nextInt();
//		System.out.printf("3번째 숫자 입력 : ");
//		num3 = sc.nextInt();
//		System.out.printf("4번째 숫자 입력 : ");
//		num4 = sc.nextInt();
//		
//		sum = num1+num2+num3+num4;
//		
//		System.out.printf("합은 : %d\n", sum);
		
//		Scanner sc= new Scanner(System.in);
//		int[] num = new int[4];
//		int sum;
//		
//		System.out.printf("1번째 숫자 입력 : ");
//		num[0] = sc.nextInt();
//		System.out.printf("2번째 숫자 입력 : ");
//		num[1] = sc.nextInt();
//		System.out.printf("3번째 숫자 입력 : ");
//		num[2] = sc.nextInt();
//		System.out.printf("4번째 숫자 입력 : ");
//		num[3] = sc.nextInt();
//		
//		sum = num[0]+num[1]+num[2]+num[3];
//		
//		System.out.printf("합은 : %d\n", sum);
		
//		Scanner sc= new Scanner(System.in);
//		int[] num = new int[10];
//		int sum =0 ;
//		
//		for(int i=0; i<10; i++) {
//			System.out.printf("%d번째 숫자 입력 : ",i+1);
//			num[i] = sc.nextInt();
//			sum = sum + num[i];
//			
//		}
//		System.out.printf("합은 : %d\n", sum);
		
		// 배열 선언
//		int aa[] = {100,200,300,400};
//		int bb[] = new int[] {100,200,300};
//		
//		int cc[];
//		cc = new int[] {100,200};
//		int[] dd = new int[1];
//		dd[0] = 100;
//		
//		for(int i = 0; i< 4; i++) {
//			System.out.printf("aa[%d] => %d\t", i,aa[i]);
//		}
//		System.out.printf("\n");
//		
//		for(int i = 0; i< 3; i++) {
//			System.out.printf("bb[%d] => %d\t", i,bb[i]);
//		}
//		System.out.printf("\n");
//		
//		for(int i = 0; i< 2; i++) {
//			System.out.printf("cc[%d] => %d\t", i,cc[i]);
//		}
//		System.out.printf("\n");
//		
//		for(int i = 0; i< 1; i++) {
//			System.out.printf("dd[%d] => %d\t", i,dd[i]);
//		}
//		System.out.printf("\n");
		
		int num[] = {10,20,30,40,50};
		int count, size;
		
		count = num.length; // length는 배열의 길이
		size = count*Integer.BYTES; // 배열 전체 크기를 계산
		
		System.out.printf("배열 num[]의 개수는 %d 개 입니다 \n", count);
		System.out.printf("배열 num[]의 전체 크기는 %d바이트 입니다 \n", size);
	}

}
