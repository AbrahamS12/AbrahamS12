package practice;

import java.util.Scanner;

public class ScannerExample {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter you are name");
		String name = sc.nextLine();

		System.out.print("Name = "+name);
		
		System.out.print("enter you are Id");
		int i = sc.nextInt();
		System.out.print("ROLL no = "+i);
		
		System.out.print("enter you are salay");
		double d= sc.nextDouble();
		System.out.print("Salary ="+d);
		sc.close();
		
		
		
		
		
		
		
		
	}

}
