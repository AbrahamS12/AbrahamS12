package practice;

import java.util.Iterator;
import java.util.Stack;

public class Stacktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> p = new Stack<String>();
		p.push("abraham");
		p.push("syam");
		p.push("devamani");
		p.push("china");
	//	p.pop();
		
		Iterator<String> g = p.iterator();
		while(g.hasNext()) {
		System.out.println(g.next());
	}
	}
}
