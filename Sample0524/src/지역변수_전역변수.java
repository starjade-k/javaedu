
public class 지역변수_전역변수 {
	static int a = 100;
	
	static void func1() {
		int a = 200;
		System.out.printf("func1()에서 a의 값은 : %d\n",a); // 지역변수 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1();
		System.out.printf("main()에서 a의 값은 : %d\n",a); //전역변수 출력
	}

}
