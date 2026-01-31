package repositories;
import java.sql.*;

public class DBConnection {
	
	static final String JDBC_DRIVER = "org.postgresql.Driver";
	static final String DB_PATH = "jdbc:postgresql://localhost:5432/jspDemo";
	static final String USER = "postgres";
	static final String PASS = "admin";
	
	public static Connection createConnection() throws ClassNotFoundException, SQLException {

			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_PATH, USER, PASS);
			return connection;		
	}
	

}
