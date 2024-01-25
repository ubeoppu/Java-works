package ex01;
// 메서드명:abs
//반환타입 int
//매개변수는 : int
//기능: 주어진 값의 절대값을 반환한다.
public class Sample02 {

	public static void main(String[] args) {
		System.out.println("절대값 반환 프로그램");
		int num = abs(-80);
		System.out.println("절대값은" + num);

	}
	static int abs(int num) {
		return Math.abs(num);
		//return  num < 0 ? -num : num;
	}
	
}
	
	
	
	
	/*static int abs(int n1) {
	System.out.println("절대값");
	if(n1 < 0)
		return n1 = n1-n1-n1;
	else
	return  n1;
	}
}
*/