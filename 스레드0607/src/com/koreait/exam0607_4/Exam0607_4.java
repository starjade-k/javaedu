package com.koreait.exam0607_4;

public class Exam0607_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴파일 하면 외부 클래스$내부.클래스
		//inner 클래스
		class Car{
			String carName;
			
			Car(String carName){
				this.carName = carName;
			}
			
			public void run() {
				for(int i = 0; i<3;i++) {
					try {
						Thread.sleep(10);
						System.out.println(carName+ "달려가는중");
					} catch(Exception e) {
						
					}
				}
			}
		}
		Car car1 = new Car("자동차1");
		car1.run();
		
		Car car2 = new Car("자동차2");
		car2.run();
		
		Car car3 = new Car("자동차3");
		car3.run();
	}

}
