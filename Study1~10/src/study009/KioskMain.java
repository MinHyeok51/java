package study009;

public class KioskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kiosk ksk =new Kiosk("분식집");
		
		ksk.powerOn();
		//상품을 추가하고 금액이 올라가고
		System.out.println("상품추가 후 현재 총 금액: " +ksk.addProduct(3, 1000));
		System.out.println("상품추가 후 현재 총 금액: " +ksk.addProduct(2, 3000));
		System.out.println("상품추가 후 현재 총 금액: " +ksk.addProduct(1, 10000));
		//현재 금액을 확인하고
		
		//결제하고
		ksk.checkPayBalance();
		int payBalance=ksk.pay(ksk.payBalance); //결제 처리 후 아직도 남은 결제해야하는 잔액
		ksk.checkPayBalance();
		//리셋하려는거
		if(payBalance == 0) {
			System.out.println("결제 완료 되었습니다.");
			ksk.resetPrice();
		}else {
			System.out.println("미결제 금액이 있습니다. 결제 완료 해주세요.");
		}
		
		ksk.powerOff();
	}

}
