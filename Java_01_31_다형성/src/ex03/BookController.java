package ex03;

public class BookController {

	public static void main(String[] args) {
//		Book book = new Book();
		
		BookController b1 = new BookController();
		
		b1.Details(new Novel("제목1", "저자1", 2001 , "장르1"));
		b1.Details(new TextBook("제목1", "저자1", 2001 , "학문1"));
		b1.Details(new Magazine("제목1", "저자1", 2001 , "5년"));
		
		

	}
	
//        Book Book = new Book();
	    void Details(Book book) {
//		String msg = book.getDetails();
		System.out.println((String)book.getDetails());
	}

}
