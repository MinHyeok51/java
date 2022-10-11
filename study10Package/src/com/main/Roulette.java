package com.main;

public class Roulette {

	String id;
	String locationName;
	int totalScore;
	int successNumber;
	int failNumber;
	int leftTryNumber;
	int sales;
	int num;
	//	boolean fale;

	Roulette(String id, String locationName){
		int totalScore=0;
		int successNumber=0;
		int failNumber=0;
		int leftTryNumber=0;
		int sales=0;
	}

	int setFillUpMoney(int money) {		//판돈 충전 (1)
		this.sales =this.sales + money;	
		if(money>=1000) {
			this.leftTryNumber+=2;
		}
		if(money>=5000) {
			this.leftTryNumber+= 10;
		}
		System.out.println("판돈 충전:" + money);
		System.out.println("기회:" + this.leftTryNumber);
		return this.sales;
	}

//	int random() {
//		int result1=(int)(Math.random()*6)+1;
//		int result2=(int)(Math.random()*6)+1;
//		return this.num;
//	}

	//	int num1 =(int)(Math.random()*6)+1
	void gameStart() {		//게임 시작 (3)
		int result = (int)(Math.random()*6)+1;
		System.out.println("나온 수:"+result);
		for(int leftTryNumber; this.leftTryNumber>=0; this.leftTryNumber--) {
			for(int j; this.leftTryNumber>0; this.leftTryNumber--) {
				System.out.println("남은 시도횟수:"+this.leftTryNumber);
				if(num<5) {
					System.out.println("점수를 획득하였습니다."+result);
					successNumber+=1;
				}else {
					System.out.println("실패"+result);
					failNumber+=1;
				}
				}
			
			System.out.println("성공 횟수:" +this.successNumber);
			System.out.println("실패 횟수:" +failNumber);
			System.out.println("총합 점수:" +totalPoint());
			}
		}
	
	

	void leftGame() {
		System.out.println("잔여 시도 횟수: " +leftTryNumber);
	}
	int totalPoint () {
		this.totalScore+=successNumber;
		return this.totalScore;
	}

	//		this.leftTryNumber= this.leftTryNumber + 2;

	void gameOver() {	// 게임끝 매출액 빼고 값 초기화 (4)
		int totalScore=0;
		int successNumber=0;
		int failNumber=0;
		int leftTryNumber=0;
		int sales;
	}
	

//		int totalSales() {
//			int totalSales = this.sales+setFillUpMoney();
//			return sales;
//		}

	public void show() {
		System.out.println("매출액: " +sales);
		leftGame();
	}

}
