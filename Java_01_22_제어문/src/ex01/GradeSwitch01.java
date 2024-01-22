package ex01;

public class GradeSwitch01 {

	public static void main(String[] args) {
		int grade = 0;
		
		switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			
			
			
		}
	}

}
