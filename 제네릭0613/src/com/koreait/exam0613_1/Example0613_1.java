package com.koreait.exam0613_1;

public class Example0613_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv,String> pd1 = new Product<>();
		// K는 Tv M은 String 으로 대체
		pd1.setKind(new Tv());
		pd1.setModel("OLED TV");
		
		Tv tv = pd1.getKind();
		String tvModel = pd1.getModel();
		
		Product<Car,String> pd2 = new Product<>();
		pd2.setKind(new Car());
		pd2.setModel("자동차");
		
		Car car = pd2.getKind();
		String carModel = pd2.getModel();
	}

}
