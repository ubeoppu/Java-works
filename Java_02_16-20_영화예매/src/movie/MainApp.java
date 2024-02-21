package movie;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		
		Menu menu = MainMenu.getInstance(); //MainMenu의 주소값을 참조변수명 menu에 넣음
	
		while(menu != null) { //menu가 null이 아니라면 실행
			menu.print();     //print() 메서드 호출
			menu = menu.next(); //next() 메서드 호출
		}
		
		
		System.out.println("프로그램을 종료합니다.");
	}
}
