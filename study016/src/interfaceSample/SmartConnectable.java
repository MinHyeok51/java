package interfaceSample;

public interface SmartConnectable {
	boolean SMART_CONNECTED = true;
	boolean SMART_DISCONNECTED = false;
	
	public boolean connect(); // 스마트 연결
	public void run(); //기능을 수행하라
}
