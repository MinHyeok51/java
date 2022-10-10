package interfaceSample;

public class BluetoothSpeaker extends ElcApp{
	int volume; //볼륨
	
	
	public BluetoothSpeaker(String kind, String name, int volt) {
		super(kind, name, volt);
		volume = 0;
	}
	public String toString() {
		return String.format("종류:%s 이름:%s 전압:%d 볼륨:%d", kind, name, volt,volume);
	}
}
