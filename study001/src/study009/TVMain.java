package study009;

public class TVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTv =  new TV("LG", 2021 ,43);
		myTv.show();
		
		//LG제품 2021년형 43인치 TV 로 출력하기
		
		TV myTv2 = new TV("SAMSUNG", 2022 ,60);
		myTv2.show();
	}

}
