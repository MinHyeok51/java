package study020;

import java.awt.Toolkit;

public class BeepTask1 extends Thread {
	Toolkit tk = Toolkit.getDefaultToolkit();
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			tk.beep();
			try {Thread.sleep(800);} catch(Exception e) {}
		}
	}
}
