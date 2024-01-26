package ex01;

public class Test01Money {

	public static void main(String[] args) {
		int[]coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money= " + money);
		
		for(int i =0; i < coinUnit.length; i++) {
			int count = 0;
			
			count =money / coinUnit[i]; //동전의 개수
			money %= coinUnit[i];       //나머지 값
			System.out.println(coinUnit[i] + "원 개수:" + count );
		}

	}

}
