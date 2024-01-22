package ex01;

public class ThreeCon01 {

	public static void main(String[] args) {

		int num = 59;
		
		if(num >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		//삼항 연산자 변형
		String msg = (num >= 60) ? "합격":"불합격";
		System.out.println("msg");
	}

}
