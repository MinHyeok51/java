package interfaceSample;

import java.util.ArrayList;
import java.util.List;

public class Home {
	//집
	//내부 가구, 가전
		//가전 - 스마트홈 (중앙제어)
	List<ElcApp> elcApps; 
	String address;
	String owner;
	
	private SmartHomeMachine shMachine;
	
	public Home(String address, String owner) {
		this.address = address;
		this.owner = owner;
		elcApps = new ArrayList<ElcApp>();
		shMachine = new SmartHomeMachine();
	}
	public void addElcApp(ElcApp elcApp) {
		elcApps.add(elcApp);
		if(elcApp instanceof SmartConnectable) {
			shMachine.addMachine((SmartConnectable)elcApp);
		}
	}
	public void removeElcApp() {
		//어떤걸 지우시겠습니까? 1인덱스?
		//명확하게 구분이 되는 키값 필요
		//instanceof smartConnectable
		//shmachine.remove()
	}
	public void runSmartMachine () {
		shMachine.runMachine();
	}
	public void showElcAppList() {
		for(ElcApp ea : elcApps) {
			System.out.println(ea.toString());
		}
	}
	
}
