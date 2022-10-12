package com.humanedu.main;

import java.util.Scanner;

public class study006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. 2x + 4y =10이 만족하는 모든 x,y쌍을 구하시오 (x와y는 자연수 1~10)
//		for (int x=1; x<=10; x++) {
//			for(int y=1; y<=10; y++) {
//				if(2*x + 4*y ==10) {
//					System.out.println(x+","+y);
//				}
//			}
//		}
		
//2. 정수 2개를 입력받아서, 아래 계산 결과를 출력 (큰수-작은수)
//		Scanner scan = new Scanner(System.in);
//		int num1= scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		if(num1 >=num2) {//num1크거나 같은 경우
//			System.out.println(num1+"-"+num2+"="+(num1-num2));
//		}else {// 그외의 경우 num2 가 작은경우
//			System.out.println(num1+"-"+num2+"="+(num2-num1));
//		}
//		
////3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개		
		
//		Scanner scan = new Scanner(System.in);
//		int yut1, yut2 , yut3, yut4;
//		yut1 = scan.nextInt();
//		yut2 = scan.nextInt();
//		yut3 = scan.nextInt();
//		yut4 = scan.nextInt();
//		int count=0;	//뒤집어진 개수
//		count =yut1+ yut2+yut3+yut4;
//		switch(count) {
//		case 0:
//			System.out.println("모");
//			break;
//		case 1:
//			System.out.println("도");
//			break;
//		case 2:
//			System.out.println("개");
//			break;
//		case 3:
//			System.out.println("걸");
//			break;
//		case 4:
//			System.out.println("윷");
//			break;
//		}
//		
	/*4. 입력받은 수 만큼 별 출력하기
		ex) 4
		****
		5
		*****  */
//		Scanner scan = new Scanner(System.in);
//		int num = scan. nextInt();
//		for (int i =1 ; i<=num; i++)
//		{
//			System.out.print("*");
//		}
		
	/*	5. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
			입력 : 8
				1 2 4 8
		*/
//		Scanner scan = new Scanner(System.in);
//		int num = scan. nextInt();
//		
//		for(int i =1; i<=num; i++)
//			if(num%i ==0) { // 6%1 6%2 6%3 6%4 6%5 6%6
//				System.out.print(i+" ");
//			}
//		
	/*
		6. 숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*				줄수 : 1 2 3 4 5 6 7 8 9 
		**				별수 : 1 2 3 4 5 4 3 2 1 
		***
		****
		*****
		****
		***
		**
		*

		입력 : 3

		*
		**
		***
		**
		*
	*/
		Scanner scan = new Scanner(System.in);
		int num = scan. nextInt();
		
		//초기화1  조건2  내부실행3  증감4			
		// 1 2 3 4  2 3 4 2 3 4  
		for(int i=1; i<=num; i++) { 
			
			for(int j=1; j<=i; j++) {  
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=num-1; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
