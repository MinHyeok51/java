package study009;

public class Kiosk {
	boolean powerOn;		//전원여부
	String businessType;	//업종
	int totalPrice;			//총 금액
	int totalProductCount;	//상품수
	int payBalance; 		//결제 잔액
	
	Kiosk(String bt){
		businessType = bt;
		totalPrice =0;
		totalProductCount =0;
		payBalance = 0;
	}
	void resetPrice() {
		totalPrice =0;
		totalProductCount =0;
		payBalance = 0;
	}
	
	void checkPayBalance() {
		System.out.println("현재 결제 잔액은 :" + payBalance);
	}
	int pay(int payPrice) {
		payBalance = payBalance - payPrice ;
		return payBalance;
	}
	
	int addProduct(int cnt, int price) {
		totalProductCount += cnt; //상품 개수 증가
		totalPrice = totalPrice +(cnt * price);
		payBalance = payBalance + (cnt * price);
		return totalPrice;
	}
	
	void powerOn() {
		powerOn = true;
		System.out.println(businessType + "용 키오스크 전원이 켜졌습니다.");
	}
	void powerOff() {
		powerOn = false;
		System.out.println(businessType + "용 키오스크 전원을 종료합니다.");
	}
}
