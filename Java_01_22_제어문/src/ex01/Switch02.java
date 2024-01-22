package ex01;
import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
		System.out.println("----------------------------------");
		
		System.out.print("선택>");
		int ch = sc.nextInt();
		
		int bal;
		for(bal = 0; bal < 4; bal++) {
		switch(ch){
		
		
		
		case 1:
		System.out.print("예금액>");
		int money = sc.nextInt();
		break;
		
		case 2:
		System.out.print("출금액>");
		money = sc.nextInt();
		break;
		
		case 3:
		System.out.print("잔고>");
		money = sc.nextInt();
		break;
		
		case 4:
		System.out.print("프로그램종료");
		
		break;
		default:
		System.out.print("선택사항 없음");
		}
		}

		

	}

}
