import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Teacher
public class MenuT {
	
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alPrice;
	
	public MenuT() {
		//기본생성자를 만들어서 ArrayList 기능 사용
		this.alMenu = new ArrayList();
		this.alPrice = new ArrayList();
		
		
		String filename = "d:\\menu.txt";
		//d드라이브에 menu.txt파일 생성하고 데이터 저장
		File file = new File(filename);
		if(file.exists()){
		    BufferedReader inFile;
			try {
				inFile = new BufferedReader(new FileReader(file));

			    String sLine = null;
			    try {
					while( (sLine = inFile.readLine()) != null ) {
						String[] menu=sLine.split(",");
						this.alMenu.add(menu[0]);
						this.alPrice.add(Integer.parseInt(menu[1]));
					}   
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}	
	//파일 읽어왔으니 필요없는 메소드들 주석처리
	
//	private void addMenu(String name) {
//		this.alMenu.add(name);
//	}
//	private void addPrice(int price) {
//		this.alPrice.add(price);
//	}
	public String getName(int i) {
		return this.alMenu.get(i);
	}
	public int getPrice(int i) {
		return this.alPrice.get(i);
	}
	private int getSize() {
		return this.alMenu.size();
	}
	public void display() {
		System.out.println("--------Menu List-------");
		for(int i =0; i<this.getSize(); i++) {
			System.out.print(i+"."+this.getName(i)+", ");
			System.out.println(this.getPrice(i));
		}
	}
//	public void getMenuList() {
//		Scanner s = new Scanner(System.in);
//		Scanner s1 = new Scanner(System.in);
//		
//		System.out.print("메뉴명을 입력하시오:");
//		String name = s.nextLine();
//		while(!name.equals("x")) {
//			this.addMenu(name);
//			System.out.print("가격을 입력하시오:");
//			int price=s1.nextInt();
//			this.addPrice(price);
//			System.out.print("메뉴명을 입력하시오:");
//			name = s.nextLine();
//		}
//		s.close();
//		s1.close();
//	}
	//좀 이상함
	private void menuSave() {
		String filename = "d:\\menu.txt";
		File file = new File(filename);
		BufferedWriter outFile;
		try {
			outFile = new BufferedWriter(new FileWriter(file));
			for(int i=0; i<this.alMenu.size(); i++) {
				outFile.write(this.alMenu.get(0)+","+this.alPrice.get(i)+"\n");
			}
			outFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void control() {
		//작업코드를 읽는다.(c:추가, d:삭제, u:수정,r:목록보기)
		//""이 아닌동안
		//		r: this.display();
		//		d: 삭제할 메뉴번호를 입력하시오.
		//			입력된 메뉴를 삭제(.remove)
		//		c: 새이름을 입력하시오.
		//			새 가격을 입력하시오.
		//		u: 수정할 메뉴번호를 입력하시오.
		//			새 메뉴명을 입력하시오(같은 메뉴명 입력)
		//			새 가격을 입력하시오(같은 가격이면 입력)
		//		작업코드를 읽는다(c:추가, d:삭제, u:수정,r:목록보기, enter:작업종료)
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("c:추가, d:삭제, u:수정,r:목록보기, enter:작업종료");
		String input = s.nextLine();
		while(!input.equals("")) {
			if(input.equals("r")) {
				this.display();
				System.out.println("c:추가, d:삭제, u:수정,r:목록보기, enter:작업종료");
				input = s.nextLine();
			}else if(input.equals("d")) {
				this.display();
				System.out.println("삭제할 메뉴번호를 입력하시오.");
				int num = s2.nextInt();
				alMenu.remove(num);
				this.display();
				System.out.println("c:추가, d:삭제, u:수정,r:목록보기, enter:작업종료");
				input = s.nextLine();
			}else if(input.equals("c")) {
				System.out.println("추가할 메뉴이름을 입력하시오");
				input = s.nextLine();
				alMenu.add(input);
				System.out.println("가격을 입력하시오.");
				input = s.nextLine();
				alPrice.add(Integer.parseInt(input));
				this.control();
			}else if(input.equals("u")) {
				System.out.println("수정할 메뉴 번호를 입력하시오.");
				int num = s2.nextInt();
				System.out.println( getName(num));
				System.out.println("수정할 이름");
				input=s.nextLine();
				alMenu.set(num, input);
				System.out.println("수정할 가격");
				System.out.println(getPrice(num));
				int num2=s2.nextInt();
				alPrice.set(num, num2);
				this.display();
				System.out.println("c:추가, d:삭제, u:수정,r:목록보기, enter:작업종료");
				input = s.nextLine();
			}
			System.out.println("c:추가, d:삭제, u:수정,r:목록보기, enter:작업종료");
			input = s.nextLine();
		}
//		this.menuSave();
		s.close();
		s2.close();
	}
}
