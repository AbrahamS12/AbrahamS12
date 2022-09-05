package chinna;

	import java.util.Iterator ;
	import java.util.HashSet ;
	 
	public class Example2HashSet {
		

		public static void main(String[] args) {
			
			HashSet<String>set = new HashSet<String>( ) ;
	//   LinkedHashSet<String> is = new LinkedHashSet<String> ( ) ;		
		    
		   set.add( " java" ) ;
		   set.add("collection" ) ; 
		    set.add( " java " ) ;
		   set.add( "set " ) ;
		   System.out.println(set);
		    
//		 Iterator<String> i = set.iterator( ) ;
		//    while( i.hasNext( ) )  {
		//    	System.out.println( i.next( ) ) ;
		 //   }

		}

}
