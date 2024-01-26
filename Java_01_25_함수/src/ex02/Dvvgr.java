package ex02;

public class Dvvgr {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z = 14;
		
		z = ++x + y++;
		System.out.println(z); // 21
		System.out.println(y);

		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double n1 = 1;
		double n2 = 0.7;
		double div = 1 / 0.7;
		double result = apple - number*pieceUnit;
		System.out.println("사과1개에서 남은 양:" +result);
		System.out.println("%.3d" + div);
	}

}
