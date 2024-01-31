package ex02;

public class Bird extends Animal {

	public Bird() {
		System.out.println("Bird Con");
	}

	@Override
	void makeSound() {
		System.out.println("짹짹");
	}

}

//상위, 하위 클래스가 오버라이딩함수(funcD)를 가지고 있는 경우
// A a1 = new B();
// a1.funcD(); 를 하게 되면 B클래스의 funcD를 출력한다
/* Public Class A{
 * 
 * public void functionC(){
 * System.out.println("A Class");
 * 
 * public Class B extends A{
 * 
 * @Override
 * public void functionC(){
 * System.out.println("B Class");
 * 
 */




