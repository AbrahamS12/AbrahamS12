package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList<String> a = new LinkedList<String>();
		
		a.add("abraham");
		a.add("abraham");
		a.add("abraham");
		a.add("abraham");
		a.add("abraham");
		
		Iterator l = a.iterator();
		while (l.hasNext()) {
		System.out.println(a);

	}
	}
}
