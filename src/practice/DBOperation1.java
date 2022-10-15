package practice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBOperation1 {

	Connection connectio;
	Statement statement;
	ResultSet resultset;
	
	
	public DBOperation1(Connection connection) {
		
		 connection = MySqlConnection1.getInstance();
	}
	
	public int insertDataWithStatement(Employee1 emp) {
		int result =0;
		String quary = "insert into Employee1 values(" +emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getAddress()+"'+)";
		try {
			Connection connection = null;
			statement = connection.createStatement();
			result = statement.executeUpdate(quary);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
