package ex04;

public class CarControl {

	public static void main(String[] args) {

		Car c1 = new Car();
		
		 c1.setCar("현대", "아반떼", "2001", "검정");
			c1.displayCarDetails();
			
		c1.setMake("뀨");
		
		c1.setModel("아반떼");
		
		c1.setYear("2001");
		
		c1.setColor("검정");



		c1.displayCarDetails();
		c1.startEngine();
	}

}
