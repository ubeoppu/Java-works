package ex01;

public class Test03 {

	public static void main(String[] args) {
		Test03 t = new Test03(); //객체 생성
	t.sound();
	Test03 f = new Test03();
	f.sing();

	}

	void sound() {
		System.out.println("사운드 메소드");
		

	
	}
	
	static void sing() {
		System.out.println("싱 메소드");
	}
}
