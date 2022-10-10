package com.humanedu.main;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		/*          *
		 * 		   ***
		 * 		  *****
		 * 		 *******
		 * 		
		 */
		for(int i=0; i<7; i++) {
			
			for(int j=1; j<7-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//깃 연동 테스트 여기 수정됨.
	}

}
