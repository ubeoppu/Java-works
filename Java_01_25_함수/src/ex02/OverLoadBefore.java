package ex02;

public class OverLoadBefore {

	public static void main(String[] args) {
		System.out.println(add(10,20));
		
		System.out.println(add3(10,20,30));

		System.out.println(add2(10.2,20.2));
		
		
	}

	static int add(int i, int j) {
		return i+j;
	}

	static int add3(int i, int j, int x) {
		return i+j+x;
	}
	
	static double add2(double i, double j) {
		return i+j;
	}
	
	
	
	
}