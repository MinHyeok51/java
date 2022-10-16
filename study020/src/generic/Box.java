package generic;
import java.util.ArrayList;

public class Box<T> {
	private T i;
	
	public T get() {
		return this.i;
	}
	public void set(T n) {
		this.i = n;
		
	}
}
