
public class SutdaDeck {

	public static void main(String[] args) {
		
		int j = 1;
		int[]SutdaCard = new int[20];
		
		
			for(int i = 0; i <SutdaCard.length; i++) {
				SutdaCard[i] =  j++;
				if(j >=11) {
					j = 1;
				}
			 
		}

		
	
		for(int i =0; i < SutdaCard.length; i ++) {
			if(SutdaCard[i] != 1 && SutdaCard[i] != 3 && SutdaCard[i] != 8)
			System.out.print("["+SutdaCard[i] + "]");	
			
			else if(i <= 9) {
			System.out.print("[" + SutdaCard[i] + " 광]");
			}
			else if(i >=10){
			System.out.print("[" + SutdaCard[i] + "]");
		}
			System.out.print(" , ");
			
			}
		}					
		
	}

