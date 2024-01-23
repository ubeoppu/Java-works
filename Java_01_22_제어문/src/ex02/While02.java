package ex02;

public class While02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do{
			sum += i;
			i++;       //증가 값
		}while(i <= 10); //조건
		
		System.out.println("sum :" + sum);

	}

}
