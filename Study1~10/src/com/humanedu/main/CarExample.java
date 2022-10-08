package com.humanedu.main;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//객체 생성
		Car myCar = new Car("투싼","초록색","현대자동차",200); 	//컬러 노란색
		
		//필드 값 읽기
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+ myCar.model);
		System.out.println("색깔: "+ myCar.color);
		System.out.println("최고속도: "+ myCar.maxSpeed);
		System.out.println("현재속도: "+ myCar.speed);
		
		//필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);

		System.out.println("------------------------------------------------");
		
		Car yourCar = new Car("K5","흰색","과학자동차",250);
//		yourCar.company ="기아자동차";
//		yourCar.model = "K5";
//		yourCar.color = "검은색";
		
		
		System.out.println("제작회사: "+yourCar.company);
		System.out.println("모델명: "+ yourCar.model);
		System.out.println("색깔: "+ yourCar.color);
		System.out.println("최고속도: "+ yourCar.maxSpeed);
		System.out.println("현재속도: "+ yourCar.speed);
		
		
	}

}
