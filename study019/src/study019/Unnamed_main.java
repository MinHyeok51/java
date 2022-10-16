package study019;

public class Unnamed_main {

	public static void main(String[] args) {
		A a = new A();
		A1 b= new A1();
		
		b.setI(10);
		b.setX(5);
//		A b= new A() {
		//클래스 A 가 아니고 A의 익명 자식클래스
		//딱 한번만 쓰는경우
//			int i;
//			String j;
//			
//			public int getI() {
//				return i;
//			}
//			public void setI(int i) {
//				this.i = i;
//			}
//			public String getJ() {
//				return j;
//			}
//			public void setJ(String j) {
//				this.j = j;
//			}
//		};
		
		I0 i0 = new I0() {
			//익명 인터페이스 구현클래스
			@Override
			public void showI0() {
				// TODO Auto-generated method stub

			}

			@Override
			public int getI0(int a) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
