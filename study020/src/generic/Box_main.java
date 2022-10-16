package generic;

import java.util.ArrayList;

public class Box_main {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		
		b1.set(10);
		System.out.println(b1.get());
		
		Box<Double> b2 = new Box<Double>();
		b2.set(3.14);
		System.out.println(b2.get());
		
//		double sum = b1.get()*b2.get();
		System.out.println(b1.get()*b2.get());
		
	}

}
