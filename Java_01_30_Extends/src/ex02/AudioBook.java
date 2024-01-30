package ex02;

public class AudioBook extends Book{
	
	private double length;
	private String narrator;
	
	AudioBook(){
		
	}
	
	AudioBook(String title, String author, int publicationYear,
			double length,String narrator){
		super(title, author, publicationYear);
		System.out.println("AudioBook");
		this.length = length;
		this.narrator = narrator;
	}
	
	@Override
	void displayInfo(){
	System.out.println("length:" + length + "narrator:" + narrator);
	}



}
