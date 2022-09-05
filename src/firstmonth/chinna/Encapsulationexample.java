package chinna;

public class Encapsulationexample {
	private  String name ;
	private  int  rollNo ;
	String subject ;
	       void setName (String name) {
	    	this.name  =  name ;
	       }
	       String  getName ( )  {
	    	   return  name ;
	       }
	       
		   public static void main(String[] args) {
			   Encapsulationexample s  =  new Encapsulationexample ( ) ;
			   s.setName("Abraham") ;
			   System.out.println ( s.getName( )) ;
			   s.rollNo=12 ;
			   System.out.println ( s.rollNo=14 ) ;
	           }
	}
	 

