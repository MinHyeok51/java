package study022;

public class Factorial {
	private int x;
	int doFact(int n) {
		if(n==1)return 1;
		else return n*doFact(n-1);
	}
	
	//1부터 n까지의 합을 구하는 재귀함수(Recursive method)
	int doAccum(int n) {
		if(n==1)return 1;
		else return n+doAccum(n-1);
	}
}
