package ex07;

public class Over {
		
		String breed;
		String color;
		
// 클래스 명하고 같아야함 호출하는 메서드 생성	
		Over(){
			System.out.println("Cat생성자 호출");
		}
		Over(String pBreed){
			System.out.println("Cat(...)생성자 호출");
			breed = pBreed;
		}
		Over(String pBreed, String pColor){
			System.out.println("Cat(..., ...)생성자 호출");
			breed = pBreed;
			color = pColor;
		}
		
		void eat() {
			System.out.println("먹이먹음");
		}
		
		void scratch() {
			System.out.println("발톱 할퀴기");
		}
		void meow() {
			System.out.println("고양이 울음");
		

	}

}
