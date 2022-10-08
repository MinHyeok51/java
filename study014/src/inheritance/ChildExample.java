package inheritance;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();

		Parent parent = child;
		parent.method1();
		parent.method2();

		//		parent.method3();

		//타입 강제변환
		Child child2 = (Child)parent;
		child2.method3();

		//		child.method3();
		//		child.method1();
		//		child.method2();
		//		
		Parent parent2 = new Parent();
		parent2.method1();
		parent2.method2();
		
		System.out.println((child2 instanceof Parent));
		System.out.println((child instanceof Child));
		System.out.println((parent instanceof Child));
//		System.out.println("---------------------------------");
//		Child child4 = (Child)parent2;
//		child4.method3();	에러남 책 p350
		System.out.println((parent2 instanceof Child));
		
		if(parent2 instanceof Child) {
			Child child3 = (Child)parent2;
			child3.method3();
		}else {
			parent2.method2();
		}
		
	}

}

class Parent {
	public void method1() {
		System.out.println("Parent-method1()");
	}
	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
}