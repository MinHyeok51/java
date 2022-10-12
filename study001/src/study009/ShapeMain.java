package study009;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Circle circle = new Circle();
			circle.setRadius(5);
			System.out.println("넓이 : "+ circle.getArea());
			//원의 넓이 : 반지름 * 반지름 * 3.14 (pi)
			//Math.PI  -->에 파이에 해당하는 값 저장돼있음
			
			Rectangle rec = new Rectangle(10,5); //width, height
			System.out.println("넓이 : " + rec.getArea());
			//밑변 * 높이
			
			Triangle tri = new Triangle();
			tri.setSize(6,8); //width 와 height를 저장
			System.out.println("넓이 : " + tri.getArea());
//			//밑변 * 높이 /2
	}

}
