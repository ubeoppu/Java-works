package ex10;

public class Person {

	private int age;
	private String name;
	
	void showInfo() {
		System.out.println("인스턴스 메소드");
	}
	
	static void staticShow() {
		System.out.println("static 메소드");
	}

}
