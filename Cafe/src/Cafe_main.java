import java.util.ArrayList;
import java.util.Scanner;

public class Cafe_main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		Menu menu = new Menu();
		Order order = new Order();

		//작업코드를 읽는다
		//작업코드가 ""이 아닌 동안(while)
		// if 작업코드가 "m"이면 menu.display();
		// else if 작업코드가 "o"면, 주문받아들이기.
		//	메뉴번호를 입력받는다
		//	메뉴번호가 ""이 아닌 동안(while)
		//		수량을 입력받는다
		//		총액 자동계산 -> order.alSum에 총액입력 ->저장
		//		메뉴명을 찾은후 order.alName에 메뉴명입력
		//		order.alQty에 수량입력
		//		order.alSum에 총액입력
		//		새 메뉴번호를 입력받는다.
		//	입력된 주문목록을 표시

		System.out.println("메뉴보기=m, 주문하기=o, 끄기=enter");
		String name=s.nextLine();
		int total=0;
		while(!name.equals("")) {
			if(name.equals("m")) {
				menu.display();
				System.out.println("주문하시려면 o 를 누르세요");
				name=s.nextLine();
			}else if(name.equals("o")) {
				System.out.println("메뉴번호를 입력하세요. -----종료하려면 11입력");
				menu.display();
				int num = s2.nextInt();
				
				if(num==11) {
					break;
				}else {
					while(num!=11) {
						String menuName = menu.getName(num);
						System.out.println("주문 수량을 입력하시오");
						int num1 = s2.nextInt();
						int sum = menu.getPrice(num)*num1;
						total +=menu.getPrice(num)*num1;
						order.addOrder(menuName, num1, sum);
						System.out.println("메뉴번호를 입력하세요.---------전단계로 가려면 11입력");
						System.out.println("");
						num= s2.nextInt();
					}
				}
			}
		}
		order.display();
		System.out.println("총 합: "+total);
	}
}
