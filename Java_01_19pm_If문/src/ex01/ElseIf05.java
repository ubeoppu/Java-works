package ex01;

import java.util.Scanner;

public class ElseIf05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    System.out.print("첫 번째 정수를 입력하세요:");
		    int a = sc.nextInt();
		    
		    System.out.print("두 번째 정수를 입력하세요:");
            int b = sc.nextInt();
            
            System.out.print("세 번째 정수를 입력하세요:");
            int c = sc.nextInt();
            
            if(a < b && a < c) {
            	System.out.println("첫 번째 정수가 가장 작습니다.");
            }
            else if(b < a && b < c) {
            	System.out.println("두 번째 정수가 가장 작습니다.");
            }        
            else if(c < a && c < b) {
            	System.out.println("세 번째 정수가 가장 작습니다.");
            }
	}

}

