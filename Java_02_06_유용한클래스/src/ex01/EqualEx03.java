package ex01;

public class EqualEx03 {
	public static void main(String[] args) {

		Box2 b1 = new Box2(10);
		Box2 b2 = new Box2(10);

		System.out.println("1 >>" + (b1 == b2)); //주소 값 비교

		System.out.println("2 >>" + (b1.equals(b2))); //참조 주소 안 값을 비교

//	System.out.println(b1.equals(b2));

	}

}

class Box2 {
	int x;
	
	public Box2(int x) {
		this.x = x;
	}
	
	@Override
	public boolean equals(Object obj) {
		
			return x == ((Box2)obj).x;
		

	}
}
