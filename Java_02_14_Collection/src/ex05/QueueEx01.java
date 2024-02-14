package ex05;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx01 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개만 저장되도록 함.

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				//화면으로부터 라인 단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); //trim()공란 제거.
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) { //입력받은 input가 q라면 true
					System.exit(0);               //System.exit(0); 실행 즉 실행 종료
				}
				if(input.equalsIgnoreCase("help")) {  //입력받은 input가 help라면 true
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");
					
				}else if(input.equalsIgnoreCase("history")) { //입력받은 input가 history라면 true
					int i = 0; //지역변수 생성
					//입력받은 명령어를 저장.
					save(input); //save호출 및 입력받은input값 대입
					//LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList)q; //LinkedList q에 주소를 LinkedList tmp가 참조하게 된다.
					ListIterator it = tmp.listIterator(); ////반복자Iterator 참조변수명 it가 tmp List를 참조하게 된다.
					
					//       반복자의 메소드
					while(it.hasNext()) //Iterator가 다음 요소를 가지고 있으면 true
						System.out.println(++i+"."+it.next()); //
				}else {
					save(input);
					System.out.println(input);
				}//if(input.equalsIgnoreCase("q")){
			}catch(Exception e) {
				System.out.println("입력 오류 입니다.");
			}
		}//while(true)
	}//main()

	public static void save(String input) {
		//queue에 저장한다
		if(!"".equals(input)) //만약 input가 공백이 아니라면 true
			q.offer(input);   //q queue에 input을 offer해라.
		
		//queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE) //size()는 Collection인터페이스에 정의
			q.remove();
	}
}
