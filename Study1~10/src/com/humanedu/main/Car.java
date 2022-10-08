package com.humanedu.main;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자 - 생성될때 초기화 new Car();
	public Car(String _company, String model, String color,int maxSpeed) { //기본생성자
		//최초에 만들어질때 초기화
		company = _company;	//회사 스타일마다 _쓰거나 this씀
		this.model = model;
		this.color =color;
		this.maxSpeed = maxSpeed;
		
	}
	//메소드
}
