package com.humanedu.main;

import java.util.Scanner;

public class study004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 //조건문
		/* Q
		int num1 = 30;
		int num2 = 30;
		boolean result1 = (num1 <=num2);
		boolean result2 = (num1 !=num2);
		boolean result3 = (num1 > num2);
		 System.out.println("result1=" + result1);
		 System.out.println("result2=" + result2);
		 System.out.println("result3=" + result3);
		 
		 int score = 80;
		 char grade = (score > 90) ? 'A' : ((score >=80) ? 'B' : 'C');
		 System.out.println(score + "점은 \"" + grade + "\"등급입니다.");
		 
		int result=5;
		result += 9;
		System.out.println("result=" + result++);
		result -=3;
		System.out.println("result=" + result);
		result *=2;
		System.out.println("result=" + ++result);
		result /=5;
		System.out.println("result=" + result);
		result %=3;
		System.out.println("result=" + result);
		*/
		/*
		int x=1;
		System.out.println("result=" + x++);
		System.out.println("result=" + x++);
		System.out.println("result=" + x++);
		System.out.println("result=" + x++);
		System.out.println("result=" + x++);
		System.out.println("result=" + x++);
		System.out.println("result=" + x++);
		System.out.println("result=" + x++);
		*/
//		int score =60;
		
//		if(score>=90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A 입니다.");
//		}
//		if(score<90) {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B 입니다.");
//			}
	//-------------------------------------------------------
//		if(score>=90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A 입니다.");
//		}
//		else {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B 입니다.");}
	//--------------------------------------------------==-----
//		if(score>=90) {
//			System.out.println("점수가 100~90보다 입니다.");
//			System.out.println("등급은 A 입니다.");
//		}
//		else if(score>=80){
//			System.out.println("점수가 80~89보다 입니다.");
//			System.out.println("등급은 B 입니다.");
//			}
//		else if(score>=70) {
//			System.out.println("점수가 70~79 입니다.");
//			System.out.println("등급은 C 입니다.");
//		} else {
//			System.out.println("점수가 70 미만 입니다.");
//			System.out.println("등급은 D 입니다.");
//		}
		//-------------------------------------------------------------
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int num = (int)(Math.random()*6)+1;  //로또번호 추첨기
//		num =scan.nextInt();
//		if(num==1) {
//			System.out.println("1번이 나왔습니다.");
//			} else if(num==2) {
//				System.out.println("2번이 나왔습니다.");
//			} else if (num==3){
//				System.out.println("3번이 나왔습니다.");
//			} else if (num==4) {
//				System.out.println("4번이 나왔습니다.");
//			} else if(num==5) {
//				System.out.println("5번이 나왔습니다.");
//			} else {
//				System.out.println("6번이 나왔습니다.");
//			}
//		System.out.println(num); ///
		//------------------------------------------------------------------------
//		switch(num) {
//		case 1: //num ==1
//			System.out.println("1번이 나왔습니다.");
//			break;
//		case 2: //num==2
//			System.out.println("2번이 나왔습니다.");
//			break;
//		case 3:
//			System.out.println("3번이 나왔습니다.");
//			break;
//		case 4:	
//			System.out.println("4번이 나왔습니다.");
//			break;
//		case 5:
//			System.out.println("5번이 나왔습니다.");
//			break;
//		default:
//			System.out.println("6번이 나왔습니다.");
//		}
		/*
		int time = (int) (Math.random()*3)+8;
		System.out.println("[현재 시각: "+ time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		*/ //^^^^if문으로 바꾸기   
//		int time = (int) (Math.random()*4)+8;
//		System.out.println("[현재 시각: "+ time + " 시]");
//		
//		if(time<=8) {
//			System.out.println("출근합니다.");
//		}if (time<=9) {
//			System.out.println("회의를 합니다.");
//		}if(time<=10) {
//			System.out.println("업무를 봅니다."); 
//		}if(time<=11) {
//			System.out.println("외근을 나갑니다.");
//		}
		//------------------------------------------------
//		char grade ='c';
//		
//		switch(grade) {
//		case 'A':
//		case 'a':
//			System.out.println("우수 회원입니다.");
//			break;
//		case 'B':
//		case 'b':
//			System.out.println("일반 회원입니다.");
//			break;
//		default:
//			System.out.println("손님입니다.");
//		}
//		// =====================or연산자 A or B 둘중에 하나만 참이면 참 = ||
//		if(grade =='A' || grade =='a') {
//			System.out.println("우수 회원입니다.");
//		} else if (grade =='B' || grade =='b') {
//			System.out.println("일반 회원입니다.");
//		}
		//-------------------------------------------------------------------
	}
}
