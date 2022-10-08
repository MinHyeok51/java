package interfaceEx;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		RemoteControl rc2 = new SmartTelevision();
		rc2.setVolume(5);
		Searchable sa2 = new SmartTelevision();
		sa2.search("유튜브");
	}
}

