package movie;

import java.util.ArrayList;

public class AdminMenu extends AbstractMenu{
	
	private static final AdminMenu instance = new AdminMenu(null);
	
	private static final String ADMIN_MENU_TEXT =
			"1:영화 예매하기\n" +
			"2:영화 목록보기\n" +
			"3:예매 영화 삭제하기\n" +
			"b:메인 메뉴로 이동\n" +
			"메뉴를 선택하세요";

	private AdminMenu(Menu prevMenu) {
     	super(ADMIN_MENU_TEXT, prevMenu); //부모생성자 호출
     	System.out.println("AdminMenu Con");
     
	}
	
	public static AdminMenu getInstance() {
		return instance; //MainMenu 객체 생성 주소반환(싱글톤패턴)
		
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "2" : printAllMovies();
		return this;     //adminMenu(관리자)반환
		case "b" : return prevMenu;
		default: return this; //자기자신(AdminMenu) ==> new AdminMenu(null);
		
		}
	}

	private void printAllMovies() {
		ArrayList<Movie> movies= Movie.findAll(); //모든 영화를 가져옴
		
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}
	

}
