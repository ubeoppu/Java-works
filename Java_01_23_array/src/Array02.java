
public class Array02 {

	public static void main(String[] args) {

		//1. int형 배열 생성후 랜덤(1~100)이용해서 배열 크기 10값 저장
		//2. 그 배열 총점, 평균 구하기
		
		double avg = 0;
		int total = 0;
		
		int[]arrNum = new int[5];
		
		//1~100이 값을 랜덤하게 추출해서 저장
		for(int i=0; i <arrNum.length; i++) {
			int num = (int)(Math.random()*100)+1;
			arrNum[i] = num;
		}
		
		//배열 10개 출력
		for(int i = 0; i<arrNum.length; i++)
			System.out.println(arrNum[i] + " ");
		
		System.out.print("\n----------------------------------\n");
		
		
		for(int i = 0; i<arrNum.length; i++) 
			total += arrNum[i];
			System.out.println("총점:" + total +", 평균:" + (double)total/arrNum.length);
			
			System.out.print("\n----------------------------------\n");
			
			
			//최대값 구하기
			//int[]arrNum = new int[10];
			int max = 0;
			for(int i = 0; i<arrNum.length; i++) {
				
				if(arrNum[i] >max) {
				max = arrNum[i];
						
			}
			}
				System.out.println("최대값:" + max);
				
				
				System.out.print("\n----------------------------------\n");
				
				
				for(int i = 0; i<arrNum.length; i++) {       //배열 수 만큼 5번 반복
					for(int j = i+1; j <arrNum.length;j++) {  // 0: 79 , 1: 97, 2:45 , 3: 77, 4:32  4번 반복
						int tmp;		
						if(arrNum[i] < arrNum[j]) { //큰 수면 뒤쪽 배열로 넘김
						tmp = arrNum[i];
						arrNum[i] = arrNum[j];
						arrNum[j] =tmp;
					}
					}
				}
			
				for(int i =0; i<arrNum.length; i++)
					System.out.print(arrNum[i] + " ");
				}
			}
	
	


