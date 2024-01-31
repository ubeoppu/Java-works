package ex03;

public class TextBook extends Book{
	
	private String scholarship; //학문
	
	TextBook(){
		System.out.println("TextBook()");
	}
	
	TextBook(String title, String author, int publisher, String scholarship){
		super(title, author, publisher);
		this.scholarship = scholarship;
		System.out.println("TextBook(S, S, I, S");
	}
	
	@Override
	String getDetails(){
		return super.getDetails() + "\t학문:" + scholarship + "]";
		
	}
	
	

}
