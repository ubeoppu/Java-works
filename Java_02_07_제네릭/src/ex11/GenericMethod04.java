package ex11;

class Box<T> {

	protected T obj;
	
	Box(){
		System.out.println("Box 기본 생성자");
	}
	Box(T o){
		System.out.println("Box(T o)생성자");
	}

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
}

class SteelBox<T> extends Box<T> {
	SteelBox(){
		System.out.println("SteelBox 기본 생성자");
	}
	public SteelBox(T o) { // SteelBox 객체 생성시 T타입의 매개변수 o를 받는 생성자
		System.out.println("SteelBox");
		obj = o;
	}
}

public class GenericMethod04 {

	public static void main(String[] args) {

		Box<Integer> ibox = new SteelBox<Integer>(1234); //SteelBox클래스를 참조하는 Box클래스 참조변수명 ibox 객체 생성
		Box<String> sbox = new SteelBox<String>("korea");

		System.out.println(ibox.get());
		System.out.println(sbox.get());

	}

}
