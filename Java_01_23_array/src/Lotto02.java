
public class Lotto02 {

	public static void main(String[] args) {

       int[] lotto = new int[45];

       for(int i=0; i<lotto.length; i++) { //lotto[i] 배열에 1부터 45의 값을 넣음 
	         lotto[i] = i+1;
       }
       
		for(int i=0; i < 10000; i++) {
			int num = (int)(Math.random()*44)+1; //1 ~ 44         랜덤한 index의 데이터값을 index 0번에 있는 데이터값과 바꾼다
			int tmp = lotto[0];   // lotto[0] = 10  tmp = 10
			lotto[0] = lotto[num]; //lotto[0] = 15 lotto[num] =15 i
			lotto[num] = tmp;      // lotto[num] = 10
		} //반복문 10000번 실행 후 lotto배열 값이 빠져나옴
		
		
		for(int i = 0; i < lotto.length; i++){ 
			System.out.print(lotto[i] + " ");
		}
		
	}
	
}	
		/*int a = 10;
		int b = 20;
		
		System.out.println(a + " : " + b);
		
		int c = a;
		a= b;
		b = c;



		System.out.println(a + " : " + b);
*/
	
