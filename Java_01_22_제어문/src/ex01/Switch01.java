package ex01;

public class Switch01 {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("매우 우수");
			break;
	    case 'B':
			System.out.println("우수");
			break;
	    case 'C':
	    	System.out.println("좋음");
	    	break;
	    case 'D':
	    	System.out.println("좀 더 열심히");
	    	break;
	    case 'E':
	    	System.out.println("미흡");
	    	break;
	    default:
	    	System.out.println("잘못된 등급");
	}

}
}
