package ex01;

import java.util.Scanner;

// 메소드명: max
// 매개변수명: 없음
// 반환타입: int
//두 정수 입력 받아서 최대값 출력
public class Simple06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("최대값 출력");
		
        max(); //함수 호출
        
		System.out.println("프로그램 종료");
		
         }

	static void max() {
		int num1 = 5;
		int num2 = 20;
		
		int max = num1>num2? num1 : num2;
		
		System.out.println("실행" + max);
		
	
	}
}
