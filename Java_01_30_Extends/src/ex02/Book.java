package ex02;

public class Book {
	
	private String title;
	private String author;
	private int publicationYear;

	Book(){
		
	}
	
	Book(String title, String author, int publicationYear){
		System.out.println("Book 생성자");
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
//	}

	void displayInfo(){
	System.out.println("Title: [" + title + "]\tAuothor: [" + author + "]\tYear:" + publicationYear + "]");

	}
	



}
