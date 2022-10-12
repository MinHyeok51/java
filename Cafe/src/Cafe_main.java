import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalMenuBarUI;

public class Cafe_main {

	public static void main(String[] args) {
		Menu menu= new Menu();
		Scanner scan = new Scanner(System.in);
		//스캐너 두개선언하니까 밑에서 타입 믹스매치 에러 안뜨네 
		//throw new InputMismatchException();
		Scanner scan2 = new Scanner(System.in);


		/*메뉴이름을 읽기
		 * 메뉴이름이 "x"가 아닌 동안 (A)
		 * 메뉴이름을 alMenu에 저장
		 * 메뉴가격을 읽기
		 * 메뉴가격을 alPrice에 저장
		 * 메뉴이름을 읽기 -> A로 이동/반복
		 * 
		 * x가 들어오면
		 * 메뉴이름/가격을 출력
		 * ex)
		 * Americano, 2500
		 * Latte, 3000
		 * Espresso, 2700
		 * */
		String menuName="";
		int menuPrice ;
		boolean isOpen = true;
		while(isOpen) {
			System.out.println("메뉴입력:");
			menuName = scan.nextLine();
			if(!menuName.equals("x")) {
				menu.setAlMenu(menuName);
				System.out.println("가격입력:");
				menuPrice =scan2.nextInt();
				menu.setAlPrice(menuPrice);
			}else {
				isOpen=false;
				break;
			}
		}
//		for(int i=0; i<menu.getAlMenu().size(); i++) {
//			System.out.println("메뉴이름: "+menu.getAlMenu()+"가격: "+menu.getAlPrice());
//		}
//		menu.getAlMenu(); //배열형태로 나옴 [...]
//		menu.getAlPrice();
		menu.showAll();
	}

}
