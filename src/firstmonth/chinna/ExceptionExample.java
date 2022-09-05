package chinna;

	public class ExceptionExample {
		
	     int k ;
	     int [ ] arr = new int[ 5];
	     String st ;
	     
	     public void function ( )  {
                 try {
               	  k=1/5 ;
               	  arr[5] = 8 ;
               	  char ch = st.charAt(0) ;
                 }catch(ArithmeticException e) {
               	  System.out.println(e);
               	  
                 }catch(NullPointerException n) {
               	  System.out.println(n);
               	  
                 }catch(Exception f) {
               	  System.out.println(f);
                 }
	     }
	public static void main(String[] args) {
		
            ExceptionExample ee = new ExceptionExample ( );
	}

}



