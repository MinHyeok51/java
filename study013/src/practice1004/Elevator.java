package practice1004;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		int b=7;
		int c=10;
		int d=100;
		int e=-5;
		
		//%d 정수형 
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
		System.out.printf("%d층 -> %s 엘레베이터\n", d, guide(d));
		System.out.printf("%d층 -> %s 엘레베이터\n", e, guide(e));
	}
	
	public static String guide(int floor) {
		
		if(floor>=11 && floor <=20) {
			 return"고층";
		}else if(floor >=1 && floor <=10){
			return"저층";
		} else {
			return "?";
		}
	}

}
