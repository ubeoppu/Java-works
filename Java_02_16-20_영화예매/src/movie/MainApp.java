package movie;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		
		Menu menu = MainMenu.getInstance();
	
		System.out.println("menu:" + menu);
		
		while(menu != null) {
			menu.print();
			menu = menu.next(); //menu는 adminMenu의 주소를 갖게됨
			System.out.println("2:" + menu);
		}
		
		
		System.out.println("프로그램을 종료합니다.");
	}
}
