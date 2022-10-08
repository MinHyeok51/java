package study011;

public class Quiz {
	private String type;
	private int num;
	public int point;
	static int maxPoint =30;
	Quiz(){
		type = "Common";
		num = 0;
		point = 0;
	}
	public Quiz(String type, int num) {
		this.type =type;
		this.num = num;
		point = 0;
	}
	public void setPoint(int p) {
		if(p<=0) {
			p=0;
		}
		this.point = p;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {	//2~29는 안걸리고 나머지는 999로됨
		if(num <=1 || num>=30) {
			return 999;
		}
		return this.num;
	}
	public void printInfo(boolean includePoint) {
		System.out.println(this.type + " " + getNum());
		if(includePoint)
		{	//불린값이 트루면 여기까지 프린트됨
			System.out.println(">point:" + this.point);
		}
	}
}
