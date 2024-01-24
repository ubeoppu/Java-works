package ex02;

public class Test02m {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b =  (ch >= 'A' && ch <= 'z')||(ch >= '1' && ch <= '9');   //ch변수가 영문자이거나 숫자일 때만 변수 b의 값이 true가 되도록
		System.out.println(b);
	}

}
