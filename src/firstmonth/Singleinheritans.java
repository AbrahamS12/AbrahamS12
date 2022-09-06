package firstmonth;

public class Singleinheritans {
	static int run( int a , int b ) {
	    return a+b ;
 }
 static  double run( float c, double d, double e )  {
	    return c-d*e ;
 }
//static void run ( ) {
       //System.out.println( "abraham" ) ; //here run method does not returm any value 
 // }
 public void run( )  {
	      System.out.println( " system " ) ;
 }
 public int run( int a )  {
	     return a ;
 }
 public float run( float a, float b, float c ) {
	      System.out.println( a-b+c ) ;
	      return a-b+c ;
 }
 
public static void main(String[] args) {
	     Singleinheritans z = new Singleinheritans ( ) ;
         int R = run( 2,3 ) ;
         double T = run( 0.1f , 0.22 , 0.31 ) ;
         System.out.println(R) ;
         System.out.println(T) ;
         //run( ) ; //no obj is needed to call static run method
         z.run( ) ; //obj is  needed to call non-static  run method 
         z.run( 56.9f,90.8f,98.9f ) ;
         System.out.println( run( 13,56 )) ;
         System.out.println( z.run( 89 )) ; //need obj for  non  static  method run

}

}


