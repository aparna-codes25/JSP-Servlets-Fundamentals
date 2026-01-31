package services;

import java.sql.*;

import entities.Employee;
import repositories.DBConnection;

public class EmployeeService {
	
	Connection conn;
	
	public EmployeeService() {
		try {
			conn = (Connection) DBConnection.createConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String saveEmployee(Employee employee){
		String saveQuery = "INSERT INTO employee VALUES(?,?,?,?,?)";
		try (PreparedStatement stmt = this.conn.prepareStatement(saveQuery)){
			stmt.setString(1,employee.getFirstName());
			stmt.setString(2,employee.getLastName());
			stmt.setString(3, employee.getEmployeeId());
			stmt.setInt(4, employee.getAge());
			stmt.setDouble(5, employee.getSalary());
			
			if(stmt.executeUpdate() >= 1) {
				return "Registered successfully";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Error occurred. Please try again";
		
	}

}
