package ex01;

public class Controller {

	public static void main(String[] args) {
//	  하위         상위
		B b1 = new A(); //하위 클래스가 상위 클래스를 참조하려 하기 때문 X
//	 지정 클래스  참조되는 클래스
		
//	  상위         하위	
		A a1 = new B();
	}

}
