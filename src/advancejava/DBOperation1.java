package advancejava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import firstmonth.Employee;
import firstmonth.MySqlConnection;

public class DBOperation1 {

	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public DBOperation1() {
		connection = MySqlConnection.getInstance();
		
	}

	public int insertDataWithStatement(Employee emp) {
		int result =0;
	       String query = "insert into Employee values(" +emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getAddres()+"')";
	       
	       try {
			statement= connection.createStatement();
			result = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	           		  
	}
	public int deletedata(Employee emp) {
		int result =0;
		String query = "delet from Employee where id = "+emp.getId()+"";
		try {
		statement = connection.createStatement();
		result = statement.executeUpdate(query);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return result;
	
		
	}
	
	public static void main(String[] args) {
		DBOperation1 db = new DBOperation1();
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("please enter your choice= \n"+
		"1.insert employee data \n"+
		"2.delete employee data ");			
		int n = sc.nextInt();
			
		Employee em = new Employee();
		
		switch(n) {
		case 1:
		
		System.out.println("Please enter emp id");
		em.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Please enter emp name");
		em.setName(sc.nextLine());
		
		System.out.println("Please enter emp salary");
		em.setSalary(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Please enter emp addres");
		em.setAddres(sc.nextLine());
		db.insertDataWithStatement(em);
		
	
		
break;
case 2:
	
	System.out.println("Please enter id to be deleted");
	em.setId(sc.nextInt());
	db.deletedata(em);

		}
}
	
	}
}
