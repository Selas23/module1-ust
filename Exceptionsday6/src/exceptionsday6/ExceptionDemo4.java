package exceptionsday6;
import java.sql.*;
import java.sql.DriverManager;

public class ExceptionDemo4 {

	static void method() throws SQLException{
		
		throw new SQLException("connection failed");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		//DriverManager.getConnection("");
	}

}
