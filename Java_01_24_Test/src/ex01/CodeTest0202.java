package ex01;

public class CodeTest0202 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
	      // int k;

	      for (int j = 0; j < 5; j++) {
	         int k;
	         System.out.println("\n----------------------");
	         for (int i = 0; i < lotto.length; i++) {
	             int ran = (int) (Math.random() * 45) + 1;

	            for (k = 0; k < 5; k++) { // 중복체크
	               if (lotto[k] == ran) {
	                  i--;
	               
	                  break;
	               }
	            }
	         

	            if (lotto[k] == ran)
	               continue;
	         
	            lotto[k] = ran;
	         
	            System.out.print(lotto[k] + " ");
	         }
	      }
	}

}
