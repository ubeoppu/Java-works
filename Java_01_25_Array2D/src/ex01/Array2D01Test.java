package ex01;
import java.util.Scanner;
//학생 1, 2의 점수를 입력받아
//학생 1의 국어 점수 수학점수 평균
//학생 2의 국어 점수 수학점수 평균 출력
public class Array2D01Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr = new int[2][3];  //2행 3열
		for(int i = 0; i < arr.length; i ++) { //2번반복
	    System.out.println("학생번호" + (i + 1));  //2명의 학생 점수 입력
		System.out.print("국어점수:");
		arr[i][0] = sc.nextInt();
		System.out.print("수학점수:");
		arr[i][1] = sc.nextInt();
			arr[i][2] = (arr[i][0] + arr[i][1]) / arr.length; //평균 값 넣기
			}
		for(int i = 0; i < arr.length; i++) { //2번 반복
		    System.out.println("학생번호" + (i + 1));
		    System.out.print("국어점수:" + arr[i][0]);
		    System.out.print("수학점수:" + arr[i][1]);
		    System.out.println("평균:" + arr[i][2]);
		    }
		
	}
}
