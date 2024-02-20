package ex14;


class Box<T> {

	 private T obj;

	void set(T obj) {this.obj = obj;}
	T get() {return this.obj;}
	
	@Override
	public String toString() {
		return obj.toString();
	}
}

class Unboxer{//          super Integer ==> Integer이거나 Integer를 상속해주고 있는 상위 클래스 ex) Integer >> Number >> Object 대상이면 OK
	//                    extends Number ==> Number거나 Number를 상속한 대상이면 OK
	// Integer 계층도 .....Integer -> Number -> Object
	public static void peekBox (Box<? super Integer> box){ //<?>:와일드 카드 //Number나 Number를 상속받는 하위 클래스를 타입 지정 가능.
	
		System.out.println(box);
	
	}
}

public class GenericMethod08 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new <Integer>Box();
		ibox.set(1234);
		Unboxer.peekBox(ibox);
		
//		Box<Double> dbox = new Box();
//		dbox.set(12.5);
//		Unboxer.peekBox(dbox);
		
		Box<Object> obox = new Box();
		obox.set("설날");
		Unboxer.peekBox(obox);
		
		Box<Object> obox2 = new Box();
		obox2.set("왜");
		Unboxer.peekBox(obox2);
	}

}