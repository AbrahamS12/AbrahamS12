package practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queueprioritytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> a = new PriorityQueue<String>();
		a.add("abraham");
		a.add("krupa");
		a.add("china");
		a.add("chiru");
		System.out.println(a.element());
		System.out.println(a.peek());
		
		Iterator<String> op = a.iterator();
		while(op.hasNext()) {
			System.out.println(op.next());
			
		}
	}

}
