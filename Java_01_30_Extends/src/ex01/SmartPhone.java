package ex01;

public class SmartPhone extends Phone {

	private boolean wifi;

	// phone(){sysout }

	SmartPhone() {
		System.out.println("SmartPhone()");
	}

	SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone()");
	}

	SmartPhone(String model, String color, boolean wifi) {
		super(model, color); // 상위 클래스 생성자 호출
		System.out.println("(st, st ,boolean wifi)");
		this.wifi = wifi;
	}
	
	@Override //어노테이션 sendVoice는 상위클래스를 재정의한다. 안정성, 가독성 위해
	public void sendVoice(String message) {
		System.out.println("음성 메시지:" + message);
		System.out.println("뀨");
	}

	@Override
	public String toString() {
		return "SmartPhone [wifi=" + wifi +"]";
	}

	public void internet() {
		System.out.println("인터넷 연결!!");

	}
}
