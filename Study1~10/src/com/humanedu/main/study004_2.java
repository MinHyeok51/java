package com.humanedu.main;

import java.util.Scanner;

public class study004_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 */ //선생님 해설
//		1.정수를 입력받고 홀수면 "ood"를 출력, 짝수면 "even"을 출력하기.
//		Scanner scan= new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int num= scan.nextInt();
//		if(num%2 ==0 ) {
//					System.out.println("even");
//				}else {
//					System.out.println("odd");
//				}
//		2.정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다."출력
//		3.1~1000까지의 수 중에서 5의 배수의 합을 출력하기.
//		int sum =0;
//		for (int i=1; i<=1000 ; i++)
//		{ 
//			if(i%5 ==0)
//				sum=sum+i;
//		}
//		System.out.println(sum);
		
//		4. 1~50까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		Scanner scan= new Scanner(System.in);
//		int input = scan.nextInt();
//		int i;
//		for(i =1; i<=input; i++) {
//			System.out.print("*");
//		}
//	
//	5. 1 ~10 까지의 수에서 홀수면 더하기 (+), 짝수면 빼기 (-)를 수행해서 최종 결과 출력.
//		int sum=0;
//		for (int i=1; i<=10; i++) {
//			if(i%2==0) {
//				sum = sum -i;
//			} else {//if(i%2 !=0
//				sum= sum+i;
//			}
//		}System.out.println(sum);
		
//	6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고 1000이 넘어가면 멈춘다. 
//	  멈추는 시점까지 누적으로 더해진 값을 출력하기.
//		int sum = 0;
//		int i =1;
//		while (true) {
//			
//			sum = sum+i;
//			i++;
//			if(sum>1000) { //if문이 sum 앞으로 가면 의미가 조금 달라짐 결과는 같다.
//				break;
//			}
//		 }System.out.println("누적더한 값은 : "+sum);
		
//	7. 구구단을 출력하기. (1~9)	 
				//2단부터 9단까
//		 
//		for(int i=2; i<=9; i++) {
//			System.out.println(i+" 단");
//			for(int j=1; j<=9; j++) {
//			System.out.println(i + " * "+ j + " = " +(i*j));
//			}
//		}	 
	//2~9 사이의 수 2개를 입력받아서 그 사이 구구단 출력
	//ex ) 3 ,7  -->3단 4단 ... 7단
//		Scanner scan=new Scanner(System.in);
//		System.out.println("2개의 수를 입력");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		for (int i=num1; i<=num2; i++) {
//			System.out.println(i+" 단");
//			for(int j =1; j<=9; j++) {
//				System.out.println( i +"*"+ j +" = " + (i*j));
//			}
//			
//		}
//	-------------------------------------------------------------------
		
		
	}

}
