import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alPrice;
	
	public Menu() {
		alMenu = new ArrayList();
		alPrice = new ArrayList();
	}
	public void getAlMenu() {
//		for(String aM : alMenu) {
//			System.out.println(aM); 배열형태가 아닌 문자열과 숫자 나옴
//		}
		System.out.println(alMenu+","+alPrice); //배열형태로 나옴
	}
	public void setAlMenu(String menuName) {
		this.alMenu.add(menuName);
	}
	public void getAlPrice() {
		for(Integer aP : alPrice) {
			System.out.println(aP);
		}
//		return alPrice;
	}
	public void setAlPrice(int alPrice) {
		this.alPrice.add(alPrice);
//		System.out.println(alMenu);
	}
	
	public void showAll() {
		for(int i=0; i< alMenu.size(); i++) {
			System.out.println(alMenu.get(i)+","+alPrice.get(i));
		}
	}
}
