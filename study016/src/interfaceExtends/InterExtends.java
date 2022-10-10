package interfaceExtends;

public class InterExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cls1 c1 = new Cls1();
		c1.funcA();
		c1.funcB();
		System.out.println("1--------------------------");
		Cls2 c2 = new Cls2();
		c2.funcA();
		c2.funcB();
		c2.funcC();
		System.out.println("2--------------------------");
		itfA i1 = new Cls1();
		i1.funcA();
		itfA i2 = new Cls2();
		i2.funcA();
		itfB i3 = new Cls1();
		i3.funcB();
		System.out.println("3--------------------------");
		itfB i4 = new Cls1();
		i4.funcB();
		i4 = new Cls2();
		i4.funcB();
		System.out.println("4--------------------------");
		itfC i5 = new Cls2();
		i5.funcA();
		i5.funcB();	
		i5.funcC();
		
		
		
	}

}

interface itfA{
	public void funcA();
}
interface itfB{
	public void funcB();
}
interface itfC extends itfA,itfB{
	public void funcC(); 
}
class Cls1 implements itfA, itfB{
	@Override
	public void funcA() {
		System.out.println("funcA in Cls1");
	}
	@Override
	public void funcB() {
		System.out.println("funcB in Cls1");
	}
}

class Cls2 implements itfC{
	
	@Override
	public void funcA() {
		System.out.println("funcA in Cls2");		
	}
	@Override
	public void funcB() {
		// TODO Auto-generated method stub
		System.out.println("funcB in Cls2");	
	}
	@Override
	public void funcC() {
		System.out.println("funcC in Cls2");		
	}
}

interface Mother{
	
}
class Father{
	
}
class Child extends Father implements Mother{
	
}









