package ex08;

class Toy{
	Toy() {
		
	}
	
	void inputToy() {
		
	System.out.println("toy Class");
	}
}
class Box<T>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	//제네릭 메소드  <T>:제네릭메소드 표시,
	//Box<T>:반환타입, makeBox:함수명, (T o):매개변수
	
	public static<T> Box<T> makeBox(T o){ //static 정적 메서드 생성, 제네릭 사용
		Box<T>box = new Box<T>();
		box.set(o);
		return box;
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {
		
		Toy t = new Toy();
		
		
		
//		Box<String> sBox = BoxFactory.makeBox("korea");
		Box<Integer>box = new Box<Integer>();
		box.get();
		
		Box<String> sBox = BoxFactory.<String>makeBox("korea");
		
		
		System.out.println(sBox.get());
		
		Box<Integer> iBox = BoxFactory.makeBox(100);
		System.out.println(iBox.get());
		
	}

}
