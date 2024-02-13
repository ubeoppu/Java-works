//Box 제네릭 클래스는 obj변수, set메서드, get메서드 가지고있다
//BoxFactory제네릭 클래스 static makeBox메서드를 가지고있다
//Unboxer제네릭 클래스 static openBox메서드
//main에서는 Box에 제네릭을 Double로 선언 후 값은 10.2 대입, Box, BoxFactory출력, Unboxer출력
package ex02;


class Box<T>{
	private T obj;
	
	void set(T o){//세터
		this.obj = o;	
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory<T>{
	
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<>();
		box.set(o);
		System.out.println(box.get());
		return box;
	}
}

class Unboxer<T>{
	
	public static<T> T openBox(Box<T> box){
		
		System.out.println("Unboxer:" + box.get());
		return box.get();
	}
}

public class GenericMethod03Ex01 {
	public static void main(String[] args) {
		Box<Double> box1 = BoxFactory.<Double>makeBox(10.2);
		
		
		double num = Unboxer.openBox(box1);
		System.out.println(box1.get());

	}

}
