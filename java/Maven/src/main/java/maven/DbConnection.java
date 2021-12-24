package maven;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection  getConnection() {
		
		try {
		
			// Step:- 1   first load the driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		// Step:- 2 Establish the conncetion with local workbench 
				
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Bhargav@1108");
			return con;
		}
		catch(Exception e) {
			
			e.printStackTrace();
			return null;
			
		}
	}

}
