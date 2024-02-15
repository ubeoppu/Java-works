package ex03;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
	public static void main(String[] args) {
		
		Map<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(33, "Toy");
		map.put(47, "Box1");
		map.put(67, "Robot");
		map.put(47, "Box2");// 키가 중복되면 기존거 덮어쓴다.
		map.put(33, "Toy2");
		
		System.out.println(map.get(33));
		
		map.remove(33);
		
		System.out.println(map.get(33));
	}

}
