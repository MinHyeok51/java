package study018;

public class P2 {
	private int a;
	private int b;
	
	//밖에서 호출후 필드(private)에 값 대입하는 메소드
	public void setAlpha(int x) {	//setter method
		this.a=x;
	}
	public void setBeta(int x) {	//setter method
		this.b=x;
	}
	public int getAlpha() {	//getter method
		return this.a;
	}
	public int getBeta() {	//getter method
		return this.b;
	}
	//this 멤버변수를 가르키는 대명사
	int Plus() {
		return this.a+this.b;
	}
	int Minus() {
		return this.a-this.b;
	}
	int Multi() {
		return this.a*this.b;
	}
	double Divide() {
		return this.a/this.b;
	}
}
