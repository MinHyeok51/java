package classmethod;

public class Car {
	int gas;
	int speed;
	
	void setGas(int gas) {
		this.gas =gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량:" + gas +")");
				gas -=1;
			}else {
				System.out.println("멈춥니다. (gas잔량:" + gas +")");
				return;
			}
		}
	}
	
	int getSpeed() {
		return speed;
	}
	
	void keyturnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run2() {
		for(int i=30; i<=300; i+=50) {
			speed =i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}
