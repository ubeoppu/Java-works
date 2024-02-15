import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysFunction {

	public static void main(String[] args) {
		
		int[]arr = new int[10];
		int[]arr2;
		int[]arr3;
		
		Arrays.setAll(arr, f -> (int)(Math.random()*5)+1);
		System.out.println("Arrays.setAll"+Arrays.toString(arr));
		
		Arrays.fill(arr, 10);
		System.out.println("Arrays.fll"+Arrays.toString(arr));
		
		arr2 = Arrays.copyOf(arr, 5);
		System.out.println("Arrays.copyOf:"+Arrays.toString(arr2));
		arr3 = Arrays.copyOfRange(arr, 2, 7);
		System.out.println("Arrays.copyOfRange:"+Arrays.toString(arr3));
		
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		list = Arrays.asList(10,20,30,40,50,60); //리스트 초기화 메서드. 단 값 추가 못함.
		System.out.println("Arrays.asList:"+list);
		
//		list.add(40); //값을 추가 못하므로 에러
//		System.out.println(list);
		System.out.println("-----------------------------------");
//		list = new ArrayList(list);//값을 추가하려면 다시 ArrayList로 변경해야한다.
		list = new ArrayList(Arrays.asList(10,20,30,40,50,60));
		list.add(60);
		list.add(50);
		System.out.println(list);
		
		

	}

}
