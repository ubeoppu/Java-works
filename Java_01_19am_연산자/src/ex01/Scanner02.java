package ex01;
import java.util.Scanner;
public class Scanner02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자1입력:");
		int num = sc.nextInt();
		System.out.println("숫자2입력:");
		int num1 = sc.nextInt();
		
		int sum = num + num1;
		double avg = sum / 2;
		
		System.out.println("첫 번째 정수: " + num +  "\n두 번째 정수: " + num1 + "\n합계:" + sum + "\n평균:" +avg);
		
		

	}

}
