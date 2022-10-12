package study009;

public class MonitorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m1 = new Monitor("삼성", 27, 150000,"검은색");
		Monitor m2 = new Monitor("LG", 32, 330000);
		
		m1.powerOn();
		
		m1.setXY(1080, 780);	//메소드를 불러 값저장한거
		m2.setColor("흰색");		//메소드를 불러 값저장한거
		m2.setXY(4096,2048);	//메소드를 불러 값저장한거
		
		m1.show();
		System.out.println();
		m1.powerOn();
		m2.show();
		
		System.out.println("인상된 후 금액: "+m2.risePrice(70000));
		
	}

}
