package ex01;
import java.util.Scanner;
public class BankBalance02 {

	public static void main(String[] args) {
		
		int bankBalance = 0;
		int tmp;
		int i;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		
		while(flag) {
			System.out.println("----------------------------------");
			System.out.println(" 1.예금 |2.출금 |3. 잔고  | 4.종료");
			System.out.println("----------------------------------");
			int num = sc.nextInt();
			
	        switch(num) {
			case 1:
				System.out.print("예금액>");
				tmp = sc.nextInt();
				bankBalance += tmp;
				break;
				
			case 2:
				System.out.print("출금액>");
				tmp = sc.nextInt();
				bankBalance -= tmp;
				break;
			case 3:
				System.out.print("잔고>" + bankBalance +"\n");
				break;

				default:
					System.out.println("오류");
					flag = false;
					break;
					
			}
		}
		System.out.println("프로그램 종료");

	}

}