package com.humanedu.main;

import java.util.Scanner;

public class study003ㅡ1 {

	public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
//		int x= 10;
//		int y=4;
//		boolean result = (x+y)<5;
//		System.out.println(result);
		
		/**
		int x =10;
		int y =10;
		int z;
		
		System.out.println("==========================");
		x++; //10
			// ->11
		++x;	//12
		System.out.println("x="+ x); //12
		System.out.println("========================");
		y--; //10
			// -> 9
		--y;	//8
		System.out.println("y="+y);	///8
		System.out.println("========================");
		
				// x=12 y=8
		z=x++;	//z=12
				//x=13
		System.out.println("z="+z);	//12
		System.out.println("x="+x);	//13
		
		System.out.println("========================");
		z=++x;	//14
		System.out.println("z="+z);	//14
		System.out.println("x="+x);	//14
				//x=14 y=8 z=14
		System.out.println("======================");
		z=++x +y++;		//z= 15+8 =23
							//y=9
		System.out.println("z=" +z);
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		*/
		
//		int num1 = 10;
//		int num2 = 10;
//		boolean result1 = (num1==num2);
//		boolean result2 = (num1 != num2);
//		boolean result3 = (num1<= num2);
//		System.out.println("result1=" + result1);
//		System.out.println("result2=" + result2);
//		System.out.println("result3=" + result3);
//		
//		char char1 = 'A';
//		char char2 = 'B';
//		boolean result4 = (char1<char2);
//		System.out.println("result4= "+result4);
		
//		int score = 99;
//		char grade = (score > 90) ? 'A' : ((score>80) ? 'B' : 'c');
//		System.out.println(score + "점은 " + grade + "등급입니다.");
		
//		int score = 80;
//		char grade = (score>80 ? 'B' : 'c');
//		System.out.println(score + "점은 " + grade + "등급입니다.");
				
		//조건식  (식 참or거직) ? 참 부분 : 거짓 부분;
		//(조건식)? A:B
		
		
		//3개의 정수를 입력받아서, 3개 중에 가장 작은 수를 출력해주세요.
		//Scanner
		//Interger.parseInt
		//() ? 참 : 거짓 ;
	
		Scanner scan = new Scanner(System.in);
		
		String str1;
		String str2;
		String str3;
		
		System.out.println("3개의 번호를 입력하시오.");
		str1=scan.nextLine();
		str2=scan.nextLine();
		str3=scan.nextLine();
		
		int result1 = Integer.parseInt(str1);
		int result2 = Integer.parseInt(str2);
		int result3 = Integer.parseInt(str3);
		
		System.out.println(result1+ " "+result2+" "+result3);
		
		System.out.println("3개의 번호중 가장 작은 수는?");
		
		int min;
		min = (result1>result2) ? ((result2>result3) ? result3 : result2) : ((result1>result3) ? result3 : result1) ;
		//1 2 3 
		// 1 2 -> 1 3 -> 1
		// 2 3 -> 2 1 -> 1
		System.out.println(min);
		/*
		int min;
		min = (result1>result2) ? result2 : result1 ; 
		min = (result3>min) ? min : result3 ;
		System.out.println(min);
		*/
		
//		String st1;
//		String st2;
//		String st3;
//		
//		System.out.println("3개의 번호를 입력하시오.");
//		st1=scan.nextInt();
//		st2=scan.nextInt();
//		st3=scan.nextInt();
		}

}
