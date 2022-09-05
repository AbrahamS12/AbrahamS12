package firstmonth;

import java.util.Scanner;

public class UseInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name");
		String name = scanner.nextLine();
		System.out.println("Hey %S, how are you?\n");
		String status = scanner.nextLine();
		System.out.println("what is your age");
		int age = scanner.nextInt();
		System.out.println("Tanque for information");
		
	}

}
