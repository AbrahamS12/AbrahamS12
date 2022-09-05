package chinna;

	import java.util.Iterator ;
	import java.util.PriorityQueue ;

	public class Example1Queue {

		public static void main(String[] args) {
			PriorityQueue<String> a = new PriorityQueue<String>( ) ;
		     
		      a.add("abraham") ;
	          a.add("devamani") ;
	         a.add("poojitha") ;
	         a.add("vemula") ;
	         System.out.println("head:"  +a.element( ) );
	         System.out.println("head:"+a.peek( ) );
	       
	       Iterator itr = a.iterator ( ) ;
	       while(itr.hasNext( ) )   {
	      	      System.out.println(itr.next( ) ) ;
	       }

		}

	}

