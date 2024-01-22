package ex01;     //5개의 숫자 입력 5개의숫자의 합 스캐너 5번 돌리기
import java.util.Scanner;
public class ForSum02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int sum = 0;
		
		for(i = 1; i <= 5; i++) {
			
			System.out.printf("숫자를 입력:");
			int num = sc.nextInt();
		
		sum = sum + num;
	
	}
	System.out.println("5개 숫자의 합은:" + sum);

}
}
