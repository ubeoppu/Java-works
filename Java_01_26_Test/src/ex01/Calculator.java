package ex01;

public class Calculator {

	public static void main(String[] args) {
		powerOn(); //자료형X 매개변수X 함수생성
		powerOff();//자료형X 매개변수X 함수생성
		
		int num = plus(5, 2); //매개변수 생성 및 return한 값 저장
		System.out.println(num); //return으로 받아온 값을 출력
		
		double avg = divide(5,2); //매개변수 생성 및 return한 값 저장
		System.out.println(avg); //return으로 받아온 값을 출력
	}
		
		static void powerOn() {    //자료형이 없으므로 void, powerOn함수 가져옴
			System.out.println("전원을 켬"); //그냥 실행
		}
		
		static void powerOff() {    //자료형이 없 void
			System.out.println("전원 끔");
		}
		
		
		
		
		static int plus(int x, int y) { //plus 매개변수 값 불러옴
			int result = x+y;           //매개변수 5, 2활용
			return result;              //result변수 값이 호출했던 곳으로 다시 올라감
		}
		
		static double divide(int x, int y) {//divide 매개변수 값 불러옴
			double result = (double)x / y;
			return result;                 //result변수 값이 호출했던 곳으로 다시 올라감
		}

	}


