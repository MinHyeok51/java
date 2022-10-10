package interfaceSample;

public interface UsbConnectable {
//USB로 연결할 수 있는가?
	int USB_CONNECTED = 1;		//연결성공
	int USB_DISCONNECTED = 2;	//연결안됨
	int USB_CONNECT_FAILURE = 3;//연결은 된거같은데 접속불량이라 기능이 안됨
	
	public boolean connectByUsb(); // 스마트 연결
}
