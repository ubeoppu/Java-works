
public class arrayLotto01 {

	public static void main(String[] args) {
		
		//1~45 숫자 중에서 랜덤하게 6개 추출
		int[]lotto =new int[6];
		boolean flag;
		
		for(int j = 0; j<5; j++) { // 총 5번 반복
			
		for(int i = 0; i < lotto.length; i++) { //길이6
			flag = false;
		 int  num = (int)(Math.random()* 45) + 1;
		
        for(int k = 0; k < i; k++) {
        	if(num == lotto[k]) {
        		flag = true;
        		break; //다음 코드로 이동
        	}			 
			 }
        if(flag) {
        	i--;
        	continue;//아래 문 스킵 / 위로 이동
        }
        
        lotto[i] = num;
        
        }
		
		for(int i = 0; i < lotto.length; i++) {
		
			 System.out.print(" " + lotto[i]);
		}
		System.out.println("\n------------------");
		}
	}


		}
	
	


