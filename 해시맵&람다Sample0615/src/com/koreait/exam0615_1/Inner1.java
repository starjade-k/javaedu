package com.koreait.exam0615_1;

interface Unit3{
	void move();
}
// 람다는 클래스를 객체없이 실행시킬 수 있다(익명 내부 클래스)
// 람다는 1. 익명클래스를 나타내는 의미럾이 붙인 이름과 외부의 중괄호를 제거
// 2. 함수이름, 반환형 없애고 단 지 화살표(->) 연산자를 추가
// 3. 함수의 실행문{} 블록을 남기고 문장의 끝을 알려주기 위해서 ' , ' 으로 마지막을 표시
// 4. 람다는 메서드로 전달할 수 있는 익명 함수를 단순화 한것이라고 할수있다.
// 5. 이름은 없고, 파라미터 리스트, 바디, 반환형식, 예외처리...등등 을 가질 수 있다
// 6. 람다는 특정 클래스에 종속되지 않는다 그래서 람다메서드라고 부르지 않고 람다 함수라 부른다.

class HumanCamp{
	private int speed = 10;
	public Unit3 getMarine() {
		class Marine3 implements Unit3{
			public void move() {
				System.out.printf("인간 유닛이 %d 속도로 이동 중\n", speed);
			}
		}
		return new Marine3();
	}
}
public class Inner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanCamp hc = new HumanCamp();
		Unit3 unit = hc.getMarine();
		unit.move();
	}

}
