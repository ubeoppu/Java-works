package ex01;//1 ~100사이에 3이면서 5의 배수의 합을 구하고, 3과 5의 배수 개수 구하기

public class For03 {

	public static void main(String[] args) {
		
		int i;
		int suma = 0; //배수의 합
		int sumb = 0; //배수의 개수
		for(i = 1; i <= 100; i++) {
		if(i % 3 == 0 && i % 5 == 0) {
			
			++sumb;//배수의 개수
			
			suma = suma + i;//배수의 합
		}
		}
		
		System.out.println("3과 5의 배수의 합은:" + suma);
		System.out.println("3과 5의 배수의 개수는:" +sumb);
		
		}

}


