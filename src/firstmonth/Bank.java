package firstmonth;

public class Bank{

	static int CurrentBalance = 1000;
	public static void greetcustomere () {
		System.out.println("hello welcome banking");
	}
	public void deposit(int amount) {
		CurrentBalance = CurrentBalance + amount ;
		System.out.println("amount is deposited");
	}
	public static void withdrawal( int amount) {
		CurrentBalance = CurrentBalance - amount ;
		System.out.println("amount is withdral succesfull");
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank ();
		bank.deposit(CurrentBalance);
		bank.withdrawal(CurrentBalance);
		bank.deposit(500);
	}

}
