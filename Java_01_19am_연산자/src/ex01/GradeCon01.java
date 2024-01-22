package ex01;
import java.util.Scanner;
public class GradeCon01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오:");
		int grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A학점입니다.");
			
		}else if(grade >= 80) {
		System.out.println("B학점입니다.");
	    
		}else if(grade >= 70) {
			System.out.println("C학점입니다.");
		}else if(grade >= 60) {
			System.out.println("D학점입니다");
		}else {
			System.out.println("F학점입니다.");
		}
	}
}
