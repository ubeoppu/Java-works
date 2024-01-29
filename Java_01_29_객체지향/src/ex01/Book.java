package ex01;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	Book(){
		
	}
	Book(String n, String n1, String n3, int n4){
		title = n;
		author = n1;
		publisher = n3;
		price = n4;

	}
	

	void displayBookInfo() {
		System.out.println("책이름:" + title);
		System.out.println("저자:" + author);
		System.out.println("출판사:" + publisher);
		System.out.println("가격:" + price);
	}

}
