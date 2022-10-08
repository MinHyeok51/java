package moningQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	//필드
	List<Food> foodList; //판매하는 음식 목록
	int totalSales;   //총매출액
	boolean isOpened; //영업중 여부
	
	//생성자
	FoodTruck(){
		foodList = new ArrayList<Food>(); //리스트 초기화
		totalSales = 0; 
		isOpened = false;
	}
	
	//메소드
	void startSales() {  //장사시작 (전체 프로세스 흐름 관리)
		System.out.println("푸드트럭 장사시작!");
		isOpened = true;
		//1. 메뉴보기 2. 주문하기 3. 재고관리 4. 마감
		
		//마감될때까지 장사 계속 수행
		while(isOpened) {
			int mainMenu = getMainMenu();
			switch(mainMenu) {
			case 1: //메뉴보기
				//foodList 음식 목록 보여주기
				showFoodList();
				break;
			case 2: //주문하기
				//어떤 메뉴를 주문할지 입력받아서 처리(매출액 증가, 재고감소)
				//주문하기(입력받아서 처리)
				orderMenu();
				break;
			case 3: //재고관리
				//어떤 메뉴 재고관리할지 + 수량 몇개 조정 (선택한 메뉴의 재고(Food.stock) 조정)
				manageStocks();
				break;
			case 4: //마감
				//각 메뉴별 폐기로 인한 손해금액 계산(=남은재고*가격*0.3)
				//전체매출액 - 손해금액 = 매출액
				//마감
				System.out.println("푸드트럭 마감합니다.");
				calculateTotalSales();
				isOpened = false;
				break;
			}
		}
	}
	
	void calculateTotalSales() {
		/*
		 * 매출 4만 - 폐기손해3천 = 최종매출 37000원
		 */
		//전체 매출액 -> totalSales
		//폐기손해 : (각 메뉴가격 * 0.3) * 각 메뉴의 stock(재고갯수)
		int lossSales = 0;
		for(Food food : foodList) {
			lossSales =  lossSales + (food.stock * (int)(food.price * 0.3));
		}
		//최종 매출 : totalSales - 폐기손해
		System.out.println("매출 : " + totalSales);
		System.out.println("폐기손해 : " + lossSales);
		System.out.println("최종매출 : " + (totalSales - lossSales));
	}
	
	//메인 메뉴들 중에 메뉴를 선택받아서 선택한 메뉴번호를 반환
	//1. 메뉴보기 2. 주문하기 3. 재고관리 4. 마감
	int getMainMenu() {
		Scanner scan = new Scanner(System.in);
		int menu;
		while(true) {
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감");
			System.out.print("메뉴를 선택하세요:");
			menu = scan.nextInt();
			if( menu >= 1 && menu <=4) {  // 1~4
				break;
			} else {
				System.out.println("보기 중에 선택하세요");
			}
		}
		return menu;
	}
	
	void addMenu(String name, int price) {
		Food food = new Food(name, price);
		foodList.add(food);
	}
	
	void showFoodList() {  //판매중인 음식리스트 보여주기
		int num = 1;
		for(Food food : foodList) {
			System.out.println("메뉴번호 " + num++ + ". " + food.getFoodInfo() );
		}
	}
	
	void orderMenu() { //주문 받아서 처리
		//주문 입력받고
		int menuIndex = getFoodMenuIndex();
		
		//필터
		//재고량이 있어야 주문가능
		if( !(foodList.get(menuIndex).stock > 0) ) {
			System.out.println("해당 메뉴는 품절입니다.");
			return;
		}
		//foodList
		//김밥, 짜장면, 핫도그
		// 0    1     2
		
		// 입력 1 -> 인덱스 0 (입력받은 숫자 - 1 )
		//"짜장면"(Food).price
		this.totalSales += foodList.get(menuIndex).price; //매출액 늘리고
		foodList.get(menuIndex).modifyStock(-1); //재고 1줄이기
		
		System.out.println(foodList.get(menuIndex).name + " 주문완료");
	}
	
	void manageStocks() {  //재고관리 처리하는 함수
		//메뉴를 보여주고
		//재고 조정할 메뉴를 선택하고
		int menuIndex = getFoodMenuIndex();
		
		//재고를 몇개를 추가할지 입력하고
		Scanner scan = new Scanner(System.in);
		System.out.print("추가할 재고 갯수를 입력하세요 : ");
		int addStock = scan.nextInt();
		//입력받은 수만큼 재고를 Plus 한다음에 종료
		foodList.get(menuIndex).modifyStock(addStock);
		System.out.println("재고 추가 완료");
		System.out.println(foodList.get(menuIndex).getFoodInfo());
	}
	
	//선택한 메뉴의 Index 넘어온다.
	int getFoodMenuIndex() {
		//보유하고 있는 메뉴를 보여주고
		//메뉴를 선택 받기
		Scanner scan = new Scanner(System.in);
		int menu;
		while(true) {
			showFoodList();
			System.out.print("메뉴를 선택하세요:");
			
			menu = scan.nextInt();
			if( menu >= 1 && menu <= foodList.size()) {  // 1~3
				break;
			} else {
				System.out.println("보기 중에 선택하세요");
			}
		}
		//1 2 3
		return (menu-1);
	}
}











