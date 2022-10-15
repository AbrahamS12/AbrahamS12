package practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> op = new HashSet<String>();
		op.add("deva");
		op.add("nana");
		op.add("chinna");
		op.add("amma");
		System.out.println(op);
		Iterator gu = op.iterator();
		while(gu.hasNext()) {
			
			System.out.println(gu.next());
		}
		
	}

}
