package interfaceSample;

public class SmartAircon extends Aircon implements SmartConnectable{
	boolean isConnected; //스마트 연결이 되어있는가. true false
	
	public SmartAircon(String kind, String name, int volt) {
		super(kind, name, volt);
		isConnected = SmartConnectable.SMART_DISCONNECTED;
	}

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		isConnected = SmartConnectable.SMART_CONNECTED;
		return isConnected;
	}

	@Override
	public void run() {
		System.out.println("스마트 에어컨 작동");
	}

}
