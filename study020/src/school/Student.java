package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	ArrayList<String> sname;
	ArrayList<Integer> english;
	ArrayList<Integer> korean;
	ArrayList<Integer> math;

	public Student() {
		sname = new ArrayList<>();
		english = new ArrayList<>();
		korean = new ArrayList<>();
		math = new ArrayList<>();
	}

	public void inputData() {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("학생 이름을 입력하시오.");
		String name =s.nextLine();
		while(!name.equals("")) {
			this.sname.add(name);
			System.out.println("국어점수를 입력하시오.");
			int score = s1.nextInt();
			this.korean.add(score);
			System.out.println("영어점수를 입력하시오.");
			score = s1.nextInt();
			this.english.add(score);
			System.out.println("수학점수를 입력하시오.");
			score = s1.nextInt();
			this.math.add(score);
			
			System.out.println("학생 이름을 입력하시오.");
			name =s.nextLine();
			if(name.equals("")) {
				break;
			}
		}
		s.close();
		s1.close();
		showAll();
	}

	public void showAll() {
		int korTotal=0;
		int engTotal=0;
		int mathTotal=0;
		for(int i=0; i<sname.size(); i++) {
			System.out.println(i+"번 "+"이름: "+sname.get(i)+", 국어 "+korean.get(i)+"점, " + 
					"영어 "+ english.get(i)+"점, "+"수학 "+math.get(i)+"점");
			korTotal += korean.get(i);
			engTotal += english.get(i);
			mathTotal += math.get(i);
		}
		double korAvg =(double)korTotal/sname.size();
		double engAvg = (double)engTotal/sname.size();
		double mathAvg = (double)mathTotal/sname.size();
		System.out.println("국어총합: " + korTotal + " 영어총합: "+engTotal +" 수학총합: "+mathTotal);
		System.out.printf("국어평균: %.2f 영어평균: %.2f 수학평균: %.2f %n",korAvg,engAvg,mathAvg);
		System.out.println("전체 학생 수: "+sname.size()+"명");
	}
	
	
	
}
