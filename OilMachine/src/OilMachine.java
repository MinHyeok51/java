
public class OilMachine {
	String id;	//머신 고유번호
	String branch;	//지점번호
	int price; 		//리터당 가격
	int currentOilAmount;	//현재 오일량
	static final int MAX_OIL_AMOUNT = 100;
	static final int REFUEL_OPTION_MONEY = 1;
	static final int REFUEL_OPTION_LITER = 2;
	void setPrice(int price) {//리터당 가격설정 함수
		this.price = price;
	}

	void rechargeOil(int oil) {
		if(currentOilAmount + oil > MAX_OIL_AMOUNT) {
			currentOilAmount = MAX_OIL_AMOUNT;
		}else {
			currentOilAmount += oil;	
		}
	}
	void refuelByMoney(int money) {

	}
	void refuelByLiter(int liter) {

	}
	int refuel(int option,int value) {
		if(option == REFUEL_OPTION_MONEY) {
			//value == 돈
			//그래서 돈이얼마냐 주유량이 얼마냐
			 
		}
		if(option == REFUEL_OPTION_LITER) {
			//value == 리터
			//그래서 돈이얼마냐 주유량이 얼마냐
		}
		
		//리터당 1천원
		//주유량>남은 리터 
		//남은 주유량 currentOilAmount
		//return;
		//돈, 주유량
		//주유하는 처리
		return 0; //실제 주유한 오일량
	}
	void pay(/*카드/현금, 얼마냈느냐*/) {
		//결제수단 선택
		//option : 카드냐 현금이냐
		//둘다 금액 => 매출액 +금액
		
		//이익금:
		//카드 ->이익금+ 금액 * 0.9
		//현금 ->이익금+ 금액
		//매출올리고, 오일탱크양 감소
	}
	void startSale() {
//		while(마감여부)
		//1.리터당 가격설정
		//2. 오일탱크 잔여량 확인
		//3.주유하기
			//	int realOil = refuel();
		
			//	가격 or 리터
			//	카드결제 or 현금결제
			//	매출&이익금처리
		//4.마감
	}
}
