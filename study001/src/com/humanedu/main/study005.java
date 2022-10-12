package com.humanedu.main;

import java.util.Scanner;

public class study005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int tall =160;
//		if(tall >120 ) {
//			System.out.println("범퍼카 가능");
//		}
//		if(tall>150){
//			System.out.println("자이로드롭 가능");
//		}else if(tall>158) {
//		
//			System.out.println("귀신의 집 가능");}
//		else {
//			System.out.println("불가능");
//		}
//		if(tall>170) {
//			System.out.println("롤러코스터 가능");
//		}
////	
//	-------------------------------------------------
//		for(int i=3; i<=6; i++) {
//			System.out.println(i);
//		}
//	-----------------------------------------------
//		char grade = 'B';
//		
//		switch(grade) {
//		case 'A' :
//		case 'a' :
//			System.out.println("등급은 A 입니다.");
//		case 'B' :
//		case 'b' :
//			System.out.println("등급은 B 입니다.");
//		case 'C' :
//		case 'c' :
//			System.out.println("등급은 C 입니다.");
//		case 'D' :
//		case 'd' :
//			System.out.println("등급은 D 입니다.");
//			break;
//		default:
//			System.out.println("등급은 F 입니다.");
//		}
//		---------------------------------------------------
//		4번 문제 //while문사용 //1~10까지의 정수 중 2의 배수의 개수를 구해 출력
//		int i = 1;
//		int sum = 0;
//		int count = 0;
//		while(i<=10) {
//		
//		i++;
//		if(i%2!=0) {
//			
//			continue;
//		}
//		System.out.println(count);
//		}	
//		4번 해설)))))))))))))))))))))))))))))))))
//		int i=1;
//		int count=0;
//		while(i<=10) {
//			//1번케이스
//			if(i%2==0) {//여기가 2의 배수인 경우 수행되는 부분
//				count++; //  i : 2 4 6 8 10
//						//count: 1 2 3 4 5
////				count = count+1;
//			}
//			i++;
//		}System.out.println(count);
//		while(true) {//2번케이스
//			if(i>10) {
//				break;
//			}
//			i++;
//		}
//	------------------------------------------------------------------
//		Q. for문사용
//		1~100의 수 중에서 3의 배수의 총합과 3의 배수의 갯수를 구해서 출력하기
		
//		int count=0;
//		int sum = 0;
//		
//		for(int i=1; i<=100; i++) {
//			if(i%3==0) {
//				count++;
//				sum=sum+i;
//			}
//		}	System.out.println("3의 배수의 갯수 : "+count);
//			System.out.println("3의 배수의 총합 : " +sum);
						
	/************************************중첩문**********************************/
		
//		for( int i =1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				System.out.println("i 값 : "+ i + ", j 값 : " + j);
//			}
//		}
		//----------------------------------------------------------
		//161p 3.
//		while(true) {
//		int num1 =(int)(Math.random()*6)+1;
//		int num2 =(int)(Math.random()*6)+1;
//
//			System.out.println("(" + num1 + "," + num2+")");
//			
//			if(num1+num2==5) {
//				System.out.println("눈1 + 눈2 = 5");
//				break;
//				
//			}
//		}
		//161p 4.
//		for(int x=1; x<=10; x++) {
//			for(int y=1; y<=10; y++) {
//				if(4*x+5*y==60) {
//					System.out.println("x= "+x +" , "+"y= "+ y);
//					//break; 안써도 됨
//				}				
//			}			
//		}
		//161p5.----5줄 필요하고,
			//*		첫번째줄 i:1 별도 1번출력
			//**	두번째줄 i:2 별도 2번
			//***	...			...
			//****	...			...
//		for(int i =1; i<5; i++) {
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	//6번문제----------------------------------------------------------------------------
		//   *	첫번째줄 i:1  공백3,	별도 1번출력
		//  **	두번째줄 i:2 	공백2,   별도 2번
		// ***	...			...		
		//****	...			...
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=5; j>=1; j--)
//			{
//				if(j<=i)
//				{
//					System.out.print("*");			//for문 2개버전
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		//----------------------------------------------------------------------------
//	for(int i =1; i<5; i++) 
//	{
//		for(int j=1; j<=4-i; j++) 
//		{
//			System.out.print(" ");					//for문 3개버전
//		}
//		for(int k=1; k<=i; k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
//-----------------------------------------------------------------------------
	
//		boolean run = true;
//	 int balance = 0;
//	 Scanner scan = new Scanner(System.in);
//	 
//	 while(run) {
//		 System.out.println("-------------------------");
//		 System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//		 System.out.println("-------------------------");
//		 System.out.println("선택>");
//		 
//		 int menu = scan.nextInt();
//		 int input;
//		 switch(menu)
//		 {
//		 case 1: //예금
//			 System.out.println("예금액>");
//			 input= scan.nextInt();
//			 balance = balance + input; //balance+=input;
//			 break;
//		 case 2: //출금
//			 System.out.println("출금액>");
//			 input= scan.nextInt();
//			 balance -= input;
//			 break;
//		 case 3: //잔고
//			 System.out.println("잔고>" + balance);
//			 break;
//		 case 4: //종료
//			 run=false;
//			 break;
//		 }
//	 }
//	 System.out.println("프로그램 종료");
	
//----------------------------------------------------------------------------------
			/*1. 1+
			 *  (1+2)+
			 *  (1+2+3)+...+
			 *  (1+2+3+...+10) 결과계산
			 *2. 1+(-2)+3+(-4)+.....과 같은 식으로 계속 더해나깟을 때 몇까지 더해야 총합이 100이상인지 찾으시오
			 *3.*****
			 *	****
			 *	***
			 *	**
			 *	*
			 *4. *****
			 *	  ****
			 *	   ***
			 *      **
			 *       *   
			 */
		
    // j : 1 + (1+2) + (1+ 2+ 3)
	// j : 1 2 3 4
	//....
	// j : 1 2 3 + ... + 10
	//1.번
//		int sum = 0;
//		int i = 1;
//		for ( i =1; i<=10; i++)
//		{						// i: 1~10 까지 10줄							
//			for(int j = 1; j<=i; j++) {
//				sum+=j;
////				System.out.print(j);
//				//System.out.println(sum+j);
//			}
//			System.out.println("총합 : "+ sum);
//		}
	//2번----------------------------------------------------------------------------
//		int sum = 0;
//		int i=1;
//		int count=0;
//		
//		while(true)
//		{	//i++ 를 여기에 쓸거면 int i 값을 0으로 설정
//			if(i%2 == 0)
//			{
//				 sum= sum-i;
//			}
//			else
//			{
//				sum = sum+i;
//			}
//			if(sum >=100) {
//				break;
//			}
//			i++;
//		}
//		System.out.println("총합 : "+sum);
//		System.out.println("마지막 계산 값 : "+ i);
		
	//3.번-------------------------------------------------------------------------
		for(int i =5; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//	4.번-------------------------------------------------------------------------
		for(int i =5; i>=1; i--) {		//띄어쓰기 0 1 2  3   4
										// i	5 4 3  2   1
						 				// k    0 4 43 432
			for(int k=5; k>i; k--) {
				System.out.print(" ");
			}  					
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		}
	}

