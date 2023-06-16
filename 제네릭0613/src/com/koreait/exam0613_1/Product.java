package com.koreait.exam0613_1;

public class Product<K, M> {
	private K kind; // 데이터의 필드로 사용
	private M model;
	
	// 타입 파라미터를 리턴 타입과 매개변수 타입으로 사용
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
