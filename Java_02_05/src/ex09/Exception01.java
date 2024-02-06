package ex09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
    int sum = 0;
		try {
		sum = func1();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("두 수 합은:" + sum);
	}

	static int func1() {
		return func2();

	}

	static int func2() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 입력>>");
		int num1 = 0;
		int num2 = 0;

//		try {
//		 예외가 발생하면 어떻게 처리 ==> 1> 내부에서 해결, 2> 예외 던지기
		num1 = sc.nextInt();
		num2 = sc.nextInt();
//		}catch(InputMismatchException e) {
//			e.printStackTrace();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		return num1 + num2;
				
		
	}
}
