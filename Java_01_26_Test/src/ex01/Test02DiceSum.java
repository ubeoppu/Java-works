package ex01;

public class Test02DiceSum {

	public static void main(String[] args) {
		int[]dice = {1,2,3,4,5,6};
		
		
		for(int j = 0; j<dice.length; j++) {//6번 반복
		for(int i = 0; i<dice.length; i++) {//6번 반복
			if(dice[j] + dice[i] == 6) {
				System.out.println(dice[i]+"+"+dice[j]+"= 6");
			}
				
			}
		}

	}

}
