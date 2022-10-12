package study010;

public class CalculatorExample {
	int minus(int num1, int num2) {
		return num1 - num2;				//이렇게도 된다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//static 정적멤버는 객체를 만들지 않고(new +클래스) 바로 사용가능
		CalculatorExample test = new CalculatorExample();
		System.out.println(test.minus(20, 5));
		
		double result1 = 10* 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		System.out.println("result3 : "+ result3);
		
	}

}
