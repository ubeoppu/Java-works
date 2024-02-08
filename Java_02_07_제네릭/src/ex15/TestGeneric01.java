package ex15;
//Box클래스 제네릭선언
//set메서드

class Box<T>{
	
	private T obj;
	
       void set(T obj) {
	   this.obj =  obj;
	}
	 public T get() {
		return this.obj;
	}
}

class StringBox<T>{

	
	public static<T extends Object> Box<T> getBox(T o) {
		Box<T>box = new Box();
		box.set(o);
		return box;
		}
	
}

public class TestGeneric01 {
	public static void main(String[] args) {
		
	
	Box<String> sbox = StringBox.getBox(new String("글자"));
	
	
	


		
	}

}
