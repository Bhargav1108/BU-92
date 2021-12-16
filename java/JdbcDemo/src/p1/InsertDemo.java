package p1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import p2.DbConnection;

public class InsertDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		
		Connection co=DbConnection.getConnection();
		//step:- 3 insert the data into the table  or write sql query 
		
		String insert="INSERT INTO employee(name,age,salary) VALUES(?,?,?)"; // insert the data 
		
		
		
		// get carrier 
		PreparedStatement ps= co.prepareStatement(insert);
	
		ps.setString(3,"Pritam");
		ps.setInt(2, 22);
		ps.setDouble(3,27000); 
		
		// execute the sql query 
		ps.execute();
		
		System.out.println("Inserted Successfully");
		
		// close the connections 
		
		ps.close();
		
		co.close();
		
		
	}

}
