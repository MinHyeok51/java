package study020;

import java.awt.Toolkit;

public class BeepPrint_main {

	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask(); //방법1. 인터페이스 Runnable의 구현클래스를 만들고
//		Thread trd = new Thread(beepTask); //구현클래스를 스레드에 담아서 실행시킨다.
//		trd.start();
		
		Thread trd = new BeepTask1();	//방법2.Thread클래스의 자식클래스로 만들고 실행시킨다.
		trd.start();
//		trd.run();	//하나의 코어에서 진행
	
		System.out.println(trd.getName());
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(800);} catch(Exception e) {}
		}
	
	}

}
