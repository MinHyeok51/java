package com.humanedu.main;

import java.util.Scanner;

public class study003 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//	Scanner scanner = new Scanner(System.in);
//	String inputData;
//	inputData = scanner.nextLine(); //입력을 받는 부분
//	System.out.println("입력된 문자열: \""+ inputData + "\"");
//	
//	
//	System.out.println("종료");
		
		//입력받기
		//1.이름, 2.종아하는 3자리 숫자, 3.학원까지 걸리는 분
		//입력받아서 출력하기
		Scanner scan = new Scanner(System.in);
		
//		String name; //변수 선언
//		System.out.println("[입력된 부분]");
//		System.out.print("1. 이름을 입력하세요 : ");
//		name = scan.nextLine();//입력받는 부분
//		System.out.println("----------------");
//		System.out.println("[입력된 부분 출력]");
//		System.out.println("이름 : "+name);
//		
//		System.out.println();
//		
//		System.out.println("[입력된 부분]");
//		System.out.print("2. 좋아하는 3자리 숫자 : ");
//		name = scan.nextLine();
//		System.out.println("----------------");
//		System.out.println("[입력된 부분 출력]");
//		System.out.println("좋아하는 숫자 : "+name);
//		
//		System.out.println();
//		
//		System.out.println("[입력된 부분]");
//		System.out.print("3. 학원까지 걸리는 시간(분) : ");
//		name = scan.nextLine();
//		System.out.println("----------------");
//		System.out.println("[입력된 부분 출력]");
//		System.out.println("시간 : "+name);
		
//		String name;
//		String number;
//		String time;
//		
//		System.out.println("[입력된 부분]");
//		System.out.print("1. 이름을 입력하세요 : ");
//		name = scan.nextLine();//입력받는 부분
//		
//		System.out.print("2. 좋아하는 3자리 숫자 : ");
//		number = scan.nextLine();
//		
//		System.out.print("3. 학원까지 걸리는 시간(분) : ");
//		time = scan.nextLine();
//		
//		System.out.println();
//		System.out.println("----------------");
//		System.out.println();
//		
//		System.out.println("[출력된 부분]");
//		System.out.println("이름 : "+name);
//		System.out.println("좋아하는 숫자 : "+number);
//		System.out.println("시간 : "+time);   
		
		//정수 2개를 입력받아서 두 개를 더한 후 출력
		//Scanner 입력받아
		//String 2개를 입력
		//숫자 형태로 변환 > 덧셈하고 출력
	
		String n1 ;
		String n2 ;
		
		
		System.out.print("정수1 : ");
		n1 = scan.nextLine();
		System.out.print("정수2 : ");
		n2 = scan.nextLine();
		
		
		
		int result = Integer.parseInt(n1) + Integer.parseInt(n2);
		
		
		
		System.out.print("총 합 : ");
		System.out.println(result);
		
		
//		int a= 10;
//		int b= 10;
//		int c= 20;
		
//		boolean result = (a == b);
//		System.out.println(result);
//		result = (a==c);
//		System.out.println(result);
		
//		String s1 ="java";
//		String s2= "Java";
//		String s3="java";
//		
//		boolean result = (s1 ==s2);
//		System.out.println(result);
//		
//		result = (s1 ==s3);
//		System.out.println(result);
//		
//		result = s1.equals(s2);
//		System.out.println(result);
//		
//		result = s1.equals(s3);
//		System.out.println(result);
		
	}

}
