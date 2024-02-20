package movie;

import java.util.ArrayList;

public class MainMenu extends AbstractMenu{
		
	
//  접근제한자  정적    상수    반환       참조변수명       객체생성 매개변수 null값
	private static final MainMenu instance = new MainMenu(null);
//                                      
	private static final String MAIN_MENU_TEXT =
	"1:영화 예매하기\n" +
	"2:영화 확인하기\n" +
	"3:예매 취소하기\n" +
	"4:관리자 메뉴로 이동하기\n" +
	"q:종료\n" +
	"메뉴를 선택하세요:";
	
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu); //부모생성자 호출
		System.out.println("MainMenu Con");
	}
	
	public static MainMenu getInstance() { //정적메서드
		return instance; //MainMenu 객체 생성 주소반환(싱글톤패턴)
		
	}
	
	
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case"1":
			reserve();
			return this;
		case "2":
			checkReservation();//예매 확인
			return this;
		case"3":
			cancelReservation(); //예매 취소
			return this;
		case "4": 
			if(! checkAdminPassword()) {
				System.out.println(">> 비밀번호가 틀렸습니다.");
				return this;
			}
			
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this); //adminMenu.setPrevMenu( )을 호출하면서 setPrevMenu에 this MainMenu주소를 넣음
			return adminMenu;  //호출한 곳으로 adminMenu를 리턴시킴.
		case "q" : return prevMenu; //q입력하면, prevMenu를 반환
		default : return this;      //그 외 입력 MainMenu로 돌아감?
		
		}
	}

	private void reserve() {
		try {
		AdminMenu admin = new AdminMenu();
		admin.printAllMovies();
		System.out.println("예매 하실 영화를 선택하세요");
		String movieId = sc.nextLine();
		Movie movie = Movie.findAll(movieId); //예매 영화 선택
		
		//예매된 좌석 현황,
		ArrayList<Reservation> reservations =
				Reservation.findMovieId(movieId);
		//호출한 메소드 내부 실행코드에서 예외가 발생하면 보고를 받음 예외처리를 어떻게 할거?
		
		Seats seats = new Seats(reservations);
		
		seats.show();
		System.out.println("좌석을 선택해주세요(예:A-7):");
		String seatName = sc.nextLine();
		
		seats.mark(seatName); //좌석 예매
		
		Reservation reservation = 
				new Reservation(movie.getId(), movie.getTitle(),seatName);
		
		reservation.save();
		
		
		}catch(Exception e) {
			System.out.printf(">>예매에 실패하였습니다:%s\n", e.getMessage());
		}
	}

	private void cancelReservation() {
		System.out.println("예매번호를 입력하세요:");
		Reservation caceled = Reservation.cancel(sc.nextLine());
		if(caceled == null) {
			System.out.println("예매내역이 없습니다.");
		}else {
			System.out.println(caceled);
			System.out.println(">>[예매 취소 완료]");
		}
		
	}

	private void checkReservation() {
		System.out.println("예매번호를 입력하세요");
		
		try {
			Reservation reservation = Reservation.findById(sc.nextLine());
			
			if(reservation == null) {
				System.out.println(">>예매내역이 없습니다.");
			}else {
				System.out.println(reservation);
				System.out.println(">>[확인 완료]");
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private boolean checkAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요:");
		
		String admin = sc.nextLine();
		
		return "admin".equals(admin);
	}
	
	
}
