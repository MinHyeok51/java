package study009;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(1, "이민혁");
		stu1.printInfo();
		System.out.println();
		Student stu2 = new Student(2, "이혁");
		Student stu3 = new Student(3 ,"이민", "컴");
		stu3.printInfo();
		
		System.out.println();
		stu1.printInfo();
		stu1.diet(10);
		stu1.bulkUp(20);
		
		double result2 = stu1.getAfterDiet(30,true);
		System.out.println("변화후 몸무게: " + result2);
		
		double result3 = stu1.getAfterDiet(15,false);
		System.out.println("변화후 몸무게: " + result3);
		
	}
	

}
