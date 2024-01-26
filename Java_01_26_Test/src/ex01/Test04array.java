package ex01;

public class Test04array {
	public static void main(String[] args) {

		
		int[]scores; //배열 생성
		scores = new int[] {83,90,87}; // == int[]scores = {83, 90, 87};
		
		int sum1 = 0;
		for(int i = 0; i<3; i++) {//3번반복
			sum1 += scores[i]; //scores[0],scores[1],scores[2]값을 sum1에 합해서 넣음
		}
		System.out.println("총합:" + sum1); //sum1값 출력
		
		printItem(new int[] {83, 90,     87});//printItem배열 생성
	}
		public static void printItem(int[]scores) {//printItem배열을 scores배열에 참조받음
			
			for(int i=0; i<3; i++) { //3번 반복
				System.out.println("score[" + i + "]:" + scores[i]); 
			}
		}
		

	}


