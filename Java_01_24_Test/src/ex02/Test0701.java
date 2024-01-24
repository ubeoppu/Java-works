package ex02;
import java.util.Scanner;
public class Test0701 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag;
		int count = 0;
		System.out.println("정답을 입력하세요:"); //사용자가 입력하는 예상 정답
		int num = sc.nextInt();
		
		int answer = (int)(Math.random()*100) +1;//answer변수 안에 1~100사이 랜덤한 수의 데이터를 넣음
		
		while(flag) {
			count++;
			if(answer == num) {
				System.out.println("정답입니다!!");
				false;
			}
			else if(num > answer) { // 입력한 수가 answer보다 클 때
				System.out.println("더 큰 수 입니다.");
			}
			else if(num < answer){ // 입력한 수가 answer보다 낮을 때
				System.out.println("더 작은 수 입니다.");
			}
			
		}

	}

}
