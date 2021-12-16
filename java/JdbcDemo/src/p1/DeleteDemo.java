package p1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import p2.DbConnection;

public class DeleteDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		
		Connection co=DbConnection.getConnection();
		//step:- 3 insert the data into the table  or write sql query 
		
		String del="DELETE FROM emp WHERE name=?";
		
		// get carrier 
	
		
		PreparedStatement ps= co.prepareStatement(del);
		
		ps.setString(1,"Pritam");
		
	
		// execute the sql query 
		ps.execute();
		
		System.out.println("Deleted successfully");
		
		// close the connections 
		
		ps.close();
		
		co.close();
		
		
	}

}
