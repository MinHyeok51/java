package inheritance;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Van van = new Van();
		Vehicle vehicle = new Vehicle();

		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(van);
		driver.drive(vehicle);
	}

}

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
	//			public void startMeter() {
	//				System.out.println("기본은 미터기가 없습니다.");
	//			}
}

class Driver {
	//			public void drive(Bus bus) {bus.run();}
	//			public void drive(Taxi taxi) {taxi.run();}	
	public void drive(Vehicle vehicle) {
		vehicle.run();
		if((vehicle instanceof Taxi)) {
			Taxi tempTaxi = (Taxi)vehicle;
			tempTaxi.startMeter();
		} if(vehicle instanceof Bus) {
			Bus tempBus = (Bus)vehicle;
			tempBus.tagCard();
		}
	}
}

class Bus extends Vehicle{
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public void tagCard() {
		System.out.println("교통카드 찍었습니다.");
	}
}

class Taxi extends Vehicle{
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	public void startMeter() {
		System.out.println("요금 미터기 시작합니다.");
	}
}

class Van extends Vehicle{
	//			public void run() {
	//				System.out.println("밴이 달립니다.");
	//			}
}
