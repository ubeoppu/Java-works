package ex07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double div  = 0;
		
		System.out.println("정수 2개 입력>>");
		
		try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		div = num1 / num2;
		
		int[]arr = new int[3];
		for(int i =0; i<10; i++)
			arr[i] = i; //배열 벗어난 입력
		
		}catch(InputMismatchException e) {//정수가 아닌 입력하면 처리
       		e.printStackTrace();
		
		
		}catch(ArithmeticException e) {//0으로 나누기 했을 때
	    	e.printStackTrace();
		
	}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//예외가 발생하든 발생하지 않든 무조건 처리하는 구문
		}
	
		System.out.println("나누기:" + div);
		
		System.out.println("프로그램 종료!!!!");
	
}

}