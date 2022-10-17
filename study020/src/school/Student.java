package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
//	ArrayList<String> sname;
//	ArrayList<Integer> english;
//	ArrayList<Integer> korean;
//	ArrayList<Integer> math;
//
//	public Student() {
//		sname = new ArrayList<>();
//		english = new ArrayList<>();
//		korean = new ArrayList<>();
//		math = new ArrayList<>();
//	}
//
//	public void inputData() {
//		Scanner s = new Scanner(System.in);
//		Scanner s1 = new Scanner(System.in);
//		
//		System.out.println("학생 이름을 입력하시오.");
//		String name =s.nextLine();
//		while(!name.equals("")) {
//			this.sname.add(name);
//			System.out.println("국어점수를 입력하시오.");
//			int score = s1.nextInt();
//			this.korean.add(score);
//			System.out.println("영어점수를 입력하시오.");
//			score = s1.nextInt();
//			this.english.add(score);
//			System.out.println("수학점수를 입력하시오.");
//			score = s1.nextInt();
//			this.math.add(score);
//			
//			System.out.println("학생 이름을 입력하시오.");
//			name =s.nextLine();
//			if(name.equals("")) {
//				break;
//			}
//		}
//		s.close();
//		s1.close();
//		showAll();
//	}
//
//	public void showAll() {
//		int korTotal=0;
//		int engTotal=0;
//		int mathTotal=0;
//		for(int i=0; i<sname.size(); i++) {
//			System.out.println(i+"번 "+"이름: "+sname.get(i)+", 국어 "+korean.get(i)+"점, " + 
//					"영어 "+ english.get(i)+"점, "+"수학 "+math.get(i)+"점");
//			korTotal += korean.get(i);
//			engTotal += english.get(i);
//			mathTotal += math.get(i);
//		}
//		double korAvg =(double)korTotal/sname.size();
//		double engAvg = (double)engTotal/sname.size();
//		double mathAvg = (double)mathTotal/sname.size();
//		System.out.println("국어총합: " + korTotal + " 영어총합: "+engTotal +" 수학총합: "+mathTotal);
//		System.out.printf("국어평균: %.2f 영어평균: %.2f 수학평균: %.2f %n",korAvg,engAvg,mathAvg);
//		System.out.println("전체 학생 수: "+sname.size()+"명");
//	}
	
	//--------------------------------선생님해설
		private ArrayList<String> sname;
		private ArrayList<Integer> english;
		private ArrayList<Integer> korean;
		private ArrayList<Integer> math;
		private Scanner sText;
		private Scanner sNumber;
		private int sum_korean, sum_english, sum_math;
		private int avg_korean, avg_english, avg_math;
		
		public Student() {
			this.sname=new ArrayList<String>();
			this.english=new ArrayList<Integer>();
			this.korean=new ArrayList<Integer>();
			this.math=new ArrayList<Integer>();
			this.sText=new Scanner(System.in);
			this.sNumber=new Scanner(System.in);
			this.sum_korean=this.sum_english=this.sum_math=0;
			this.avg_korean=this.avg_english=this.avg_math=0;
		}
		public void getScore() {
			String name=this.getName();
			while(!name.equals("")) {
				this.sname.add(name);
				this.readScore();
				name=this.getName();
			}
		}
		private String getName() {
			System.out.print("학생이름을 입력하시오: ");
			return this.sText.nextLine();
		}
		private void readScore() {
			System.out.print("국어점수를 입력하시오: ");
			int korean=this.sNumber.nextInt();
			System.out.print("영어점수를 입력하시오: ");
			int english=this.sNumber.nextInt();
			System.out.print("수학점수를 입력하시오: ");
			int math=this.sNumber.nextInt();
			
			this.korean.add(korean);
			this.english.add(english);
			this.math.add(math);
		}
		public void showScore() {
			for(int i=0; i<this.sname.size(); i++) {
				System.out.println("이름: "+this.sname.get(i)+
					", 국어: "+this.korean.get(i)+ // 0
					", 영어: "+this.english.get(i)+  // 1
					", 수학: "+this.math.get(i));		// 2
				this.sum_korean+=this.korean.get(i);
				this.sum_english+=this.english.get(i);
				this.sum_math+=this.math.get(i);
			}
			this.avg_korean=this.sum_korean/this.sname.size();
			this.avg_english=this.sum_english/this.sname.size();
			this.avg_math=this.sum_math/this.sname.size();
		}
		public void showStatistic() {
			System.out.println("점수합계: 국어="+this.sum_korean
					+", 영어="+this.sum_english
					+", 수학="+this.sum_math);
			System.out.println("점수평균: 국어="+this.avg_korean
					+", 영어="+this.avg_english
					+", 수학="+this.avg_math);
			System.out.println("전체학생수: "+this.sname.size()+"명");
			this.sText.close();
			this.sNumber.close();
		}
	
}
