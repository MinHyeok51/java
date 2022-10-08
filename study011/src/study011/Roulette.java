package study011;

import java.util.Scanner;


public class Roulette {
	//필드(속성)
	String machineId; //기기아이디
	String branchName; //지점명
	int totalPoint; //총합포인트
	int successCnt; //성공 횟수
	int failCnt; //실패 횟수
	int tryCnt; //잔여시도회수
	int sales; //매출액
	boolean isClosed; //마감 여부

	//생성자
	Roulette(String id, String name){
		machineId = id;
		branchName = name;
		totalPoint = 0;
		successCnt = 0;
		failCnt = 0;
		tryCnt = 0;
		sales = 0;
		isClosed = false;
	}

	void reset() { //다시 게임시작에 필요한 상태로 설정
		totalPoint = 0; //총합포인트
		successCnt = 0; //성공횟수
		failCnt = 0; //실패횟수
		tryCnt = 0; //잔여시도횟수
	}

	int getMenuNum() {
		Scanner scan = new Scanner(System.in);
		int menu;
		//메뉴가 1, 2, 3 중에 입력 받기
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1:충전 2:게임시작 3:마감 4.룰렛테스트");
			System.out.print("입력 : ");
			menu = scan.nextInt();
			if(menu >=1 && menu <= 4) {
				break;
			} else {
				System.out.println("보기 중에서 선택하세요.");
			}
		}
		return menu;
	}

	boolean canCharge() {
		if(tryCnt < 1) { //충전잔여가 없어야 충전가능
			return true;
		}
		System.out.println("충전 할 수 없습니다.");
		System.out.println("잔여 충전 횟수 :" + tryCnt);
		//++
		//++
		//++
		return false;
	}

	boolean canGameStart() {
		if(tryCnt > 0) { //잔여 충전 횟수가 있어야 시작가능
			return true;
		}
		System.out.println("게임을 시작 할 수 없습니다.");
		System.out.println("충전해주세요.");
		return false;
	}

	boolean canClose() {
		if(tryCnt < 1) { //충전잔여가 없어야 충전가능
			return true;
		}
		System.out.println("마감할 수 없습니다.");
		System.out.println("잔여 충전 횟수 :" + tryCnt);
		return false;
	}

	void doRun() {
		isClosed = false;

		while(!isClosed) {
			int menu = getMenuNum(); //메뉴번호를 받는 부분
			switch(menu) {
			case 1: //충전
				if(canCharge()) { //충전할수 있는 상태인가
					charge();
				}
				break;
			case 2: //게임시작
				if(canGameStart()) { //게임시작 할수 있는 상태인가
					gameStart();
				}
				break;
			case 3: //마감
				if(canClose()) { //충전할수 있는 상태인가
					closeMachine();
				}
				break;
			case 4: //룰렛테스트(1회 돌리고 결과보고, 매출액에 영향없고)
				rulettTest();
				break;
			}
		}
	}
	void rulettTest() {
		runRuletteOne();
		endOneGame();
	}
	/*
	void rulettTest() {
		System.out.println("룰렛테스트 시작");
		int value = (int)(Math.random()*6) + 1 ;
		if( value >= 1 && value <= 4 ) { // 1~4
			System.out.println("성공 룰렛숫자:" + value);
			System.out.println("전체 획득 포인트 :" + value);
		}
		else {
			System.out.println("실패");
		}
		System.out.println("룰렛테스트 끝");
	}
	 */
	void runRuletteOne() { //룰렛 한번 돌리기
		int value = (int)(Math.random()*6) + 1 ;
		if( value >= 1 && value <= 4 ) { // 1~4
			successCnt++;
			totalPoint = totalPoint + value;
			System.out.println("성공 룰렛숫자:" + value);
		}
		else {
			failCnt++;
			System.out.println("실패");
		}
		tryCnt--;
	}


	void endOneGame() {
		//다 돌고 나온 상태
		System.out.println("성공횟수:" + successCnt + " 실패횟수:" + failCnt);
		System.out.println("전체 획득 포인트 :" + totalPoint);
		//나머지들 초기화
		reset();
	}

	void gameStart() {
		//게임시작
		//룰렛을 돌리고
		while(tryCnt > 0) {
			runRuletteOne();
		}
		endOneGame();
	}
	//돈으로 시도횟수를 충전하기. 1000원에 2회 씩
	//매출액 증가, 잔여시도회수 충전
	void charge() {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int money = scan.nextInt();

		if(money <= 0) {
			//잘못된금액
			System.out.println("잘못된 금액이 입력되었습니다.");
			return;
		}
		if(money % 1000 != 0) {
			//1000원단위로만 충전이 가능하다
			System.out.println("1000원 단위로만 충전이 가능하다");
			return;
		}

		sales = sales + money; //매출액 증가
		int chargeCnt = (money/1000) * 2; //시도회수 계산
		tryCnt += chargeCnt; //시도회수 증가
		System.out.println(money + "원이 충전되었습니다.");
		System.out.println("잔여시도횟수 : " + tryCnt);
	}

	void closeMachine() {
		System.out.println(branchName + "지점 " + machineId + " 기기 마감되었습니다.");
		System.out.println("매출액 : " + sales);
		isClosed = true;
	}

	boolean getIsClosed() {
		return this.isClosed;
	}
}