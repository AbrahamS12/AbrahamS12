package advancejava;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class MYSQLConnection {
		private static  MYSQLConnection mysqlconnection = new MYSQLConnection();
		
		Connection connection;
		
		private MYSQLConnection () {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrm","root","abraham@nixt1997");
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getInstance() {
			return mysqlconnection.connection;
		}
	 public static void main(String[] args) {
		System.out.println(mysqlconnection.getInstance());
	} 
	 
	 
	}


