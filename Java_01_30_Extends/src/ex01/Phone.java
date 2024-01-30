package ex01;

public class Phone {

	private String model;
	private String color;

	Phone() { // 인자값이 없는 default생성자 생성
		System.out.println("Phone()");
	}

	Phone(String model, String color) { // 인자값 2개 //super(model, color)
		System.out.println("Phone(String model, String color)");
		this.model = model; // this.키워드를 통해 객체를 의미
		this.color = color;
	
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + "]";
	}

	public void bell() {// 추상 메소드
		System.out.println("전화 벨이 울린다");
	}

	public void sendVoice(String message) {
		System.out.println("문자 메시지:" + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방:" + message);
	}

	public void handUp() {
		System.out.println("전화를 끊습니다.");
	}

}
