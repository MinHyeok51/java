package interfaceSample;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeMachine {
	//스마트홈 메인 제어하는 기기(서버)
	List<SmartConnectable> smartMachines = new ArrayList<SmartConnectable>();

	public void addMachine(SmartConnectable machine) {
		smartMachines.add(machine);
	}

	public void runMachine() {
		//자기가 제어하는 스마트기기들을 모두 연결해서 작동시킴.
		//함수내 기능 : 연결 ->작동
		//연결이 성공적으로 잘 되면 ->작동

//		for(int i = 0; i<smartMachines.size(); i++) {
//			SmartConnectable sc = smartMachines.get(i);
//			if(sc.connect() == SmartConnectable.SMART_CONNECTED) {
//				sc.run();
//			}
//		}
		
		for(SmartConnectable sc :smartMachines ) {
			if(sc.connect()) {
				sc.run();
			}
		}
		

	}
}
