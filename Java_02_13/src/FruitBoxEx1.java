import java.util.ArrayList;

class Fruit{
	
	@Override
	public String toString() {
		return "Fruit";
	}
}
	class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
	class Grape extends Fruit{

		@Override
		public String toString() {
			return "Grape";
		}		
	}
	class Toy{

		@Override
		public String toString() {
			return "Toy";
		}
		
	}
	
	class Box<T>{
		ArrayList<T>list = new ArrayList<T>();
		void add(T item) {
			list.add(item);	
			}
		
		T get(int i) {
			return list.get(i);
	}
		int size() {
			return list.size();
			}
		public String toString() {
			return list.toString();
		}
	}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<>();
		Box<Toy> toyBox = new Box<>();
		Box<Grape>grapeBox = new Box<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); 에러
		
		toyBox.add(new Toy());
		
		System.out.println(appleBox.get(1));
		System.out.println(appleBox.list); //ArrayList배열에 list를 전부 출력.
		System.out.println("---------------");
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
		
		

	}

}
