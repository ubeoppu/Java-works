package ex02;
//메소드 findMax
//매개변수 int[]
//반환타입 int
// 기능 정수 배열을 입력받아 배열 내의 최대값을 반환합니다.
public class ArrayFunction01 {

	public static void main(String[] args) {
		int[]numArr = {10, 20, 30, 40,50}; //numArr배열 생성
		int num = findmax(numArr);// num변수에 numArr함수 생성
		System.out.println("제일 큰값은" + num + "입니다.");
      
	}
	static int findmax(int[]arr) {
		int max = 0;

		for(int i = 0; i < arr.length; i++) 
			if(max < arr[i])
				max = arr[i];
					return max;
					
				
			
			//5번반복
			
		
	}

}
