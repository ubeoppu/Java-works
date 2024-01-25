package ex01;
//import java.util.Scanner;
/* 메서드 명: change
 * 매개변수 명:int
* 반환타입 int[]
   기능: change함수 정수값을 전달하면, 그 정수 수 만큼 배열크기를 생성해서 전달
   배열안에는 1~10까지 난수 입력
*/

public class Sample03 {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in); 
		//System.out.println("배열 생성 및 난수 출력 프로그램");
		//System.out.print("함수 값 입력:");
		//int sa = sc.nextInt();
		int[]numArr = change(5);
        for(int i = 0; i < numArr.length; i++)//5번 반복
        	System.out.print(numArr[i] + " ");
	}
	static int []change(int num) {
		int[]arrNum = new int[num]; //배열 크기 num호출해서 생성
		
		for(int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int)(Math.random()*10)+1;
	}
	         return arrNum;//return은 호출 한 곳으로 돌아감
		
	}
	}

		
		/*for(int i = 0; i < arr.length; i++) {
			return num = arr[i];
		}
		
		//int[]arrNum = new int[10];
		
	}

}
*/
