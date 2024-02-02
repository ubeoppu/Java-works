package ex04;

public class Example {
	public static void action(A a) { //A a = newB(); , A a = new C();
		
		
		//a참조변수가 참조하는 대상이 C클래스 이거나 C클래스를 상속한 클래스이면 true반환
		if(a instanceof C); //참조변수 a는 C를 참조하고 있냐? O실행 X넘어감  //참조하는 대상 자체 비교
		C c = new C();      //Java 12버전이라면 if(a instanceof C c); C객체 생성해줌
		a.method1();
		c.method2();
		
	}
	
	public static void main(String[]args) {
     	action(new B());
		action(new C());
//		action(new D());
	}

}
