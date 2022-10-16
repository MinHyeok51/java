import java.util.ArrayList;

public class Order {
	ArrayList<String> alName;
	//컨트롤 +시프트+ o --자동 임포트
	ArrayList<Integer> alQty;
	ArrayList<Integer> alSum;
	
	//우클릭 Source 제너레이트 컨스트럭쳐 유징 필드
	public Order() {
		this.alName = new ArrayList<String>();
		this.alQty = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
	}
	
	public void addOrder(String name, int qty, int sum) {
		this.alName.add(name);
		this.alQty.add(qty);
		this.alSum.add(sum);
	}
	public String getName(int i) {
		return this.alName.get(i);
	}
	public int getQty(int i) {
		return this.alQty.get(i);
	}
	public int getSum(int i) {
		return this.alSum.get(i);
	}
	public void display() {
		int total=0;
		System.out.println("--------Order List-------");
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println(this.alName.get(i)+","+
							this.alQty.get(i)+"잔,"+this.alSum.get(i));
			total= total+this.alSum.get(i);
		}
		System.out.println("주문총액:"+total);
	}
	public int orderSize() {
		return this.alName.size();
	}
}
