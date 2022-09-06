package firstmonth;

	class  Animal1
	{
		  void printA( )
		   {
			System.out.println( " animal is runnig " ) ;
		   }
		   
	}
	class  Dogs extends Animal1 {
		  void printD( )
		   {
			System.out.println( " Dog is barking " ) ;
		   }
		   
	}
	class  Labradors  extends Dogs
	{
		  void printL( )
		   {
			System.out.println( " Lab is in brown color " ) ;
		   }
		   
	}
	public class Test {

		public static void main(String[] args) {
		   
	Labradors L=new Labradors( ) ;
	L . printD( ) ;
	L . printA( ) ;
	L . printL( ) ; 

		}

	}



