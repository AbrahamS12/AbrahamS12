package chinna;

public class Stringbuilder2 {
	public static void main(String[] args) {
	     long startTime = System.currentTimeMillis ( ) ;  // time
	     StringBuilder sb = new StringBuilder ( ) ;           //object
	     for ( int  i=0;   i<10000;  i++ )  {                         //loop
	    	      sb.append( " vtalent " ) ;                               //value append
	     }
        System.out.println( " Time  taken for stringbuilder: "+( System.currentTimeMillis ( )-startTime)+" ms" ) ;
        
      //  startTime = System.currentTimeMillis( ) ;
     //   StringBuffer sb2 = new StringBuffer( ) ;
     //   for( int i=0;  i<10000; i++ )   {
     //  	     sb.append( " vtalent " ) ;
     //   }   
     //   System.out.println( " Time  taken for stringbuffer: "+( System.currentTimeMillis ( )-startTime)+" ms" ) ;

	

	}

}

