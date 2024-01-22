package ex01;
import java.util.Scanner;
public class te5 {   

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("길이입력:");
	    int len = sc.nextInt();
	    
	    int j;
	    int i;
	    
	    for(i = 0; i < len; i++) {
	    	
	    	for(j = 0; j < i; j++) {
	    		
	    	System.out.print(" ");
	    	
	    	}
	    for(j = 0; j < (2 * len) - 1 - (i * 2); ++j){
	    System.out.print("*");

	    
	}
	    
	    System.out.println("");


	    
	}
	}
}
