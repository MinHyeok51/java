package study010;

public class Singleton {
	private static Singleton singleton = new Singleton();	//단 하나의 객체
	
	private Singleton() {}	//생성자를 막아둠
	
	static Singleton getInstance() {	//스태틱이 스태틱으로 접근
		return singleton;
	}
}
