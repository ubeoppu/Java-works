package ex01;
//1부터 50의 숫자를 랜덤으로 돌려 중복 되지 않게 5개 뽑기

public class CodeTest01 {

	public static void main(String[] args) {
		
		int[]arrNum = new int[50];                 //50개의 index 배열 생성
		boolean flag;                              //boolean형 변수 생성
		
		for(int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;                     //50개의 index 배열 안에 1~50 숫자 데이터를 넣음
		}
		int num = (int)(Math.random()*49) + 1;     /*(Math.random()*50)+1 함수는 50이 최대값, + 1이 최소값을 의미한다.
				                                              1부터 50의 숫자를 랜덤으로 돌려서 num변수에 저장*/
		for(int i = 0; i < 100000; i++) { //실행 코드 10000만 번 실행
			int tmp = arrNum[0];       //tmp 변수에 0번째 인덱스 데이터 값을 넣음
			arrNum[0] = arrNum[num];   //0번째 arrNum인덱스에 arrNum[랜덤 index] 데이터 값을 넣음
		    arrNum[num] = tmp;         //arrNum[랜덤 index]안에 원래 arrNum[0]데이터 값을 넣음
		}
	
	for(int i = 0; i < arrNum.length; i++)
		System.out.print(" " +arrNum[i]);
	}	
		

}