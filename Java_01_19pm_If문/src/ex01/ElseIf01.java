package ex01;
import java.util.Scanner;
public class ElseIf01 {

	public static void main(String[] args) {
		
		System.out.println("첫 번째 정수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요:");
		int num2 = sc.nextInt();
		
		if(num > num2) {
			System.out.println("첫 번째 정수가 큰 값입니다.");
			System.out.println("두 번째 정수가 작은 값입니다.");
		}
		else if(num < num2) {
		System.out.println("첫 번째 정수가 작은 값입니다.");
		System.out.println("두 번째 정수가 큰 값입니다.");
		}
		
		
		if(num2 == 10) {
			System.out.println("두번째 정수는 큰 값입니다.");
		}
		else if(num2 == 5) {
			System.out.println("두번째 정수는 작은 값입니다.");
		}
		else {
			System.out.println("다시");
		}

	}

}
