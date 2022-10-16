import java.util.ArrayList;

//Teacher+
public class Sales {
	ArrayList<String> alMobile;
	ArrayList<String> alName;
	ArrayList<Integer> alQty;
	ArrayList<Integer> alSum;
	
	public Sales() {
		this.alMobile = new ArrayList<String>();
		this.alName = new ArrayList<String>();
		this.alQty = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
	}
	
	public void add(String mobile, String name, int qty, int sum) {
		this.alMobile.add(mobile);
		this.alName.add(name);
		this.alQty.add(qty);
		this.alSum.add(sum);
	}
	public void display() {
		int total=0;
		System.out.println("--------Sales List-------");
		for(int i=0; i<alMobile.size(); i++) {
			System.out.println(this.alMobile.get(i)+","+this.alName.get(i)+", "
								+this.alQty.get(i)+", "+this.alSum.get(i));
			total+=this.alSum.get(i);
		}
		System.out.println("매출총액:"+total);
	}
}
