package ex02;

public class AnimalController {

	public static void main(String[] args) {
		
		Animal b1 = new Bird();
		b1.makeSound();
		
	    sound(new Bird()); //함수 호출
		sound(new Cat());
		sound(new Dog()); 
	}
		
	// 정적메소드로 객체 생성 필요X
		static void sound(Animal animal) { //Animal 호출
			animal.makeSound();            //makeSound() 실행
		}




		
	

}

