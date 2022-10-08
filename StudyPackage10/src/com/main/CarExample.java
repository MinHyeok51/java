package com.main;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.setSpeed(-20);
		
		System.out.println("현재 속도: "+ myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		if(!myCar.isStop()) {	//isStop이 트루면 멈춰있다인데 !있으니까 false 즉 멈춘상태가 아니면 멈추게 하려는거 
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}

}
