package interfaceSample;

public class HomeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home myHome = new Home("대흥동 306번지", "홍길동");
		
		Aircon air = new Aircon("거실가전","에어컨", 220);
		BluetoothSpeaker bs = new BluetoothSpeaker("소형가전", "브리츠", 220);
		RobotVacuum rv = new RobotVacuum("스마트가전", "둥글이", 220);
		myHome.addElcApp(air);
		myHome.addElcApp(bs);
		myHome.addElcApp(rv);
		
		
		
		SmartAircon smAir = new SmartAircon("거실가전","스마트에어컨", 220);
		SmartBluetoothSpeaker smBs = new SmartBluetoothSpeaker("소형가전", "스마트브리츠", 220);
		SmartRobotVacuum smRv = new SmartRobotVacuum("스마트가전", "스마트둥글이", 220);
		
		//담을수 없는객체
//		myHome.shMachine.addMachine(Air);
		myHome.addElcApp(smAir);
		myHome.addElcApp(smBs);
		myHome.addElcApp(smRv);
		
//		myHome.shMachine.addMachine(smAir);
//		myHome.shMachine.addMachine(smBs);
//		myHome.shMachine.addMachine(smRv);
//		myHome.shMachine.runMachine(); //모든 기기작동명령
		
		myHome.runSmartMachine();
		myHome.showElcAppList();
	}

}
