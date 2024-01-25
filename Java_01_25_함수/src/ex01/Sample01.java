package ex01;

public class Sample01 {

	public static void main(String[] args) {
System.out.println("Hi");

  int num = max(100, 20);//함수 호출 /매개변수:호출 값
  
  System.out.println("최대값" + num);
  
	}
	static int max(int n1, int n2)
	{
		System.out.println("최대값");
		return n1>n2? n1:n2;
	}
	static int min(int n1, int n2) {
		System.out.println("최소값");
		return n1<n2? n1:n2;
	}

}
