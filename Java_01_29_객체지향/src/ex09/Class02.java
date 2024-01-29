package ex09;

import java.util.Scanner;

public class Class02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//cat이란 클래스를 통해서 c1이란 참조변수가 참조하는 객체를 생성함
		//생성자를 이용한 직접 변수 값 입력
		Cat c1 = new Cat("페르시안 고양이", "흰색");
		// ==> new Cat()은 Cat()란 생성자 호출을 통해서 객체를 생성한다.
	
		c1.setAge(100);//함수의 값 입력
		c1.eat();		
		
		
	Cat c2 = new Cat("코리아", "검정");
	
	c2.setBreed("러시안블루");
	
	c2.setColor("회색");
		
	c2.eat();
	}

}
