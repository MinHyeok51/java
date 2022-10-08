package study009;

public class Student {
	//필드 : 이 객체의 속성(키, 나이 ,이름 등등)
	int studentNum;	//학생번호(필수)
	String name;	//이름(필수)
	String major;	//전공
	double tall;	//키 
	double weight;	//몸무게
	int age;		//나이
	String dept;	//학부
	
	//생성자 : Student객체가 만들어질때 초기화
	Student(int studentNum, String name){ //매개변수가 없는 생성자
//		this(); ---> main쪽에서 보면 new Student(); 매개변수가 없는것을 부르는 느낌
		this(studentNum, name, "없음" , 175, 70,20,"미정");
	}
	
	Student(int studentNum, String name, String major){
		this.studentNum = studentNum;
		this.name=name;
		this.major=major;
	}
	
	Student(int studentNum,String name,String major,double tall,double weight,int age,String dept){
		this.studentNum=studentNum;
		this.name=name;
		this.major=major;
		this.tall=tall;
		this.weight=weight;
		
		if(age<20 || age> 50) {
			age =999;
		}else {
			this.age=age;
		}
		this.age=age;
		this.dept=dept;
	}
	
	//메소드 : 기능(동작)을 수행시키는 코드가 정의 되어 있는 것
	public void printInfo() {
		System.out.println("학생번호 : " + studentNum);
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("키 : " + tall);
		System.out.println("몸무게 : " + weight);
		System.out.println("나이 : " + age);
		System.out.println("학부 : " + dept);
	}
	public void printInfo(boolean includePersonalinfo) {
		if(includePersonalinfo) {
	
		System.out.println("학생번호 : " + studentNum);
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("키 : " + tall);
		System.out.println("몸무게 : " + weight);
		System.out.println("나이 : " + age);
		System.out.println("학부 : " + dept);
		}else {
			System.out.println("학생번호 : " + studentNum);
			System.out.println("이름 : " + name);
			System.out.println("전공 : " + major);
		}
	}
	
	public double getAfterDiet(double changeWeight, boolean isUp) {
		if(isUp) {
			this.weight =this.weight + changeWeight;
		}else {
			this.weight =this.weight - changeWeight;
		}
		return this.weight;
	}
	
	public void diet(double changeWeight) {
		this.weight = this.weight -changeWeight;
		System.out.println("다이어트 후 몸무게: "+ this.weight);
	}
	public void bulkUp(double changeWeight) {
		this.weight = this.weight +changeWeight;
		System.out.println("벌크업 후 몸무게: "+ this.weight);
	}

}
