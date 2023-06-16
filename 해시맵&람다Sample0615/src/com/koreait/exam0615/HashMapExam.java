package com.koreait.exam0615;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// map collection 생성
		Map<String, Integer> map = new HashMap<>();
		// 객체 저장
		map.put("홍길동", 90);
		map.put("이순신", 90);
		map.put("김유신", 80);
		map.put("이순신", 95);
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		// 키값으로 밸류값을 받아오기
		String key = "홍길동";
		int value = map.get(key); // 키값을 get의 매개변수로 넣으면 그 키에 해당하는 밸류값을 리턴
		System.out.println(key + " : " + value);
		System.out.println();
		
		Set<String> keySet = map.keySet();
		// 이터레이터는 순환한다는 말임
		// 그러므로 여기서 키값을 반복하기위해 사용함
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k+" : "+v);
		}
		
		System.out.println();
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v =entry.getValue();
			System.out.println(k + " : "+ v);		
		}
		
		System.out.println();
		// 키값을 삭제하면 키가 갖고있던 밸류값도 삭제가됨
		map.remove("홍길동");
		System.out.println("총 Entry의 수는 : "+ map.size());
		System.out.println();
	}

}
