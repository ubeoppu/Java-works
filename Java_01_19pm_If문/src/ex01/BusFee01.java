package ex01;
import java.util.Scanner;

public class BusFee01 {

	public static void main(String[] args) {

		/* 버스 기본 1500원
		 * 0~3세  할인율100%
		 * 4~13세 할인율50%
		 * 14~19 할인율0%
		 * 나이입력하면 할인율 기반해서 버스 요금 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		final int CHARGE = 1500;
		double fee = 0;
		
		System.out.println("나이 입력 :");
		int age = sc.nextInt();
		
		if(age >= 20) {
			fee = CHARGE * 1.0;
		}else if(age >= 14) {
			fee = CHARGE * 0.75;
		}
		else if(age >= 4) {
			fee = CHARGE * 0.5;
		}else{
			fee = CHARGE * 0;
		}
		System.out.println("당신 요금은:" +(int)fee + "원");
	}

}
