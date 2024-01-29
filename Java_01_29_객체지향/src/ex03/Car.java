package ex03;

public class Car {

	String make;
	String model;
	String year;
	String color;

	Car() { // 디폴트 생성자 생성
	}

	void setMake(String n1) {
		make = n1;
	}

	void setModel(String n2) {
		model = n2;
	}

	void setYear(String n3) {
		year = n3;
	}

	void setColor(String n4) {
		color = n4;
	}

	/*
	 * Car(String n1, String n2, String n3, String n4){
	 * }
	 */
	void startEngine() {
		System.out.println("엔진 켬");
	}

	void stopEngine() {
		System.out.println("엔진 끔");
	}

	void displayCarDetails() {
		System.out.println("제조사명:" + make);
		System.out.println("모델명:" + model);
		System.out.println("제조년도:" + year);
		System.out.println("차 색상:" + color);
	}

}
