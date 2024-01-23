//1 ~ 100의 수를 배열에 넣어서 랜덤한 수 10 개 뽑기
public class LottoTest01 {

	public static void main(String[] args) {
		
		int[]arrNum = new int[100];  // arrNum이라는 int형 변수 안에 100개의 index 생성
		
		for(int i = 0; i < arrNum.length; i++){
			arrNum[i] = i + 1; // arrNum 배열에 1 ~ 100의 데이터를 넣음
		}
			for(int i = 0; i < arrNum.length; i++) {
				int num = (int)(Math.random()* 99)+1; // Num이라는 int형 변수 생성, Num안에 1~100 수를 랜덤으로 돌려서 Num 값 저장
				
				for(i = 0; i < 100000; i++) { //100번 반복
					int tmp = arrNum[0]; //tmp 값이 index 0에 데이터 값이 들어감
					arrNum[0] = arrNum[num]; //index 0에 랜덤한 arrNum[(random)index]의 데이터 값이 들어감
					arrNum[num] = tmp;       // arrNum[index] 값에 tmp = index0  데이터 값이 들어감
				}
			}
				for(int i = 0; i < arrNum.length; i++) {
					System.out.println(" " + arrNum[i]);
				 
				
			
			
		}

	}

}
