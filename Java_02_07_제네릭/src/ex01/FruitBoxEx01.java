package ex01;

// 코드 문제점
// 1.AppleBox , OrangeBox거의 비슷
// 2.한 박스에 사과, 오렌지 담고 싶다
class Apple{
	@Override
	public String toString() { //Object클래스 재정의
		return "I am an apple";
	}
}

class Orange{
	@Override
	public String toString() { //Object클래스 재정의
		return "I am an Orange";
	}
}

class AppleBox{ //사과담는 상자
	private Apple ap;
	
	void setAp(Apple ap) {
		this.ap = ap;
	}
	
	Apple getAp() {
		return ap;
	}
}

class OrangeBox{
	private Orange op;
	
	void setOp(Orange op) {
		this.op = op;
	}
	
	Orange getOp() {
		return op;
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		
		aBox.setAp(new Apple());
		oBox.setOp(new Orange());
		
		
		System.out.println(aBox.getAp());
		System.out.println(oBox.getOp());

	}

}
