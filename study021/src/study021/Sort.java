package study021;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
//	private ArrayList<Integer> number;
//
//	Sort(){
//		this.number = new ArrayList<Integer>();
//	}
//	public void readNumbers() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오.");
//		String num = s.nextLine();
//		while(!num.equals("")) {
//			this.number.add(Integer.parseInt(num));
//			System.out.println("숫자를 입력하시오.");
//			num = s.nextLine();
//			if(num.equals("")) {
//				break;
//			}
//		}
//		s.close();
//		printNumbers();
//
//	}
//	public void printNumbers() {
//		for(int i=0; i<number.size(); i++) {
//			System.out.println(number.get(i));
//		}
//	}
//
//	public void ascending() {
//		int max =0;
//		for(int i=0; i<this.number.size(); i++) {
//			for (int j=i+1; j<this.number.size(); j++) {
//				if(this.number.get(i) > this.number.get(j)) {
//					max= this.number.get(i);
//					this.number.set(i, this.number.get(j));
//					this.number.set(j, max);
//				}
//			}
//		}
//		System.out.println(this.number);
//	}
//
//	public void descending() {
//		int min =0;
//		for(int i=0; i<this.number.size(); i++) {
//			for (int j=i+1; j<this.number.size(); j++) {
//				if(this.number.get(i) < this.number.get(j)) {
//					min= this.number.get(i);
//					this.number.set(i, this.number.get(j));
//					this.number.set(j, min);
//				}
//			}
//		}
//		System.out.print(this.number);
//	}
	
	//------------------------선생님코드
	
private ArrayList<Integer> alNum;
	
	public Sort() {
		this.alNum=new ArrayList<Integer>();
	}
	public void readNumbers() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("input number:");
		String n=s.nextLine();
		while(!n.equals("")) {
			this.alNum.add(Integer.parseInt(n));
			System.out.print("Input number:");
			n=s.nextLine();
		}
		s.close();
		
		System.out.println("Original number list:");
		this.printNumbers();
	}
	private void printNumbers(){
		for(int i=0; i<this.alNum.size(); i++) {
			System.out.print(this.alNum.get(i));
			System.out.print("  ");
		}
	}
	
	public void ascending(){	// (0~9)
		for(int i=0; i<this.alNum.size()-1; i++) {
			for(int j=i+1; j<this.alNum.size(); j++) {
				if(this.alNum.get(i) > this.alNum.get(j)) {
					int temp=this.alNum.get(i);
					this.alNum.set(i, this.alNum.get(j));
					this.alNum.set(j, temp);
				}
			}
		}
		System.out.println("\nAscending number list:");
		this.printNumbers();
	}
	public void descending() { // (9~0)
		for(int i=0; i<this.alNum.size()-1; i++) {
			for(int j=i+1; j<this.alNum.size(); j++) {
				if(this.alNum.get(i) < this.alNum.get(j)) {
					int temp=this.alNum.get(i);
					this.alNum.set(i, this.alNum.get(j));
					this.alNum.set(j, temp);
				}
			}
		}
		System.out.println("\nDescending number list:");
		this.printNumbers();
	}
}
