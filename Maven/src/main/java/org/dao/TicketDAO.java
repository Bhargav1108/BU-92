package org.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.Ticket;
import org.*;
import org.main.*;

public class TicketDAO {
	
	
public void ticketSave(Ticket ticket) throws SQLException, FileNotFoundException {
	
	//String path = "C:\\Users\\bhargav_mandadi\\Desktop\\Tickets\\" + ticket.getPnr() + ".txt";

	Passenger passenger=new Passenger();
	
//	InputStream input=new FileInputStream(new File(path));
	Connection con=DbConnection.getConnection();
	String insert="INSERT INTO tickets(Pnr,Train_No,TravelDate,Passenger_Name,Passenger_Age,Passenger_Fare)Values(?,?,?,?,?,?)";
	
	PreparedStatement ps=con.prepareStatement(insert);

	ps.setString(1, ticket.getPnr());
	ps.setInt(2,ticket.getTrain().getTrainNo());
	ps.setDate(3,null);
	ps.setString(4,passenger.getName());
	ps.setString(5, passenger.getGender());
	ps.setDouble(6,ticket.calcPassengerFare(passenger));
	ps.execute();
	ps.close();
	con.close();
	System.out.println("Tickets Saved Succefully");
	
}

}
