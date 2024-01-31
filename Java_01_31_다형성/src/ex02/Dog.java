package ex02;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog Con");
	}

	@Override
	void makeSound() {
		System.out.println("월월");
	}
}
