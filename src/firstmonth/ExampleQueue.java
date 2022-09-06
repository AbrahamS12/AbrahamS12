package firstmonth;

	import java.util.Iterator ;
	import java.util.PriorityQueue ;

	public class ExampleQueue {

		public static void main(String[] args) {
			     PriorityQueue<String> a = new PriorityQueue<String>( ) ;
			     
			      a.add("abraham") ;
	             a.add("devamani") ;
	             a.add("poojitha") ;
	             a.add("vemula") ;
	             System.out.println(a.element( ) );
	             System.out.println(a.peek( ) );
	             
	             Iterator itr = a.iterator ( ) ;
	             while(itr.hasNext( ) )   {
	            	      System.out.println(itr.next( ) ) ;
	             }
		}

	}



