package ex08;

public class Product {
	int price;
	Product(){}
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product{
	Tv(){
		super(300);
	}
	
	public String toString() {
	return "Tv";
	}
}

class Cd extends Product{
	Cd(){
		super(200);
	}
	
	public String toString() {
		return "Cd";
	}
	
}

class Phone extends Product{
	Phone(){
		super(500);
	}
	
	public String toString() {
		return "Phone";
	}
	
}

class Buyer{
	int money = 1000;
	int i = 0;
	int sum = 0;
	Product[]cart = new Product[3];
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔고가 부족합니다.");
		}else 
		money -= p.price;
		cart[i++] = p;
		if(i >= cart.length) {
			Product[]temp = new Product[cart.length + 1];
			for(int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
			cart = temp;
		}
		cart[i++] = p;
		System.out.println(p +"구매하였습니다");
		System.out.println("남은 잔고" + money);
		System.out.println();
		System.out.print("구매 물품:");
		for(int i = 0; i < cart.length; i++) {
//			sum += cart[i].price;
			System.out.print(cart[i]);
		}
		System.out.println("사용한 총 금액은:" + sum);
	}	
}


class mainControl{
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		
	}
}