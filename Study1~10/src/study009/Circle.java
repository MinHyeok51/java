package study009;

public class Circle {
	int radius;	//반지름을 저장하기 위한 변수
	double getArea;
	
	void setRadius(int input) {
		radius = input;
		
	}
	
	double getArea(/*매개변수자리*/) {
		double result =radius * radius * Math.PI;
		return result;
	}
}
