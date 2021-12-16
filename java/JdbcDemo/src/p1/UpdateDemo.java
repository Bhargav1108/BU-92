package p1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import p2.DbConnection;

public class UpdateDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		
		Connection co=DbConnection.getConnection();
		//step:- 3 insert the data into the table  or write sql query 
		
		 // upDATE the data 
		
		String update="UPDATE employee SET salary=? WHERE name=?";
		
		// get carrier 
		
		
		PreparedStatement ps= co.prepareStatement(update);
		
		ps.setDouble(1,58000);
		ps.setString(2,"Bhargav");
		
		
		
	
		// execute the sql query 
		ps.execute();
		
		System.out.println("Data Updated Successfully");
		
		// close the connections 
		
		ps.close();
		
		co.close();
		
		
	}

}
