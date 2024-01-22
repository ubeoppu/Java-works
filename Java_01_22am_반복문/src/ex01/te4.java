package ex01;
import java.util.Scanner;
public class te4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("길이 입력:");
		int len = sc.nextInt();
		
		int i;
		int j;
		
		for(i = 0; i < len; i++) {    //길이 값이 5
			for(j = 0; j < i; j++) {  //
				
				System.out.print(" ");
				
			}
			for(j = 0; j < (2 * len) - 1 - (i*2); ++j) { //*표 찍기
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
