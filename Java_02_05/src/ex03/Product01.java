package ex03;

//가격, 포인트
//당근, 달걀을 살라고 한다.  
public class Product01 {
	int price;
	int bonusPoint;
	
	Product01(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product01(){}

}

 class Tv01 extends Product01{
	Tv01() { 
		super(100); 
		}
	
	public String toString() {return "Tv";}
}

 class Computer01 extends Product01{
	Computer01(){
		super(200);
		}
	public String toString() {return "Computer";}
	
}

class Audio01 extends Product01{
	Audio01() {super(50); }
	public String toString() {return "Audio";}
	
}

class Buyer01{
	int money = 1000;
	int bonusPoint = 0;
	Product01[]item = new Product01[10];
	int i =0;
	
	void buy(Product01 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
			
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i = 0 ; i < item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			
			itemList += item[i] + ",";
		}

		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은" + itemList + "입니다.");

	}
}

class Poly{
	public static void main(String[] args) {
		Buyer01 b = new Buyer01();
		
		b.buy((new Tv01()));
		b.buy(new Computer01());
		b.buy(new Audio01());
		b.summary();
		}
}