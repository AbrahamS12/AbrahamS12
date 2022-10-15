package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1,"jevan");
		map.put(2,"deva");
		map.put(3,"poja");
		map.put(4,"abraham");
		map.put(5,"null");
		
		//generic
		for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());

	}
	}

}
