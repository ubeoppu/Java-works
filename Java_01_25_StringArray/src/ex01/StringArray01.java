package ex01;

public class StringArray01 {

	public static void main(String[] args) {
		String[]myArr = new String[3];
		
		myArr[0] = "kor";
		myArr[1] = "eng";
		
		for(int i = 0; i < 3; i++)
			System.out.println(myArr[i]+ " ");
		
		String str = "korea";
		String str2 = "eng";
		
		//String 메서드
		String str3 = str.concat(str2); // str3변수 값은 str값과 str2의 값을 합친 값
		
		System.out.println(str.length());        //값의 길이 출력
		System.out.println(str.isEmpty());       //값이 없을 때 true출력
		System.out.println(str.substring(3));    //값의 index번호 지정해서 지정한 번호부터 출력
		System.out.println(str.substring(1, 4)); //index1부터 4사이의 값을 출력
		System.out.println(str.concat(str2));    //(변수명1.concat(변수명2) 두 변수의 값을 합쳐서 출력
		System.out.println(str3);

	}

}
