package ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList01 {

	public static  void main(String[] args) {
		//ArrayList와 LinkedList는 두 클래스의 상위 클래스인 List를 사용하자
//		ArrayList와 LinkedList는 사용법이 같지만 저장되는 메모리구조가 다르다.
//		ArrayList <String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
//		List는 for문을 이용해서 출력하는게 제일 좋음
		List<String>list = new ArrayList<String>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		for(int i = 0; i < list.size(); i++) 
			System.out.print(list.get(i)+ " ");
			System.out.println();
			
			for(String str : list) //향상된 for문 사용
				System.out.print(str+ " ");
		
			list.remove(0);
			
			//arraylist는 앞자리가 삭제되면 뒤 데이터들이 전부 앞으로 한칸씩 이동한다.
			//따라서 arraylist는 빈번한 삭제가 있는 경우에는 속도가 저하 될 수 있다.
			System.out.println(list);
		
		

	}

}
