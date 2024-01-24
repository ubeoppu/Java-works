package ex02;

public class Test04m {

	public static void main(String[] args) {
		
		int result;
		int count;
		
		for(int i = 1; i < 10000; i++) {
			count =+ i;    //몇번 반복했는지 카운트
		
		for(int j = 1; j <= i; j++) {
			
			if(j % 2 == 1) { //홀수일때
				result =+ j;
			}else {
				result =- j;
			}
			if(result == 100) {
				break;
			}
		
		}
			System.out.println("몇번째인가:" +count);
			break;
			}
		return;
		}
}

