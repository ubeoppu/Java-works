package ex02;
// 코드 문제점
// 1.이 박스에는 사과, 오렌지만 담고 싶은데 다른것이 담겨도 제거 불가
// 2.get할 때 형변환(다운 캐스팅) 해야한다.
class Apple{
	
	Apple(){
		System.out.println("default");
	}
	@Override
	public String toString() { //Object클래스 재정의
		return "I am an apple";
	}
}

class Orange{
	
	@Override
	public String toString() { //Object클래스 재정의
		return "I am an Orange";
	}
}

//
class Box<T>{ //사과담는 상자
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
		getObj();
	}
	
	T getObj() {
		return obj;
	}

}


public class FruitBoxEx01 {

	public static void main(String[] args) {
//		Apple app = new Apple();
//		Box<Apple> abox = new Box<Apple>(); 
//		Box<Orange> obox = new Box<Orange>();
		Box abox = new Box(); //Box 객체 생성
//		Box obox = new Box();
//		Apple apple = new Apple();
		
//		System.out.println(apple);
		Apple ap1 = (Apple)abox.getObj();
		abox.setObj(new Apple()); //사과 담음 //abox.setObj(Apple객체 생성)
//		obox.setObj(new Orange());//오렌지 담음!><
		
//		Apple ap = box.getObj(); 하위 클래스는 상위 클래스를 참조할 수 없다.!
//		Apple ap = abox.getObj();
//		Orange op = (Orange)obox.getObj();
		
		System.out.println(abox.getObj());
//		System.out.println(op);
		
//		Box<Integer> cbox = new Box<Integer>(); //제네릭을 사용해서 int형만 대입 가능.
		
//		cbox.setObj(100);
//		int num = cbox.getObj();
		
		
		
		
		

	}

}
