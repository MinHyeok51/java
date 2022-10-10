package moning;

public class ObjectGrouping {
	public static void main(String[] args) {
		// 다양한 객체 생성
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();

		// 인터페이스 타입으로 그룹화
		Flyable[] flyableThings = { bird, copter, rocket };

		// 모든 날것들을 날림
		for (int i = 0; i < flyableThings.length; i++) {
			Flyable temp = flyableThings[i];
			temp.fly();
			if(temp instanceof Rocket) {
				Rocket rk = (Rocket)temp;
				rk.bomb();
			}
		}
	}
}
//추상클라쓰로 바꿔보기
//abstract class Flyable {
//	public abstract void fly(); 
//	
//}
//class Bird extends Flyable{
//
//	@Override
//	public void fly() {
//		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");		
//	}
//
//}
//class Helicopter extends Flyable{
//	@Override
//	public void fly() {
//		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
//
//	}
//}
//class Rocket extends Flyable{
//	@Override
//	public void fly() {
//		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
//
//	}
//}


interface Flyable {
	public void fly();
}

class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");		
	}

}
class Helicopter implements Flyable{
	@Override
	public void fly() {
		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");

	}
}
class Rocket implements Flyable{
	@Override
	public void fly() {
		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
	}
	public void bomb() {
		System.out.println("로켓 폭발");
	}
}
