package ex02;

public class Test07 {
//문제 숫자 맞추기 게임: 1~100사이의 값 중 랜덤하게 있는 수 맞추기
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
        int count = 0;
        int input;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요:");
            input = s.nextInt(); // input .

            if (input == answer) {
                System.out.println("정답!");
                System.out.println("시도횟수:" + count);
                break;                         //do ~ while문 탈출, 종료

            } else if (input < answer) {
                System.out.println("더 큰 값을 입력하세요.");

            } else if (input > answer) {
                System.out.println("더 작은 값을 입력하세요.");
            }
        } while (true);  //do ~ while문 조건식이 참이면 do 실행코드 한번 더 실행
    }
}