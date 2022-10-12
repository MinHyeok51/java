package com.humanedu.main;

import java.util.Scanner;

public class study006_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
//		for(int i=1; i<=3; i++)
//		{
//			for(int j=1; j<=3; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//2
//		for(int i=3; i>=1; i--)
//		{
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//3
//		for(int i =1; i<=3; i++){
//			for(int j=1; j<=i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		//4
//		for(int i =11; i<=20; i++)
//		{
//			if(i%2 == 0 && i%3 ==0)
//				System.out.println(i);
//			else if(i%4==0)
//				System.out.println(i);
//			//if-else if 는 세트
//			if(i%5 ==0)
//				System.out.println(i);
//			}
		
		//-------------------------------------------참조타입과 참조 변수
		
//		String strVar1 = "신민철";
//		String strVar2 = "신민철";
//		
//		if(strVar1 == strVar2) {
//			System.out.println("strVar1과 strVar2는 참조가 같음");
//		}else {
//			System.out.println("strVar1과 strVar2는 참조가 다름");
//		}
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("strVar1과 strVar2는 문자열이 같음");
//		}
//		
//		String strVar3=  new String("신민철");
//		String strVar4=  new String("신민철");
//		
//		if(strVar3 ==strVar4) {
//			System.out.println("strVar3과 strVar4는 참조가 같음");
//		}else {
//			System.out.println("strVar3과 strVar4는 참조가 다름");
//		}
//		if(strVar3.equals(strVar4)) {
//			System.out.println("strVar3과 strVar4는 문자열이 같음");
//		}

// ---------------------------------------배열----------------------------------------
//		int[] scores= {50, 60, 70, 80, 90}; 
		//5개
		//index 0~4		scores[2] ==70		scores[5] -->Error
//		int [] intArray= null;
		
//		int[] abc;
//		abc = new int[] {1,2,3,4,5,6,7};
		
//		String[] names = null;
//		names = new String[] {"가","나","다","라"};
		
//		String[] names =null;
//		names = new String[4];
//		names[0] = "가";
//		names[1] = "나";
//-------------------------------------------------------------------------------
		
		/*
		 int [] scores = { 83, 90, 87} ;
 
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum =0;
		for(int i =0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+ sum);
		double avg= (double) sum/3;
		System.out.println("평균 : "+ avg);
		
		*/
		/*
		int[] arr1 = new int [3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0]= 10;
		arr1[1]= 20;
		arr1[2]= 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 =new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
			
		}
		arr2[0] = 0.1;
		arr2[1]=0.2;
		arr2[2] = 0.3;
		for(int i =0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] ="1월";
		arr3[1]= "2월";
		arr3[2]= "3월";
		for(int i =0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		*/
		
//		 int [] scores = { 83, 90, 87, 20 , 56,0,0,0} ;
//		 
//		 int sum=0;
//		 for(int i =0; i<scores.length; i++) {
//			 sum += scores[i];
//		 }
//		 System.out.println("총합 : " + sum);
//		 
//		 double avg = (double) sum / scores.length;
//		 System.out.println("평균 : " + avg);
		
//---------------------------------------------------------------------------------------
		
//		int[][] mathScores = new int[2][3]; //2행 3열
//		for(int i =0; i<mathScores.length; i++) {//[0] 3칸 , [1] 3칸
//			for(int k=0; k<mathScores[i].length; k++) {
//				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
//			}
//		}
//		System.out.println();
//		
//		int[][] englishScores = new int[2][];
//		englishScores[0]= new int[2];
//		englishScores[1]= new int[3];
//		for(int i =0; i<englishScores.length; i++) {
//			for(int k=0; k<englishScores[i].length; k++) {
//				System.out.println("englishScores["+i+"]["+k+"]="+ englishScores[i][k]);
//			}
//		}
//		System.out.println();
////			열
////		행	95	80
////			92	96	80
//		int[][] javaScores= {{95,80},{92,96,80}};
//		for(int i =0; i<javaScores.length; i++) {
//			for(int k=0; k<javaScores.length; k++) {
//				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
//			}
//		}
//----------------------------------------------------------------------		
//		int[] oldIntArray= {1,2,3} ; //3칸 1 , 2 ,4
//		int[] newIntArray= new int[5];
//		
//		for(int i =0; i<oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
//		for(int i=0; i<newIntArray.length; i++) {
//			System.out.print(newIntArray[i]+ ",");
//			
//		}

//		----------------------------------------------------
		
//		String[] oldStrArray = {"java", "array", "copy"};
//		String[] newStrArray = new String[5];
//		
//		System.arraycopy(oldStrArray, 0, newStrArray, 2,oldStrArray.length);
//		
//		for(int i=0; i<newStrArray.length; i++) {
//			System.out.print(newStrArray[i]+ ",");
//		}
   //		------------------------------------------------------------------
		
//		int[] scores = { 95, 71, 84, 93, 87, 654 , 32};
//		
//		int sum= 0;
//		for (int score : scores) {
//			sum = sum + score;
//		}
//		System.out.println("점수 총합 = " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("점수 평균 = "+ avg);
//-------------------------------------------------------------------------------
			/*	
		 			배열문제
		 			
			  1.
			  +자연수 (정수) 5개의 수를 차례대로 입력 받는다.
			  몇번째 수인가요? : 그에 해당하는 수를 출력
			  ex)10 20 30 40 50
			  몇번째 수인가요? 5
			  결과 : 50
			 */ 
		
//		Scanner scan = new Scanner(System.in);
//		int[] nums = new int[5];
//		System.out.println(" 5개의 수를 입력하시오. ");		
//				
//		for(int i=0; i<5; i++) {
//			nums[i] = scan.nextInt();
//		}
//		System.out.println("몇번째 수인가요? : ");
//		
//		int index = scan.nextInt();
//		
//		System.out.print("결과 : " + nums[index-1]);
		/*
			  2.
			  +자연수 (정수) 5개의 수를 차례대로 입력 받는다.
			  받은후에 순서를 거꾸로 출력하세요
			  ex) 1 2 3 4 5
			  결과:5 4 3 2 1
		*/
		
//		Scanner scan = new Scanner(System.in);
//		int[] nums = new int[5];
//		System.out.println(" 5개의 수를 입력하시오. ");		
//				
//		for(int i=0; i<5; i++) {
//			nums[i] = scan.nextInt();
//		}		
//		for (int i=4; i>=0; i--) {
//			System.out.print(nums[i]+ " ");
//		}
		
//		      ^^^^ System.out.print("결과 : " + nums[4] +" "+nums[3]+" "+nums[2]+" "+nums[1]+" "+nums[0]);  
		/*
			  3. 
			  4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오
			  1	2	3	4
			  5	6	7	8
			  9	10	11	12
			 13 14	15	16
			*/
		
//		int[][] array = new int[4][4];
//		int num = 1;
//		
//		
//		for( int i =0; i<4; i++) { //2차원 배열 순서대로 돌면서 값 저장
//			for (int j=0; j<4; j++) {
//				array[i][j] = num;
//				num = num+1;
//			}
//		}
//		for( int i =0; i<4; i++) { //2차원 배열 순서대로 돌면서 값을 가져와 출력
//			for (int j=0; j<4; j++) {
////				System.out.print(array[i][j] + " ");
//				System.out.printf("%3d", array[i][j]);
//							}
//			System.out.println();
//		}
		
		/*1 5	9	13
		 *2	6	10	14
		 *3	7	11	15
		 *5	8	12	16
		 */
//		int[][] array = new int[4][4];
//		int num = 1;
//		
//		for( int i =0; i<4; i++) { //2차원 배열 순서대로 돌면서 값 저장
////			num = i +1; 1번케이스
//			for (int j=0; j<4; j++) {
//				/*
//				array[i][j] = num;			1번케이스
//				num = num+4;
//				*/
//				
//				/*
//				num = (i+1) + (j*4);		2번케이스
//				array[i][j] = num;			
//				*/
//				
//				array[j][i] = num;			
//				num = num+1;
//			}
//		}
//		for( int i =0; i<4; i++) { //2차원 배열 순서대로 돌면서 값을 가져와 출력
//			for (int j=0; j<4; j++) {
////				System.out.print(array[i][j] + " ");
//				System.out.printf("%3d", array[i][j]);
//							}
//			System.out.println();
//		}
		
		/*			0열	1열	2열	3열	4열	
		 * 			ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ
		 * 	0 행|	1	0	0	0	0
		 *  1 행|	0	1	0	0	0
		 *  2 행|	0	0	1	0	0
		 *  3 행|	0	0	0	1	0
		 *  4 행|	0	0	0	0	1
		 */
		
//		int [][] array= new int [5][5];
//		int num =1;
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(i==j) {
//					array[i][j]=num;
//				}
//			}
//		}
//		for (int i= 0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.printf("%3d", array[i][j]);
//			}
//			System.out.println();
//		}
		//-----------------반대로------------------------------------------------
//		int [][] array= new int [5][5];
//		int num =1;
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(i!=j) {
//					array[i][j]=num;
//				}
//			}
//		}
//		for (int i= 0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.printf("%3d", array[i][j]);
//			}
//			System.out.println();
//		}
		
		/* 전체 선택 ctrl + a
		 *  + ctrl +i 들여쓰기 정돈
		 */
	}

}
