package ex05;

import java.util.Scanner;

public class BankAccount {
	
	Scanner sc = new Scanner(System.in);
	
	private String accountNumber;
	private String accountHolder;
	private int balance;
	private int amount;
	
	BankAccount(String n, String n2, int n3){
		accountNumber = n;
		accountHolder = n2;
		balance = n3;

	}
	
	void deposit(int amount){
		System.out.print("입금할 금액을 입력:");
		amount = sc.nextInt();
		System.out.println("현재잔고:" + (balance += amount));
	}
	void withdraw(int amount){
		System.out.print("출금할 금액을 입력:");
		amount = sc.nextInt();
		System.out.println("현재잔고:" + (balance -= amount));
	}
	void displayBalance(){
		System.out.println("잔고:" + balance);
		
	}

}
