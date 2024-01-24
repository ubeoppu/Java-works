package ex01;
public class CodeTest02 {

	public static void main(String[] args) {



int[] lotto = new int[6]; //6개의 index배열 생성

         for (int j = 0; j < 5; j++) {//print문하고 이어짐
    	  int k;
        	 
         System.out.println("\n----------------------");
         for (int i = 0; i < 7; i++) {   //6번 반복
        	 
           int num = (int) (Math.random() * 45) + 1; //ran 변수 안에 랜덤한 1~45 숫자 데이터 넣음

            for (k = 0; k < 5; k++) { // 중복체크 6번 반복
             if (lotto[k] == num) {//만약 lotto[k]안에 데이터 값과 ran이라는 랜덤한 수가 같으면 실행
                  i--;                //i의 값을 1만큼 감소시킴
                  break;              //다음 코드로 넘어감
         }
            }

            if (lotto[k] == num)      //lotto[k]배열안에 index안 데이터 값이 ran변수안 데이터하고 같을 경우 continue:아래코드 패스 다시 위로
               continue;            lotto[i] = num;           //break문을 타고온 ran데이터 값을 lotto[i]배열 안에 데이터를 넣음

            System.out.print(lotto[i] + " "); //for문을 통해 5번 반복
         }
      }
	
}
}