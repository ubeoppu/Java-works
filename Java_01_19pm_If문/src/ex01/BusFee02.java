package ex01;
import java.util.Scanner;

public class BusFee02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final int money = 1500;
		
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		
		if(age <= 3) {
			double a = money * 0;
			System.out.printf("버스 요금은 %d원 입니다.", (int)a);
			
		}else if(age <= 13){
			double b = money * 0.5;
			System.out.printf("버스 요금은 %d원 입니다.", (int)b);
			
		}else if(age <= 19){
			double c = money * 0.75;
			System.out.printf("버스 요금은 %d원 입니다.", (int)c);
			
		}else if(age >= 65){
			double d = money * 0;
			System.out.printf("버스 요금은 %d원 입니다.", (int)d);
			
		}else{
			System.out.printf("버스 요금은 %d원 입니다", money);
		}
	}
}
/* 버스 기본 1500원
 * 0~3세  할인율100%
 * 4~13세 할인율50%
 * 14~19 할인율0%
 * 65세 이상 할인율100%
 * 나이입력하면 할인율 기반해서 버스 요금 출력
 */
