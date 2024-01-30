package ex02;

public class EBook extends Book{
	
	private double fileSize;
	private String format;
	
	EBook(){
		
	}
	
	EBook(String title, String author, int publicationYear, double fileSize, String format){
		super(title, author, publicationYear); //상위 클래스 생성자 호출
		System.out.println("EBook 생성자");
		this.fileSize = fileSize;
		this.format = format;
	}
	
	@Override
	void displayInfo(){
    System.out.println("fileSize:" + fileSize + "\nformat:" + format);
	}

	
	
	
	
	



}
