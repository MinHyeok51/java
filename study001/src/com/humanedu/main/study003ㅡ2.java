package com.humanedu.main;

import java.util.Scanner;

public class study003ㅡ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 변수 num이 있는데, 백의 자리 이하를 버리는 코드입니다.
		 * ex) num =456 결과가 400 이라고 나와야하고
		 * 	   num =111 결과가 100 이라고 나와야한다.
		 * main {
		 * 		int num = 456;
		 *숫자 3자리를 입력받아서 백의자리 이하를 버리는것.
		  *System.out.println(_____________________); 400
		  */
//		Scanner scan = new Scanner(System.in);
		
//		int num;
//		num=scan.nextInt();
//		System.out.println((num/100)*100);
//		System.out.println(num-(num%100));
		
		/**변수 3자리 num이 있는데, 일의 자리를 1로 바꾸는 코드입니다.
		 * ex) 333->결과가 331, 111->결과가 111 , 778->결과가 771
				 */
//		Scanner scan = new Scanner(System.in);
//		
//		int num;
//		num=scan.nextInt();
//		System.out.println((num/10)*10+1);
//		System.out.println(num-(num%10)+1);
		/** ex)4자리 입력 1234 ->200 . 7988->900
		 * 
		 */
		Scanner scan = new Scanner(System.in);
//		
		int num;
		num=scan.nextInt();
//		System.out.println((num/100)*100-(num/1000)*1000);
		System.out.println(((num%1000)/100)*100);
	}

}
