package ex04;

public class Shop {
	
	int price;


	Shop(){
	}
	
	Shop(int price){
		this.price = price;
	}
	

}

 class Egg extends Shop{
	 Egg(){
	 
	 super(100);
	 }	 
	 
	 public String toString(){
		 return "달걀";
	 }
 }
 
 class Carrot extends Shop{
	 Carrot(){
		 super(200);
	 }
	 public String toString() {
		 return "당근";
	 }
	 
 }
 
 class Buyer{
	int money = 1000;
	int point = 0;
	 void buy(Shop s){
		 if(money < s.price) {
			 System.out.println("잔고 부족");
		 }
		 else {
		 money -= s.price;
		 point += (s.price * 0.1);
		 
		 System.out.println(s + "사고 남은 잔고는"+ money + "이며 현재 포인트는" + point + "입니다." );
	 }
	 }
 }
 class Control67 {
	 public static void main(String[] args) {
		
	
	 Buyer b = new Buyer();		 
		 
		 b.buy(new Egg());
		 b.buy(new Carrot());
		 }
	
 }
 