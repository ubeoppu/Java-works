package ex02;

public class BookController {

	public static void main(String[] args) {
		

		
		EBook e1 = new EBook("Java마스터", "송미영",2001,10.5,"pdf");
		e1.displayInfo();
		
		Book b1 = new Book();
		b1.displayInfo();
		
		AudioBook a1 = new AudioBook("Java마스터", "송미영", 2001, 10 ,"나레이터");
		a1.displayInfo();

	}

}