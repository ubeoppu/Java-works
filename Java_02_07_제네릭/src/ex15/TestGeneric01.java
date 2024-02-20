package ex15;
//Box클래스 제네릭선언
//set메서드

class Box<T>{ //제네릭 클래스 선언
	
	private T obj;
	
       T set(T obj) {
    	   
	   this.obj =  obj; //호출받은 obj값을 변수 obj에 값을 넣음
	   return this.obj;
	}
       
       Box(){
    	   System.out.println("default");
       }
       
	 public T get() {
		return this.obj; //호출한 곳으로 반환
	}
}

class StringBox<T>{ //제네릭 클래스 선언

	//              Object클래스를 상속 받고 있는 클래스 타입만 타입선언 가능.
	public static<T extends Object> Box<T> getBox(T o) { 
		Box<T>box = new Box(); //제네릭 클래스은 Box객체 생성
		box.set(o);            //Box클래스의 set메서드에게 o의 값을 넣어줌
		return box;
		}
	
}

public class TestGeneric01 {
	public static void main(String[] args) {
		
	
	Box<String> sbox = StringBox.getBox(new String("흐에"));
	System.out.println(sbox.set(null)); 
	
	
	


		
	}

}
