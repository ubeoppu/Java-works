package ex02;
import java.util.Scanner;
public class StarMake {

	public static void main(String[] args) {
		
		int i;
		int j;
		int len;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("길이를 입력:");
		len = sc.nextInt();
		
		for(i = 0; i < len; i++) {
			for(j = 0; j <i; j++) {
			System.out.print(" ");
			}
			
			for(j = 0; j<(len * 2) - 1 - (i *2); j++) {
				System.out.print("*");
			}
			
		
			System.out.println("");
		}
	}
	}

