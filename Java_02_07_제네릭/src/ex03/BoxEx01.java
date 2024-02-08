/* 
 * Box 제네릭 클래스 생성 하나요
 * 
 */
package ex03;


class Box<T>{
	
	private T obj;
	
	 void set(T obj) {
		this.obj = obj;
		get();
	}
	
	 T get() {
		return obj;
	}

}

public class BoxEx01 {
	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box<Integer>();
		
		
		iBox.set(123);
		int num = iBox.get();
		System.out.println(num);
		
		
		Box<Double>dBox = new Box<Double>();
		
		dBox.set(12.3);
		double dNum = dBox.get();
		System.out.println(dNum);

	}

}
