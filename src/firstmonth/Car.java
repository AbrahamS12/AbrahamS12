package firstmonth;

	abstract class parts
	{
		    String n ;
		    parts(String n)
		    {
		    	this.n =n ;
		    	
		    }
		    abstract void function ( );
		    void f( )
		    {
		    	System.out.println(n) ;
		    }
	}
class  Brakes extends   parts
{	
	      Brakes(String n) 
	      {
	    	  super(n) ;
	      }
	      void function( )
	      {
	    	  System.out.println("car shd be halted") ;
	      }
}
class Accelerator extends   parts
{
	
	       Accelerator(String n)
	       {
	    	   super(n);
	       }
	       void function( )
	       {
	    	   System.out.println("car is accelerating") ;  
	       }
}
public class Car {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Brakes b=new Brakes("Brakes") ; b.function( );
             b.f( );
             Accelerator a=new Accelerator("Accelerator"); a.function( );
             a.f( );
}


}


