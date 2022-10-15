package task;
	import java.sql.Statement;
	import java.util.Scanner;

import firstmonth.MySqlConnection;

import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;

		public class EmployeeDBoperation {
			Connection connection;
			Statement statement;
			ResultSet resultset;
			public EmployeeDBoperation() {
				connection = MySqlConnection.getInstance();
			}
			public int insertDataWithStatement(EmployeeBean std) {
				int result = 0;
				String query = "insert into EmployeeBean values("+std.getMobileNumber()+",'"+std.getFirstName()+
						"',"+std.getAlternateMobileNumber()+",'"+std.getAadharNo()+"')";
				try {
					statement =connection.createStatement();
					result = statement.executeUpdate(query);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return result;
			}
			

			public static void main(String[] args) {
				EmployeeDBoperation db = new EmployeeDBoperation();
				Scanner sc = new Scanner(System.in);
				EmployeeBean st = new EmployeeBean();
				//System.out.println("select 1 for data storing, 2 for updation");
				//int n = sc.nextInt();
				//switch(n) {
				//case 1:
				System.out.println("mobileno");
				st.setMobileNumber(sc.nextLong());
				System.out.println("first name");
				st.setFirstName(sc.next());
				sc.nextLine();
				System.out.println("alternatenumber");
				st.setAlternateMobileNumber(sc.nextLong());
				System.out.println("aadhernumber");
				st.setAadharNo(sc.nextLong());
				db.insertDataWithStatement(st);
//				break;
//				case 2:
//				System.out.println("enter SI_no");
//				st.setSI_no(sc.nextInt());
//				System.out.println("enter name to be updated");
//				st.setName(sc.next());
//				db.update(st);
//				break;
//				//String query = "update Employee set name = '" + emp.getName() + "', salary = " + emp.getSalary() + ", address ='" + emp.getAddress() + "' where id = "+emp.getId()+";";
				}

			}

		//}

