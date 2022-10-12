package study018;

public class Practice {

	public static void main(String[] args) {
		/*	소수(Prime Number)찾는 문제					
		  
		  	소수(Prime Number)  ->인증서에 활용
			1과 자기자신 외의 수로 나누어지지 않는 수
			p/n ==0
			2~ p-1 for문으로 돌렸을때 나머지가 0인적이 한번도 없으면 소수
			p=4~100 까지 for문
			2~p-1 for문		
		 */

		//		int pN =0;
		//		for(int i=4; i<=100; i++) {
		//			for(int j=2; j<=i; j++) {
		//				if(i%j ==0) {
		//					pN++;
		//				}
		//			}
		//			if(pN==1) {
		//				System.out.println(i);
		//			}
		//			pN=0;
		//		}

		//선생님 코드1
		//		for(int p=4; p<=100; p++) {
		//			int n;
		//			for(n=2; n<p; n++) {//n :지역변수(local변수)
		//				if(p%n==0) break;
		//			}
		//			//두가지 경우,
		//			//1. n이 p와 같아져서 자연스럽게 for문이 끝났다(소수 확정)
		//			//2. p%n==0이 돼서 중간에 탈출 (n!=p) (소수 아님 확정)
		//			if(n==p) {//소수 확정
		//				System.out.println(p);
		//			}
		//		}
		//선생님 코드2
		//		for(int p=4; p<=100; p++) {
		//			boolean flag=false; //flag 초기화 위치가 중요하다
		//			for(int n=2; n<p; n++) {
		//				if(p%n==0) {
		//					flag=true;
		//					break;
		//				}
		//			}
		//			//두가지 경우, *더 정확한 방법이다.
		//			//1.flag == true =>소수 아니다.
		//			//2.flag == false =>소수 확정
		//			if(flag==false) {
		//				System.out.println(p);
		//			}
		//		}
		//구구단 찍어보기 using for문
		//		for(int i=2; i<=9; i++) {
		//			System.out.println(i+"단");
		//			for(int j=1; j<=9; j++) {
		//				System.out.println(i+"*"+j+"="+i*j);
		//			}
		//		}
		//구구단 찍어보기 using while문
		int i=2;
		while(i<=9) {
			System.out.println(i+"단");
			int j=1; 
			while(j<=9) {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			i++;
		}
	}

}
