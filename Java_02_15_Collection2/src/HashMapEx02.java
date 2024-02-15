import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		Set set = map.entrySet(); //HashMap에 저장된 키와 값을 엔트리 형태(Entry는 key와 값을 결합 시킴)로 Set에 저장해서 반환
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Entry e = (Map.Entry)it.next();  //Entry는 key와 값을 결합 시킴.
			System.out.println("이름:" + e.getKey()+", 점수:" + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단:" +set);
		
		Collection values = map.values(); //HashMap에 저장된 모든 값을 컬렉션의 형태로 반환
		it = values.iterator();
		
		int total =0;

	}

}
//132