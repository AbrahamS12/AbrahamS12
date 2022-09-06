package firstmonth;

	import java.util.ArrayDeque ;
	import java.util.Deque ;

	public class Example1Deque {

		public static void main(String[] args) {
			  Deque<String> a = new ArrayDeque<String>( ) ;
			     a.add("abraham") ;
		          a.add("devamani") ;
		         a.add("poojitha") ;
		         a.add("vemula") ;
		         
		         for(String  str : a  )     {
		        
		         System.out.println(str);
		         }

		}

	}

