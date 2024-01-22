package ex01;
import java.util.Scanner;
public class ElseIf02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하시오:");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다.");
			
		}else{ 
		
		System.out.println("미성년자입니다.");

	}
		System.out.println("프로그램 종료");
}
}
