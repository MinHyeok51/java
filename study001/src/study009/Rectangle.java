package study009;

public class Rectangle {
	int width;
	int height;
	/*생성자 vs 메소드
	 * 공통점 : 매개변수가 있/없, 실행범위 {}
	 * 차이점 : 생성자(new 객체 생성할 때)
	 * 			메소드(객체 생성이후, 객체.메소드)
	 * 			(메소드)return type을 정할수 있느냐, 메소드명을 정할 수 있느냐.
	 */
	
	//생성자 매개변수가 int 타입 2개
	 Rectangle(int width, int height){
		this.width = width;
		this.height=height;
	}
	
	double getArea() {
		double result = width * height;
		return result;
	}
}
