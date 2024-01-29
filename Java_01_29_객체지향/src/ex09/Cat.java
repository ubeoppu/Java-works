package ex09;
//서로 같은 package 안에 있어야함
public class Cat {

	// 멤버 변수(필드) --재료(레시피)
	//private를 쓴다
	//생성자를 이용한 변수값 입력,setter를 이용한 변수값 입력
	//^^^즉 값 초기화
	    private String breed;
		private String color;
		//멤버 변수 값을 대입 및 변경은
		//생성자를 이용 또는 setter를 이용해서 값을 변경하거나 초기화함
		//추가 setter, getter
		//setter는 변수값을 변경할 때 사용
		//getter는 변수값을 읽어 올 때 사용
		
		//setter -> set+변수명 조합 -> 카멜표기법
		void setBreed(String s) {
			breed = s;
		}
		void setColor(String c) {
			color = c;
		}
		int age;
		//반환타입X == 매개변수X
		Cat(String s, String s2){
			breed = s;
			color = s2;
			//생성자(클래스 이름하고 같다) --반환타입X
			//멤버 변수 초기화
			//생성자를 만들지 않으면 자동으로 디폴트 생성자 생성
		}
		
		Cat(){
			System.out.println("디폴트 생성자");
		}
	void setAge(int n) { //함수 생성 및 호출을 받아 결과 출력 
	if(age>0 && age<=150)
				age = n;
	else
			System.out.println("나이는 0 ~ 150사이");
	}
		
		//void(반환타입) eat(함수명)  ()(매개변수)X
		//멤버 메서드 --액션(미역을 3분 불린다..)
		void eat() {
			System.out.println("츄르 냠");
			System.out.println("색상은 " + color + "이다.");
	}
		
		void scratch() {
			
		}
		
		
		void meow() {

		
}
	}
