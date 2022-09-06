package firstmonth;

public class Value {
	int  a ;
	int  b ;
private  static void add (int   s ,   int   t) { //para
	
        	s = 10 ;
        	System.out.println( "Result  from  method :   "+(s+t) ) ;
          }

public static void main(String[] args)  {
         Value   op=new   Value ( ) ;
     op . a=2 ; op.b=3 ;
System.out.println( "bfore  passing :   "+( op .  a + op . b ) ) ;
add ( op .a , op .b ) ; //args
System.out.println( "after  passing :   "+( op . a + op . b ) ) ; 
}

}
