package ex13;


class Box<T> {

	protected T obj;

	void set(T obj) {this.obj = obj;}
	T get() {return this.obj;}
	
	@Override
	public String toString() {
		return obj.toString();
	}
}

class Unboxer{
	//                    extends Number ==> Number거나 Number를 상속한 대상이면 OK
	public static void peekBox (Box<? extends Number> box){ //Number나 Number를 상속받는 하위 클래스를 타입 지정 가능.
	
		System.out.println(box);
	
	}
}

public class GenericMethod06 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new <Integer>Box();
		ibox.set(1234);
		Unboxer.peekBox(ibox);
		
		Box<Double> dbox = new Box();
		dbox.set(12.5);
		Unboxer.peekBox(dbox);
	}

}