
public class 메서드 {
	
	static int add(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static은 객체가 없어도 메서드를 호출 할 수 있게 만드는 기능이 있다
		int sum;
		sum = add(100,250);
		System.out.printf("100과 250의 합은 : %d\n", sum);
	}

}
