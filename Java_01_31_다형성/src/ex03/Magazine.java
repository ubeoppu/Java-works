package ex03;

public class Magazine extends Book{
	
	private String cycle; //\발행 주기
	
	Magazine(){
		System.out.println("Magazine()");
	}
	
	Magazine(String title, String author, int publisher, String cycle){
		super(title, author, publisher);
		this.cycle = cycle;
		System.out.println("Magazine(S, S, I, S");
		
	}
	
	@Override
	String getDetails(){
		return super.getDetails() + "\t발행주기:" + cycle + "]" ;
		
	}


}
