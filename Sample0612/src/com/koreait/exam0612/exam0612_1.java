package com.koreait.exam0612;
import java.util.Vector;
public class exam0612_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector list = new Vector();
		list.add(1.2);
		list.add(Math.PI); // List 메서드
		list.addElement(3.4); // Framework 이전 메서드
		
		for(Object o : list) {
			System.out.println(o);
		}
		double num = 3.4;
		
		int index = list.indexOf(num);
		if(index >= 0 ) {
			System.out.println(num + "의 위치 :" + index);
		} else {
			System.out.println(num + "  는 리스트에 없습니다.      ");
		}
		num = 1.2;
		if(list.contains(num)) {
			list.removeElement(num);
			System.out.println(num+ "삭제되었습니다   ");
		}
		System.out.println(list.indexOf(num));
		System.out.println(list);
	}

}
