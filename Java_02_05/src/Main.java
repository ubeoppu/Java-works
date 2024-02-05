
public class Main {

	public static void main(String[] args) {

		
		doWork(new A());
		doWork(new B());
		doWork(new C());
	}
	
	static void doWork(A a) { //상위 클래스 A를 상속 받는 전부 호출 가능.
		
		if(a instanceof B) {
			B b = (B)a;
			b.fb();
		}else if(a instanceof C) {
			C c = (C)a;
			c.fc();
		}else {
			a.fa();
		}
		
		
		
	}

}
