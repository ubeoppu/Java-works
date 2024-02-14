package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		//중복 저장이 불가능하다. , 순서가 없다.
		Set<String> set = new HashSet<String>();
		
		set.add("Robot");
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		set.add("Robot");
		
		Iterator<String> it = set.iterator(); //반복자를 이용해서 set안 데이터를 출력시킴 
		
//	while(it.hasNext()) {
		do {
		System.out.print(it.next() + '\t');
		}
		while(it.hasNext());
		System.out.println();
	}


}
