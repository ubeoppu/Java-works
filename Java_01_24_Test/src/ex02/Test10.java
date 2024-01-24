package ex02;
//문제 1~9사이의 숫자를 랜덤하게 3개 뽑아내어 중복되지 않게 출력
public class Test10 {

	public static void main(String[] args) {
		int[]ballArr = {1,2,3,4,5,6,7,8,9};
		int[]ball3 = new int[3];
		
		for(int i =0; i<ballArr.length; i++) { //9번 반복
			int j = (int)(Math.random()*ballArr.length); //0~9랜덤한 수 j생성
			int tmp = ballArr[0];
			ballArr[0] = ballArr[j];
			ballArr[j] = tmp;
			//ballArr배열 마구 섞기
		}
			for(int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i];
				
			
		}
			for(int i=0; i<ball3.length; i++)
				System.out.println(ball3[i]);
		}

	

}
