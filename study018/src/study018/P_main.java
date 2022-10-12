package study018;

public class P_main {

	public static void main(String[] args) {
		P2 px= new P2();
//		px.a= 10;	객체지향에서 이렇게 값을 직접 넣는것은 가급적 피해야함.
					//무조건 메소드를 통해서 하는 것이 좋다.
					//외부에서 접근하는것을 금지함
					//클래스 변수선언할땐 private으로 선언해라.
					//캡슐화(Encapsulization)
		px.setAlpha(10);
//		px.b=5;
		px.setBeta(5);
		System.out.println(px.Plus());
		System.out.println(px.Minus());
		System.out.println(px.Multi());
		System.out.println(px.Divide());
		px.getAlpha();	//왜 안되노
		px.getBeta();
	}

}
