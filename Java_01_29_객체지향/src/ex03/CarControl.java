package ex03;

public class CarControl {

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.setMake("현대");
		c1.setModel("아반떼");
		c1.setYear("2001");
		c1.setColor("black");

		c1.displayCarDetails();
		c1.startEngine();
		c1.stopEngine();
	}

}
