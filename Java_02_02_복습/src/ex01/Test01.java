package ex01;

public class Test01 {
	public static void main(String[] args) {
//		Test01 r = new Test01(); //참조변수명 r 객체 생성
		
		int result = add(3,5); //변수 result 선언 후 초기화를 r.add(3, 5)로 함;
		System.out.println(result);//result 변수 출력
		
		int[]result2 = {0};  //index 0 = 0 배열 생성
		add(3,5,result2);  ///add함수(3,5, result2);
		System.out.println(result2[0]); //result2 배열의 index 0번 출력
	}
	
	static int add(int a, int b) { //자료형 함수 add 생성 int a, b 호출
		return a + b;    //a + b 함수 호출받은 곳 돌려줌
	}
	static void add(int a, int b, int[]result) { //void add 함수 생성 int a, b, int[]result배열 호출
		result[0] = a + b;                //0번째 index에 호출 받은 a+b 한 값을 넣음
	}

}
