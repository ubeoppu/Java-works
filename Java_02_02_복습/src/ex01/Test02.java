package ex01;

public class Test02 {
	static long factorial(int n) {
		if (n <= 0 || n > 20)
			return -1; // 매개변수의 유효성 검사
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = 6;
		long result = 0;

		for (int i = 1; i <= n; i++) { //6번 반복
			result = factorial(i); 

			if (result == -1) {
				System.out.printf("유효하지 않은 값.(0<n<=20):%d\n", n);
				break;
			}
			System.out.printf("%d!=%6d%n", i, result);
			
		}

	}

}
