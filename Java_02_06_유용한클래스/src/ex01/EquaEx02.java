package ex01;

public class EquaEx02 {
	public static void main(String[] args) {

		Box b1 = new Box("Korea");
		Box b2 = new Box("Korea");

		System.out.println("1 >>" + (b1 == b2));

		System.out.println("2 >>" + (b1.equals(b2)));

//	System.out.println(b1.equals(b2));

	}

}

class Box {
	String str;

	public Box(String str) {
		this.str = str;
	}
}
