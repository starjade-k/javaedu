import java.util.Scanner;

public class Switch_case문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.printf("1~4 중에 하나를 선택해주세요 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.printf("1번을 선택하셨습니다.");
			break;
		case 2:
			System.out.printf("2번을 선택하셨습니다.");
			break;
		case 3:
			System.out.printf("3번을 선택하셨습니다.");
			break;
		case 4:
			System.out.printf("4번을 선택하셨습니다.");
			break;
		default:
			System.out.printf("잘못된 번호를 선택하셨습니다.");
		}
	}

}
