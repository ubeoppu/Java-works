package ex07;

class DBox<L, C>{
	private L left;
	private C right;
	
	public void set(L left, C right) { //좌측 우측
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + "&" + right;
	}
	
	}
public class MultiTypeGen {
	
	public static void main(String[] args) {
	
	DBox<String, Integer>box = new DBox<String, Integer>();
	
	box.set("D", 5);
	System.out.println(box);

	}

}
