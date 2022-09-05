package chinna;

	import java.util.Stack;
	import java.util.Iterator ;

	public class ExampleStack {

		public static void main(String[] args) {
//			         int array[ ] = {1,2,3,4,5,6} ;
//			         for(int i=0;  i<array.length; i++)   {
//			    	 System.out.println(array[i] ) ;
//			         }
			    	 
			   
			         Stack<String> s = new  Stack<String>( ) ;
			           s.push("abraham") ;
		               s.push("devamani") ;
		               s.push("poojitha") ;
		               s.push("vemula") ;
//		               s.pop( ) ;
//	               s.push(Object   o)
		               
		               Iterator<String> it  =  s.iterator ( ) ;
		          
		               while(it.hasNext( ) ) {
		               System.out.println(it.next( ) ) ;
	                  
		               }
		}
}
