package chinna;

public class Overloading {
	long z ;
	public void Substraction ( ) {
	         long x=1000 ,  y=385 ;
	         System.out.println( "x-y" ) ;
	}
	public void Substraction ( long x ,  long y ) {
		     System.out.println( x-y ) ;
		     
	}
	public  long  Substraction ( long x ,  long y ,  long z ) {
	         return x-y-z ;         
	}
		public static void main(String[] args) {
		Overloading obj=new  Overloading( ) ;
		//Overloading obj=new Overloading( ) ;
	    obj.Substraction  ( ) ;
	    obj.Substraction ( 1000 , 385 ) ;
	    long ret = obj.Substraction ( 1000 , 385 , 500 ) ;
	    System.out.println ( ret ) ;
		}

	}

