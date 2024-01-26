package ex02;

public class OverLoadAfter {

	public static void main(String[] args) {  //매개변수의 이름이 같을 경우
		System.out.println(add(10,20));      //자료형이 다르거나 데이터 개수가 달라야한다.
		
		System.out.println(add(10,20,30));

		System.out.println(add(10.2,20.2));
		
		
	}

	static int add(int i, int j) {
		System.out.println("add(int i, int j)");
		return i+j;
	}

//	static int add(int i, double j) {
//		System.out.println("add(int i, double j)");
//		return (int)(i+j);
//	}

	static int add(int i, int j, int x) {
		return i+j+x;
	}
	
	static double add(double i, double j) {
		return i+j;
	}
}