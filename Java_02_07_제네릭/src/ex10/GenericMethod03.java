package ex10;
//Box 제네릭 클래스는 obj변수, set메서드, get메서드 가지고있다
//BoxFactory제네릭 클래스 static makeBox메서드를 가지고있다
//Unboxer제네릭 클래스 static openBox메서드
//main에서는 Box에 제네릭을 Double로 선언 후 값은 10.2 대입, Box, BoxFactory출력, Unboxer출력

class Box<T>{
	private T obj; //하이
	 //스태틱 메서드에서는 인스턴스 변수에 직접적으로 접근할 수 없다
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	//             T는 Number거나 Number하위 클래스
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box();
		box.set(o);
		
		System.out.println("Boxed:" + o.intValue());
		return box;
		
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		
		System.out.println("unboxed:" + (box.get().intValue()+1));
		return box.get();
		
	}
}
public class GenericMethod03 {

	public static void main(String[] args) {
		Box<Integer>ibox = BoxFactory.<Integer>makeBox(100);
		
		
		int num = Unboxer.openBox(ibox);
		System.out.println("data:" + num);
		
		
	}

}