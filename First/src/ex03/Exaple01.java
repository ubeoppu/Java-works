package ex03;

public class Exaple01 {

	public static void main(String[] args) {

		int exam = 4000;
		
		int min = exam/60;
		int min1 = min%60;
		int hour = min/60;
		int s = exam%60;
		
		System.out.println(+ hour +"시간"+ min1 +"분" + s +"초");

	}

}