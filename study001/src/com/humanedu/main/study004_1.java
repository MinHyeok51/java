package com.humanedu.main;

import java.util.Scanner;

public class study004_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/**
			 * 반복문
			 * 
			 * 초기화; 최초의 값을 지정.
			 * 조건식; 참 or 거짓 구분 식
			 * 증감; 나중에 조건식이 거짓이 되는 경우를 만들기 위해/데이터 조작
			 * 
			 * for(int i =1; i<=10; i++{
			 * }	초기화	조건식	증감
			 * 
			 * int i=1;
			 * while (i<=10) {
			 * 	sum = sum+i;
			 * 	i++;
			 * }
			 */
		//1-2-3-4 -> 234 ->234
	// for  (1.초기화 ; 2.조건식 ; 4.증감 ;)
							//3.실행문
//		int sum =0;
//		for (int i =1; i<=100; i++) {
//			sum = sum +i;
//			System.out.println(sum);
//		}
//	System.out.println("1~100의 합: "+sum);
		
//		for(int i=11; i<=20; i++) {
//			System.out.println(i);
//		}
		
//		int sum =0;
//		int i =0;
//		for(i=1; i<=100; i++) {
//			sum+=i;
//		}
//		System.out.println("1~"+(i-1)+" 합 :"+ sum);
		
		//시작숫자 끝 숫자를 입력받아서 시작~끝 합을 께산해서 출력하기.
//		Scanner scan = new Scanner(System.in);
//		//int startNum = scan.nextInt();
//		//int endNum = scan.nextInt();
//		int startNum ;
//	    int endNum;
//		System.out.println("숫자를 2개 입력하시오");
//		startNum=scan.nextInt();
//		endNum=scan.nextInt();
//		
//		int sum =0;		// +연산할땐 0으로 초기화 *연산할땐 1로 초기화
//		int i =0;
//	    
//	    
//	    	    	
//	    for(i=startNum; i<=endNum; i++) {
//	    	sum += i;
//	    }
//	    System.out.println(startNum + "~" + endNum + " 합 : " + sum);
		//-----------------------------------------------
//		int sum =0;
//		int i =1; //1~100 까지 더하기
//		 /**  
//		for (i=1; i<=100; i++) {
//			sum +=i;
//		}
//		*/
//		while(i<=100) {  // i 가 100이 되는순가 중단
//			sum +=i;
//			i++;
//		}
//		//i =101
//		System.out.println("1~"+ (i-1)+ " 합 : "+sum);
		
		//-------------------------------------------------
//		while(true) {
//			int num =(int)(Math.random()*6)+1; //1~6
//			System.out.println(num); //출력
//			if(num == 6) { 
//				break;
//				}
//			}
//			System.out.println("프로그램 종료");
		
		//--------------------------------------------------
//		for(int i=1; i<=10; i++) //짝수 뽑기
//		{
//			if(i%2 !=0) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
//		for(int i =1 ; i<=10; i++) //홀수 뽑기
//		{
//			if(i%2 !=1) {
//				continue;
//			}
//			System.out.println(i);
//		}
		//----------------------------------------------------
//		Outter:
//			for (char upper='A'; upper<='Z'; upper++)
//			{
//				for(char lower='a'; lower<='z'; lower++)
//				{ System.out.println(upper + "-"+ lower);
//				if(lower=='g') {
//					break Outter;
//				}
//				}
//			}
		//문제. 1부터 20까지의 정수중에서 2 or3의 배수가 아닌 값의 총합을 출력,
		//Hint) 반복문 1~20 2의 배수냐 3의 배수냐
		//덧셈 하는거를 조건으로 나눠서 더하든, continue생략 하든 자유
		//  A or B (<-사람) (컴퓨터 ->) A || B
		//  A and B					A && B
		//결과를 for 한번 while 한번
		//1,5,7,11,13,17,19
//		int sum = 0;
//		for (int i=1; i<=20; ++i)
//		{	
//		if(i%2 ==0 || i%3 ==0)  
//			
//			continue;	
//		  }	
//		  	System.out.println(i);
//		  	
//		}
//		System.out.println(sum);
//============================선생님 해설====================================
//		int sum = 0;
//		for (int i=1; i<=20; i++)
//		{	
//		if(i%2 == 0)  { 
//			continue;	
//		  }	
//		if(i%3==0)  { 
//			continue;	
//		  }	
//		  		  sum=sum+i;
//		}
//		System.out.println(sum);
		//---------------------------------------------------------
	/** 1.정수를 입력받고 홀수면 "ood"를 출력, 짝수면 "even"을 출력하기.
	 * 2.정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다."출력
	 * 3.1~1000까지의 수 중에서 5의 배수의 합을 출력하기.
	 * 4. 1~50까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
	 * 		ex)입력: 10
	 * 		   결과:	**********
	 * 5. 1 ~10 까지의 수에서 홀수면 더하기 (+), 짝수면 빼기 (-)를 수행해서 최종 결과 출력.
	 * 		ex) 1 - 2 + 3 - 4 ....
	 * 6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고 1000이 넘어가면 멈춘다. 
	 * 멈추는 시점까지 누적으로 더해진 값을 출력하기.
	 * 7.입력한 숫자의 구구단을 출력하기. (1~9)
	 * ex) 3
	 * 3*1=3
	 * 3*2=6
	 * 3*3=9
	 * ....
	 */
//	1.정수를 입력받고 홀수면 "ood"를 출력, 짝수면 "even"을 출력하기.
//		Scanner scan= new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int num= scan.nextInt();
//		if(num%2 ==0 ) {
//					System.out.println("even");
//				}else {
//					System.out.println("odd");
//				}
//	2.정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다."출력
//		if(num%7 == 0) {
//			System.out.println("7의 배수입니다.");
//		}else {
//			System.out.println("7의 배수가 아닙니다.");
//		}
//	3.1~1000까지의 수 중에서 5의 배수의 합을 출력하기.
//		System.out.println("1~1000까지의 수 중에서 5의 배수의 합");
//		int sum = 0;
//		for(int i=1; i<=1000; i++) {
//			if(i%5 ==0) {
//				sum=sum+i;
//			}
//		}
//			System.out.println(sum);
//	4. 1~50까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.	
//		Scanner scan= new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int num= scan.nextInt();
//		for(int i =num; i==num; i++) {
//			for(int j= 1; j <=i; j++) {
//				System.out.print("*");
//			if (j==i) {
//				System.out.println();
//			}
//		  }
//		}
//	5. 1 ~10 까지의 수에서 홀수면 더하기 (+), 짝수면 빼기 (-)를 수행해서 최종 결과 출력.
//		System.out.println("숫자를 입력하시오");
//		int num= scan.nextInt();
//		if(num%2 ==0 ) {
//					System.out.println("-");
//				}else {
//					System.out.println("+");
//					}
		
//	6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고 1000이 넘어가면 멈춘다. 
//		  멈추는 시점까지 누적으로 더해진 값을 출력하기.
//		for(int i =1; i<=1000; i++) {
//			if(i==1001){
//				break;
//			}
//			System.out.println(i);
//		}
//	7.입력한 숫자의 구구단을 출력하기. (1~9)
		//2단
		Scanner scan=new Scanner(System.in);
		System.out.println("구구단");
		int num = scan.nextInt();
		
		for(int m=num ; m<=num; m++) {
			System.out.println(m+"단");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " +(m*n));
			}
		}
			}
		}
	


