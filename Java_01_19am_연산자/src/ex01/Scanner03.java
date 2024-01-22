package ex01;
import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = sc.nextInt();
		
		if(num%3 == 0 && num%5 == 0) {
			System.out.println("좋아요");
		}
	else{System.out.println("싫어요");
	}

}
}