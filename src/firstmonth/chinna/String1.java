package chinna;

public class String1 {
	public static void main(String[] args) {
	     String y = "Abraham" ;
	     String s = "Abraham" ;
	     String r = new  String( "Abraham" ) ;
	    char t[ ] = { 'n' , 'e' , 'w' } ;
	    String u = new String( t ) ;
	    System.out.println( y ) ;
	    System.out.println( s ) ;
	    System.out.println( r ) ;
	    System.out.println( t ) ;
	    System.out.println( u ) ;
	    System.out.println( y . toUpperCase( ) ) ;
	    System.out.println( y . toLowerCase( ) ) ;
	    String q = " girl " ;
	    System.out.println( q ) ;
	    System.out.println( q . trim( ) ) ;
	    System.out.println( q . startsWith( " Gi " ) ) ;
	    System.out.println( q . endsWith( " ri " ) ) ; 
	    System.out.println( q . charAt( 1) ) ;
	    System.out.println( q . length ( ) ) ; 
	    String e = r . intern  ( ) ;
	    System.out.println( e ) ;
	    int a = 122 ;
	    String o = String . valueOf( a ) ;
	    System.out.println( a+12 ) ; 
	    String a1 = " my city green city " ;
	    String a2 = a1 . replace( " my " ,  " your " ) ;
	    System.out.println( a2 ) ;
	    System.out.println( a1 ) ;
	    System.out.println( y . equals ( q ) ) ;
	    System.out.println( y . equals ( s ) ) ;
	    String f = " " ;
	    System.out.println( y . isEmpty ( ) ) ;
	    System.out.println( f . isEmpty ( ) ) ;
	    System.out.println( y . equalsIgnoreCase( s) ) ;
	    String k = " ABRAHAM " ;
	    System.out.println( y . equalsIgnoreCase ( k ) ) ;
	    String A = " Girl is a good guy " ;
	    for( String A1:A . split( " \\s " ) )  {
	    System.out.println( A1 ) ;
	    }
	    
	    for( String A1:A . split( " \\s " , 1 ) )  {
	    System.out.println( A1 ) ;
	    }
	    
	    for( String A1:A . split( " \\s " , 2 ) )  {
	    System.out.println( A1 ) ;
	    }
	    
	    System.out.println( A . contains( " Girl " ) ) ;
	    
	    System.out.println( " substring starting from 6th place : " + A . substring( 5 ) ) ;
	    System.out.println( " substring starting from 6th place to 14th place : " + A . substring( 5 , 14 ) ) ;
	    System.out.println( A . compareTo( q ) ) ;
	    String h = q . concat( " is a ayyfdsertye ") ;
	    System.out.println( h ) ;
	   

}

}

