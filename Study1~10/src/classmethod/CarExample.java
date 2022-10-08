package classmethod;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		
		myCar.setGas(5);
		
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
//		-----------------------------------------------
		System.out.println();
		String t = "시간";
		myCar.keyturnOn();
		myCar.run2();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/"+ t);
		
	}

}
