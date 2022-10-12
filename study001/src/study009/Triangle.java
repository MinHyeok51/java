package study009;

public class Triangle {
	int width;
	int height;
	
	
	
	void setSize(int width, int height) {
		this.width= width;
		this.height= height;
		
		
	}
	
	double getArea() {
		double result = width * height/2;
		return result;
	}
}
