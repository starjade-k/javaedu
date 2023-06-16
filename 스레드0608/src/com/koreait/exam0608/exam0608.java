package com.koreait.exam0608;
// 스레드를 사용하려면 Thread를 상속 받아야한다.
// run() 메서드를 만들어서 실행해야하고 그리기 위해서는 start() 메서드를 호출하면
// 자동적으로 run() 메소드가 작동하여 실행하게 된다.
// 생성자는 객체를 초기화 시켜줌
public class exam0608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Car extends Thread{
			String carName;
			
			Car(String carName){
				this.carName = carName;
			}
			
			public void run() {
				for(int i = 0; i<3;i++) {
					try {
						Thread.sleep(100);
						System.out.println(carName+ "달려가는중");
					} catch(Exception e) {
						
					}
				}
			}
		}
		
		Car car1 = new Car("포니1");
		car1.start();
		
		Car car2 = new Car("포니2");
		car2.start();
		
		Car car3 = new Car("포니3");
		car3.start();
	}

}
