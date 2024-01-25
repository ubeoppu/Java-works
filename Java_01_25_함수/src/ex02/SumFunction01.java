package ex02;
//메소드: calculateEvenSum
//매개변수 int
//반환타입 int
//기능 : 주어진 점수 n까지의 모든 짝수의 합을 계산하는 함수를 작성하시오
public class SumFunction01 {

	public static void main(String[] args) {
		int num = calculateEvenSum(10);
		System.out.println("짝수의 합은:" + num);
		
	}
	
	static int calculateEvenSum(final int n1) {
		
		int sum = 0;
		
			for(int i =0; i <= n1; i++)  
			if(i % 2 == 0)  
				sum += i;
				
			return sum;			
			}
	}


