package ex09;

//Box 제네릭 클래스와 제네렉 메소드를 보고서
//main메소드를 채우시요
//T타입은 String으로 한다.

	class Box<T>{
		private T obj; //하이
		
		void set(T obj) {
			this.obj = obj;
		}
		
		T get() {
			return this.obj;
		}
	}

	class unboxer{
		public static <T> T openBox(Box<T> box) {
			return box.get();
			
		}

			
	}
	public class GenericMethod02 {

		public static void main(String[] args) {
			Box<String>sbox = new <String>Box();
			
			sbox.set("하이");
			String str = unboxer.openBox(sbox);
//			Box<String>sbox = unboxer.<String>openBox("하이요"); //제네릭 지정			
			
			
//			sbox.set("하이요");
//			String st = sbox.get();
			
			System.out.println(str);
			
			
		}

	}
