package practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> pu = new TreeSet<String>();
		pu.add("koti");
		pu.add("raju");
		pu.add("latha");
		pu.add("ramy");
		System.out.println(pu);
		
		Iterator<String> je = pu.iterator();
		
		while(je.hasNext()) {
			System.out.println(pu);
		}
		
		
		

	}

}
