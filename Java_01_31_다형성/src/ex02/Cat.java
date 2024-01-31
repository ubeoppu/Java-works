package ex02;

public class Cat extends Animal {

	public Cat() {
		System.out.println("Cat Con");
	}

	@Override
	void makeSound() {
		System.out.println("먀옹");
	}

}
