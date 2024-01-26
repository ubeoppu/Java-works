package ex01;
//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총홥을 출력
public class Test03 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
				}
		}
		System.out.println("1부터 100까지의 정수 중 3의 배수의 총합:" +sum);
		
	
		int[]arr = {4,1,2,3};
		for(int n:arr) //< ==(int n = 0; n < arr.length; n++)
			
			System.out.print(n+ " ");
		//////////////////////////////////////////////////////
		System.out.println();
		
		
		String[]str = {"kor", "eng", "math"};
		for(String n:str) //< ==(int n = 0; n < str.length; n++)
			System.out.print(n+ " ");
		
		System.out.println();
		
		String name1 = "JaeHyeon";
		String name2 = "JaeHyeon";
		
		System.out.println(name1.equals(name2));//참조형 비교는 equals 사용
		
		System.out.println();
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
			
			System.out.println();
			
			///////////////////////////////////////////////////////
			
			String subject = "자바 프로그래밍";
			
			int location = subject.indexOf("프로그래밍"); //location변수에 3값이 들어감
			System.out.println(location); //index 3값 출력
			String substring = subject.substring(location); //substring변수에 "프로그래밍"이 들어감
			System.out.println(substring);//"프로그래밍"출력
			
			location = subject.indexOf("자바"); //location변수에 자바 위치 index값을 넣어야하는데 "자바"라는 문자열이 없기때문에 0값이 들어감
			System.out.println(location);    //즉 0 값 출력
			
			if(location != -1) { //부정 연산자 이용, location의 값이 -1이 아니면 if문 실행
				System.out.println("자바와 관련된 책이네여");
			}else {
				System.out.println("자바와 관련된 책이 아녜요");
			}
			
			boolean result = subject.contains("자바"); //원하는 문자열이 있으면 true
			
			if(result) { //result값이 true이니 if문 실행
				System.out.println("자바와 관련된 책이에여");
			}else {
				System.out.println("자바와 관련된 책이 아녜요");
				
				System.out.println();
				////////////////////////////
				

			}
			
		}
	
	}

}
















