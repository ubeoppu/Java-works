package ex05;

class Buyer{
	int money = 2000;
	Product[]cart = new Product[3];
	int i = 0;
	
	void buy(Product p) { 
		
		//1.1
		if(money < p.price) {
			System.out.println(p + "제품을 사기에는 잔고가 부족합니다");
			return;
		}
		
		money -= p.price;
		
		add(p);
		
		
		}
	

	void add(Product p) {
		if(cart.length <= i) {
		Product[]temp = new Product[cart.length * 2]; // 1.1.1
		
		for(int i = 0; i < cart.length; i++)  // 1.1.2
			temp[i] = cart[i];
			
		cart = temp; //1.1.3
		}
		
		cart[i++] = p;
	}	
		
	void summary() {
		String itemList = "";
		int sum = 0;
	
		//1.1
		for(int i = 0; i < cart.length; i++) {
//			if(cart[i] == null){
//				break;
//			}

			itemList += cart[i] + ",";
			sum += cart[5].price;
			
		}
		System.out.println("구입한 물건의 목록" + itemList);
		System.out.println("사용한 금액:" + sum);
		System.out.println("남은 금액" + money);
		System.out.println(cart[8]);

		
		
	}
}
class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}
}

class Tv extends Product{
	Tv(){super(100);}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){super(200);}
	
	public String toString() {
		return "Computer";
	}
	
	
}

class Audio extends Product{
	Audio(){super(50);}
	
	public String toString() {
		return "Audio";
	}
}

public class Shop {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());


		b.summary();
	}

}


