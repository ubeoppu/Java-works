package ex08;
import java.util.Scanner;
public class BankAccountControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		BankAccount ac1 = new BankAccount(
				"20708356025344", 
				"임재현",
				10000
				);

		
		ac1.deposit(0);
		
		ac1.withdraw(0);
		
		ac1.displayBalance();
		
	
		

	}

}
