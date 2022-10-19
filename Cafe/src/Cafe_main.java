import java.util.Scanner;

public class Cafe_main {

	public static void main(String[] args) {
		
		//작업코드를 읽는다
		//작업코드가 ""이 아닌 동안(while)
		// if 작업코드가 "m"이면 menu.display();
		// else if 작업코드가 "o"면, 주문받아들이기.
		//	메뉴번호를 입력받는다
		//	메뉴번호가 ""이 아닌 동안(while)
		//		수량을 입력받는다
		//		총액 자동계산 -> order.alSum에 총액입력 ->저장
		//		order.alName 에 메뉴번호 입력받아서 메뉴명을 찾은후 order.alName에 메뉴명입력
		//		order.alQty에 수량입력
		//		order.alSum에 총액입력
		//		새 메뉴번호를 입력받는다.
		//	입력된 주문목록을 표시
		Menu menu = new Menu();
		Sales sell = new Sales();
		menu.display();
		Scanner s =new Scanner(System.in);	//문자열받는 스캐너
		Scanner s1 =new Scanner(System.in);	//정수받는 스캐너
		
		System.out.println("작업코드를 입력하시오(m:메뉴관리,o:주문하기,s:매출보기,\"\":종료) ");
		String jobcode = s.nextLine();
		while(!jobcode.equals("")) {
			if(jobcode.equals("m")) {
				menu.control();
			}else if(jobcode.equals("o")) {
				menu.display();
				Order order = new Order();
				System.out.println("메뉴번호를 입력하시오.(''이면 종료):");
				String menuNum = s.nextLine();
				while(!menuNum.equals("")) {
					System.out.println("주문수량(잔)을 입력하시오:");
					int qty=s1.nextInt();
					int sum=qty*menu.getPrice(Integer.parseInt(menuNum));
					String name=menu.getName(Integer.parseInt(menuNum));
					order.addOrder(name, qty, sum);
					menu.display();
					System.out.println("메뉴번호를 입력하시오.(''이면 종료):");
					menuNum = s.nextLine();
				}
				order.display();
				System.out.println("적립할 모바일 번호를 입력하시오:");
				String mobile=s.nextLine();
				for(int i=0; i<order.orderSize(); i++) {
					sell.add(mobile, order.getName(i), order.getQty(i), order.getSum(i));
				}
			}else if(jobcode.equals("s")) {
				sell.display();
			}
			System.out.println("작업코드를 입력하시오(m:메뉴관리,o:주문하기,s:매출보기,\"\":종료)");
			jobcode=s.nextLine();	//이것이 없을경우 위에서 m이들어오면 if문 실행하고 마지막부분도달했을때 jobcode에 m이 들어있어서 다시 if문 반복실행됨.
		}
		System.out.println("프로그램 종료");
		s.close(); // 이거 없으면 스캐너 변수에 노란줄 쳐짐
		s1.close();
	}

}
