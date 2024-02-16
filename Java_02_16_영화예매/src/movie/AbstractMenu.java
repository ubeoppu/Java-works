package movie;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor
@NoArgsConstructor

public abstract class AbstractMenu implements Menu{ //추상클래스
	
	protected String menuText; //기본 문구
	protected Menu prevMenu; //이전 메뉴
	
	protected static final Scanner sc = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText = menuText;
		this.prevMenu = prevMenu;
		System.out.println("defalut Con");
	}
	
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
		System.out.println("setprevMenu");
		
	}
	
	@Override
	public void print() {
		System.out.println("\n" + menuText);
	}
	
//	@Override
//	public Menu next() {
//		return null;
//	}

}
