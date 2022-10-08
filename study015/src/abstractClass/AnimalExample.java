package abstractClass;

abstract class Animal{
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
	public abstract void eat();
	public abstract void sleep();
	public abstract void jump();
	
}

class Dog extends Animal{
	public Dog() {
		this.kind="포유류";
	}
	public void sound() {
		System.out.println("멍멍");
	}
	public void eat() {
		System.out.println("냠냠");
	};
	public void sleep() {
		System.out.println("쿨쿨");
	};
	public void jump() {
		System.out.println("잘못해");
	};
}

class Cat extends Animal{
	public Cat() {
		this.kind ="포유류";
	}
	public void sound() {
		System.out.println("야옹");
	}
	public void eat() {
		System.out.println("냠냠");
	};
	public void sleep() {
		System.out.println("새근새근");
	};
	public void jump() {
		System.out.println("잘해");
	};
}
public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		dog.breathe();
		System.out.println("-----------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSleep(cat);
		animalSleep(dog);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	public static void animalSleep(Animal animal) {
		animal.sleep();
	}
}
