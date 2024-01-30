package ex10;

public class methodKind {

	public static void main(String[] args) {
		
		//인스턴스 메소드는 객체를 생성한 다음 참조변수로 접근 가능
		Person p = new Person(); //힙 영역에 생성
		p.showInfo();
		
		//정적 메소드
		//스태틱 메소드는 객체 생성하지 않고 바로 접근 가능
		//클래스명.메소드명으로 호출가능
		Person.staticShow();// << 주로 사용
		p.staticShow();     // << 사용 자제

	}

}
//함수 안에 있는걸 지역변수