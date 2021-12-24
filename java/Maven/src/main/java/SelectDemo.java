
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import maven.DbConnection;

public class SelectDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		
		Connection co=DbConnection.getConnection();
		//step:- 3 insert the data into the table  or write sql query 
		
		//select the data 
		
		String select="SELECT * FROM employee";
		
		// get carrier 
		PreparedStatement ps= co.prepareStatement(select);
		
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			double salary = rs.getDouble("salary");

			System.out.println(id + ", " + name + ", " + age + ", " + salary);
		}
		
		
		// close the connections 
		rs.close();
		ps.close();
		
		co.close();
		
		
	}

}
