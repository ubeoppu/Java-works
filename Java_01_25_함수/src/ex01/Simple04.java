package ex01;

import java.util.Scanner;

// 메소드명: max
// 매개변수명: 없ㅇ므
// 반환타입: int
//두 수 입력 받아서
//두 정수 중 최대값 반환
public class Simple04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("최대값 출력");
		
		int max = max();
		
		System.out.println("최대값:" + max);
	}
	
	static int max() {
		int num1 = 5;
		int num2 = 20;
		int num3 = 30;
		return (num1> num2) && (num1 > num3) ? num1 : num2;
		
	}
}
