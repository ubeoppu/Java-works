package ex01;

public class PhoneController {

	public static void main(String[] args) {

//		Phone phone = new Phone();

//		SmartPhone sp= new SmartPhone();

//	NewestPhone np	= new NewestPhone();

//		Phone phone = new Phone("m1", "흰색");

//		System.out.println(phone.toString());
//		System.out.println(phone);

//		SmartPhone sp = new SmartPhone(true);//객체 생성 인자값 true넣음

//		                              model  color  wifi
//		SmartPhone sp = new SmartPhone("m2", "검정", true);// 객체 생성 인자값 true넣음
//		System.out.println(sp);
//    	System.out.println(sp.toString());
		
		SmartPhone sp = new SmartPhone("m1", "black", true);
		sp.sendVoice("문자보내기");//상위 클래스, 하위클래스에 같은
		//메소드가 있을 경우 호출한 클래스 내부 메소드 부터 실행.
	}

}
