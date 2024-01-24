package ex02;
public class Test12 {
	//문제 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을
	//찍어서 그래프를 그리는프로그램이다

	public static void main(String[] args) {
		int[]answer = {1,4,4,3,1,4,4,2,1,3,2}; //총11개
		int[]counter = new int[5];
	for(int i =0; i < counter.length; i++) {//i값 1, 2, 3, 4로 4번 반복
			for(int l=0; l < answer.length; l++){
        if(i == answer[l]){
		counter[i] += 1;
		
		}
	
			}
			}
			
			for(int i =1; i<counter.length; i++) {//4번반복
				System.out.print(counter[i]);
				for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
      System.out.println();
	}
	}
}

