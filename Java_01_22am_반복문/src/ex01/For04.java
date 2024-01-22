package ex01; //1~100사이에 홀수합과 짝수합을 구하시요

public class For04 {

	public static void main(String[] args) {
		
		int i;
		int suma = 0;
		int sumb = 0;
		
		for(i = 1; i <= 100; i++) {
	
	if(i % 2 == 0) {
		suma = suma + i;		
	}
	else {
		sumb = sumb + i;

		
	}
		}
	System.out.println("짝수의 합은:" + suma);
	System.out.println("홀수의 합은" + sumb);
		}
}
	

//홀수의 합 2500
//짝수의 합 2550