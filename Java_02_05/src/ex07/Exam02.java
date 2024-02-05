package ex07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double div  = 0;
		
		System.out.println("정수 2개 입력>>ㅁ");
		
		try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		div = num1 / num2;
		

		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
		
//	catch(ArithmeticException e) {
//		e.printStackTrace();
//	}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("나누기:" + div);
		
		System.out.println("프로그램 종료!!!!");
	}
}

