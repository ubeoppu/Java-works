package ex01;


// 메소드명: max
// 반환타입: void
// 변수 : int int
//두 수 입력 받아서
//두 정수 중 최대값 반환
public class Simple07 {

	public static void main(String[] args) {
	
		System.out.println("최대값 출력");
		
        max(5,10); //함수 호출
        
		System.out.println("프로그램 종료");
		
         }

	static void max(int n1, int n2) {//void는 반환타입이 없다.
		
		
		int max = n1>n2? n1 : n2;
		
		System.out.println("실행" + max);
		
	
	}
}
