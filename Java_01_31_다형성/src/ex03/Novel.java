package ex03;

public class Novel extends Book{
	
	private String genre; //장르

	Novel(){
		
	}
	Novel(String title, String author, int publisher, String genre){
		super(title, author, publisher);
		this.genre = genre;
		System.out.println("Novel(S, S, I, S)");
		
		
	}
	
	@Override
	String getDetails(){
		return super.getDetails() + "\t장르:" + genre + "]";
		
	}
}
