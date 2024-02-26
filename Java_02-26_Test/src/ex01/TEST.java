package ex01;

import java.util.ArrayList;
import java.util.List;

public class TEST {
public static void main(String[] args) {
	List<Integer>list = new ArrayList();


//	for(int i = 1; i <= 45; i++) 
//	list.add(i);
	for(int i =0; i < 6; i++) {
	int ran = (int)(Math.random()*45)+1;
	list.add(ran);
	}
	
	for(int a : list) {
	System.out.print(a +",");
	}
	System.out.println((integer)list[0]);
}
}