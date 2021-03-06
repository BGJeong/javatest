package java0924;

abstract class Animal {
	private String kind;

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		setKind("포유류");
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public Cat() {
		setKind("포유류");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
class Oss implements Inter01{
	public Oss() {
		
	}
	@Override
	public void methodEx() {
		System.out.println("ㅎㅇ");
	}
}

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();

		System.out.println("--------");
		Animal ani = new Dog();
		ani.sound();
		Animal ani2 = new Cat();
		ani2.sound();

		animalSound(new Dog());
		animalSound(new Cat());
		System.out.println(dog.getKind());
		Oss ooo = new Oss();
		ooo.methodEx();
	}
		
	public static void animalSound(Animal ani) {
		ani.sound();
	}
}
