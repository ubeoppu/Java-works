package ex04;

public class Car {

	private String make;
	private String model;
	private String year;
	private String color;
	private boolean engine;

	void setCar(String n1, String n2, String n3, String n4) {
		make = n1;
		model = n2;
		year = n3;
		color = n4;
	}
	Car(){// 디폴트 생성자 생성	
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
	boolean startEngine() {
		return engine = true;
	}

	boolean stopEngine() {
		return engine = false;
	}

	void displayCarDetails() {
		System.out.println("제조사명:" + make);
		System.out.println("모델명:" + model);
		System.out.println("제조년도:" + year);
		System.out.println("차 색상:" + color);
		System.out.println(engine);
		System.out.println("-----------------------");
	}

}
