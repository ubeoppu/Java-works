package ex02;

public class Test01m {

	public static void main(String[] args) {
		byte a = 10; //byte 범위 1~ 128
		byte b = 20;   /*<<<<CPU에서 연산 최소 단위가 int이므로 int보다
		   작은 자료형도 일단 int로 읽어 와서 연산을 수행하기 때문이다.*/
		int c = a+b;
		char ch = 'A';      //<<<<<
		ch = (char)(ch + 2);
		float f = (float)3/2;
		long l = 3000 * 3000 *3000L;
		float f2 = 0.1f;
		double d =0.1f;
		boolean result = d==f2;
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
	    System.out.println("l=" + l);
		System.out.println("result=" + result);

	}

}
