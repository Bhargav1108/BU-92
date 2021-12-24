package org.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.Passenger;
import org.Train;

public class PassengerDAO {
	
	
	public void save(Passenger passenger) throws SQLException {
		// save train object in the data base 
		Connection con = DbConnection.getConnection();
		String insert="INSERT INTO passenger(Name,Age,Gender) VALUES(?,?,?)";
		PreparedStatement ps=con.prepareStatement(insert);
		
	
		ps.setString(1, passenger.getName());
		ps.setInt(2, passenger.getAge());
		ps.setString(3, passenger.getGender());
		
		ps.execute();
		
		ps.close();
		con.close();
		System.out.println("Data Saved Succesfully");
		
		
	}
	
	public void update(Passenger passenger) throws SQLException { 
		// update train object in the data base 
				Connection con = DbConnection.getConnection();
				String update="UPDATE passenger SET Name=?, Age=?,Gender=? WHERE id=?";
				PreparedStatement ps=con.prepareStatement(update);
				
				
				ps.setString(1, passenger.getName());
				ps.setInt(2,passenger.getAge());
				ps.setString(3, passenger.getGender());
				ps.setInt(4, passenger.getId());
				
				ps.execute();
				
				ps.close();
				con.close();
				System.out.println("Data Upadated Succesfully");
				
		
	}
	
	public void delete(Passenger passenger) throws SQLException {
		// delete train object in the data base 
		Connection con = DbConnection.getConnection();
		String update="DELETE FROM passenger WHERE id=? ";
		PreparedStatement ps=con.prepareStatement(update);
	
		ps.setInt(1,passenger.getId());
		ps.execute();
		
		ps.close();
		con.close();
		System.out.println("Deleted Successfully");
		
	}
	public List<Passenger> getAll() throws SQLException {
		// save train object in the data base
		List<Passenger> passenger=new ArrayList();
		Connection con=DbConnection.getConnection();
		String getll="SELECT * FROM passenger";
		PreparedStatement ps=con.prepareStatement(getll);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			
			
			int id=rs.getInt("id");
			String name=rs.getString("Name");
			int age=rs.getInt("Age");
			String gender=rs.getString("Gender");
		
			
			Passenger passengers=new Passenger(id,name,age,gender);
			passenger.add(passengers);
	}
	rs.close();
	ps.close();
	con.close();
	return passenger;
		
	}
	
	public Optional<Passenger> getOne(int id) throws SQLException {
	
		
		String select = "SELECT * FROM passenger WHERE id=?";

		Passenger passenger = null;

		Connection con = DbConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(select);

			ps.setInt(1,id);

			ResultSet rs = ps.executeQuery();

			if (rs.next())

			{
				String name=rs.getString("name");
				int age= rs.getInt("Age");
				String gender = rs.getString("Gender");

				passenger = new Passenger(name,age,gender);

			}

			rs.close();
			ps.close();
			con.close();

		return Optional.of(passenger);
	
}
}
