package ex06;

class Box<T extends Number>{//Box클래스는 넘버를 상속받고 있으며, Number클래스를 상속받고 있는 하위클래스들만 타입?대입가능?
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}

public class BoxEx02 {

	public static void main(String[] args) {
		
		Box<Integer>ibox = new Box<Integer>(); //상위 클래스인 Number의 자식들은 전부 대입이 가능하다.
		Box<Double>dbox = new Box<Double>();
		
//		Box<String>sbox = new Box<String>();

	}

}
