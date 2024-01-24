package ex02;
/*변수 money의 금액을 동전으로 바꾸었을 때 각각 몇개의 동전이필요한지 계산해서
 *출력하라. 단 가능한 한 적은 수의 동전으로 거슬러야한다 
 */
public class Test11 {

	public static void main(String[] args) {
		int[]coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length; i++){
			System.out.println(coinUnit[i]+ "원:" + money/coinUnit[i]);
			money = money % coinUnit[i];//4번 반복
		}
}
}
