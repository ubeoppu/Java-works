package ex02;

public class Test03m {

	public static void main(String[] args) {
		char ch = 'f';
		char lowerCase = (ch >='A' && ch <='Z') ? ((char)(ch+32)) : ch ;  //소문자가 대문자보다 32만큼 더 크다 대문자를 소문자로 변경
				System.out.println("ch:" + ch); //	
				System.out.println("ch to lowerCase:" + lowerCase);
  //소문자가 대문자보다 32만큼 더크다 대문자를 소문자로 변경 A:65 a:97
				//삼항 연산자 변형
				//String msg = (num >= 60) ? "합격":"불합격";
	}

}
// ch>= 'A' || ch <= 'z'>