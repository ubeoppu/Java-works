package ex03;

public class Book {

	private String title;
	private String author;
	private int publisher;
	
	Book(){
		System.out.println("Book()");
		
	}
	
	Book(String title, String author, int publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book(S, S, I)");
	}
	
	
	String getDetails(){
		return "[제목:" + title + "\t저자:" + author + "    출판연도:" + publisher + "";
		
	}

}
