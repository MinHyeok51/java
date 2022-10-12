package com.humanedu.main;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("이민혁", "123465489-3215654");
		System.out.println("k1.name : "+ k1.name);
		System.out.println("k1.ssn : "+ k1.ssn);
		System.out.println(k1.nation);
		
		Korean k2 = new Korean("김자바", "321561-654654");
		System.out.println("k2.name : "+ k2.name);
		System.out.println("k2.ssn : "+ k2.ssn);
	}

}
