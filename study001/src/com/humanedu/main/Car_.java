package com.humanedu.main;

public class Car_ {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car_(){
			}
	
	Car_(String model){
	this(model, "은색", 250);
	}
	
	Car_(String model, String color){
		this(model,color,250);
		
	}
	
	Car_(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		}
}
