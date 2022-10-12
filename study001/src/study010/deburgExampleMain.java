package study010;

public class deburgExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//디버깅 <---코드 수행하면서 값들을 확인;	
		//F11=디버깅 , 브레이크포인트 설정 CTRL + SHIFT + B, 
		//다음브레이크포인뜨까지 실행 재개 = F8
		int[][] arr = new int[5][5];
		int temp;
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				System.out.println("i:" + i + ", j:"+j);
				temp = arr[i][j];
				System.out.println(temp);
			}
		}
	}

}
