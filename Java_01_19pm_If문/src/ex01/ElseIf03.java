package ex01;
import java.util.Scanner;
public class ElseIf03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요");
		int num2 = sc.nextInt();
		
		System.out.println("세 번째 정수를 입력하세요");
		int num3 = sc.nextInt();
	
		if(num1 > num2 && num1 > num3) {
			System.out.println("첫 번째 정수가 가장 큰 값입니다.");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("두 번째 정수가 가장 큰 값입니다.");
		}
		else if(num3 > num1 && num3 > num2) {
			System.out.println("세 번째 정수가 가장 큰 값입니다.");
		}
		else 
			System.out.println("오류");
		// TODO Auto-generated method stub

	}

}
