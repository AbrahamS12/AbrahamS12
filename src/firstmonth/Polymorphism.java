package firstmonth;

public class Polymorphism {
	int  c ;
    public void add ( ) {
    	int  a=12 ;
    	int  b= 25 ;
    	System.out.println( " sum of a and b ; "+(a+b)) ;
        }
    public void  add(  int  a , int  b) {
    	System.out.println( a+b) ;
    	
    }
    public   int    add( int  a, int  b, int  c )  {
    	     return  a+b+c ;
             }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Polymorphism d=new  Polymorphism ( ) ;
                               d.add( ) ;
                               d.add( 12,25 ) ;
                               int ret   =d.add(12, 25, 35) ;
                               System.out.println( ret ) ;
     	}

}

