package interfaceSample;

public class SmartRobotVacuum extends RobotVacuum implements SmartConnectable{
	boolean isConnected;
	
	public SmartRobotVacuum(String kind, String name, int volt) {
		super(kind, name, volt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean connect() {
		isConnected = SmartConnectable.SMART_CONNECTED;
		return isConnected;
	}

	@Override
	public void run() {
		System.out.println("스마트 로봇 청소기 작동");
		
	}
	

}
