import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();		
		int[] res = new int[num];
		res[0] = 1;
		res[1] = 1;
		
		for(int i = 2; i<num; i++) {
			res[i] = (res[i-1] + res[i-2]);
		}
		
		for(int j = 0; j <= res.length; j ++) {
			System.out.print(res[j]+" ");
		}
		

	}

}
