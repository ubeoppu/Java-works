public class Array01 {
	public static void main(String[] args) {
		int sum;
		
		int[]arrNum = new int[5]; //int형 배열 생성
		
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[3] = 40;
		arrNum[4] = 50;
		for(int i = 0; i<5; i++)
			System.out.print(arrNum[i] + " ");
		
		
		System.out.println("\n-----------------");

		
		//int[]arrNum2 = {10, 20, 30, 40, 50, 60};
		int[]arrNum2 = new int[]{10, 20, 30, 40, 50, 60};
		
		for(int i = 0; i<6; i++)
			System.out.print(arrNum2[i] + " ");
	
		
		System.out.println("\n-----------------");
		
	
		int[]arrNum3 = {10, 20, 30, 40, 50, 60, 70, 80};
		arrNum3[0] = 5;
		
		System.out.println("배열 길이:" + arrNum3.length);
		for(int i = 0; i<arrNum3.length; i++)
			
			System.out.print(arrNum3[i] + " ");

		System.out.println("");
		int arr[][] = {{100, 200}, {300, 400}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
				
				System.out.println("\n-----------------");

				char data[] = {'j', 'a', 'v', 'a'};
				for(int i1 = 0; i1 < data.length; i1++) {
					System.out.print(data);
				}
			}
		}
	}
}
