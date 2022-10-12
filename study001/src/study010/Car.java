package study010;

public class Car {
	int speed;
	
	void run() {
		System.out.println("시속"+speed + "km로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed =300;
		myCar.run();
		
	}
}
