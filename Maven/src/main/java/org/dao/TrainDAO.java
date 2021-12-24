package org.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.Train;

public class TrainDAO {
	
	private static final String TRAIN_NAME="trains";
	public void save(Train train) throws SQLException {
		// save train object in the data base 
		Connection con = DbConnection.getConnection();
		String insert="INSERT INTO trains VALUES(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(insert);
		
		ps.setInt(1,train.getTrainNo());
		ps.setString(2, train.getTrainName());
		ps.setString(3, train.getSource());
		ps.setString(4, train.getDestination());
		ps.setDouble(5, train.getTikectPrice());
		
		ps.execute();
		
		ps.close();
		con.close();
		System.out.println("Data Saved Succesfully");
		
	}
	
	public void update(Train train) throws SQLException {
		// update train object in the data base 
		Connection con = DbConnection.getConnection();
		String update="UPDATE trains SET Train_Name=?,Source=?,Destination=?,Ticket_fare=? WHERE =?";
		PreparedStatement ps=con.prepareStatement(update);
		
		
		ps.setString(1, train.getTrainName());
		ps.setString(2, train.getSource());
		ps.setString(3, train.getDestination());
		ps.setDouble(4, train.getTikectPrice());
		ps.setInt(5,train.getTrainNo());
		ps.execute();
		
		ps.close();
		con.close();
		System.out.println("Data Upadated Succesfully");
		
		
	}
	public void delete(Train train) throws SQLException {
		// delete train object in the data base 
		Connection con = DbConnection.getConnection();
		String update="DELETE FROM"+ TRAIN_NAME+"WHERE Train_no=? ";
		PreparedStatement ps=con.prepareStatement(update);
	
		ps.setInt(1,train.getTrainNo());
		ps.execute();
		
		ps.close();
		con.close();
		System.out.println("Deleted Successfully");
	}
	public List<Train> getAll() throws SQLException {
		//get all train details in the data base
		
		List<Train> trains=new ArrayList();
		Connection con=DbConnection.getConnection();
		String getll="SELECT * FROM "+TRAIN_NAME;
		PreparedStatement ps=con.prepareStatement(getll);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			
			
			int trainno =rs.getInt("trainno");
			String trainname=rs.getString("trainname");
			String source=rs.getString("source");
			String destination=rs.getString("destination");
			double ticketfare=rs.getDouble("ticketfare");
			
			Train train=new Train(trainno,trainname,source,destination,ticketfare);
			trains.add(train);
	}
	rs.close();
	ps.close();
	con.close();
	return trains;
		
	}
	
	public	Optional<Train> findTrain(int trainNo) throws SQLException {

		String select = "SELECT * FROM " + TRAIN_NAME + " WHERE Train_no=?";

		Train train = null;
		
		Connection con = DbConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(select);

			ps.setInt(1, trainNo);

			ResultSet rs = ps.executeQuery();
			
			

			if (rs.next())

			{

				String trainName = rs.getString("Train_Name");
				String source = rs.getString("Source");
				String destination = rs.getString("Destination");
				double ticketPrice = rs.getDouble("Ticket_fare");

				train = new Train(trainNo, trainName, source, destination, ticketPrice);

				
			}
			if(train==null) {
				return Optional.empty();
			}
			rs.close();
			ps.close();
			con.close();

		return Optional.of(train);
	}

	public void populateTrainTable() throws SQLException {
		Train train2 = new Train(1012, "Shatabdi Express", "Delhi", "Bangalore", 2500);
		Train train3 = new Train(1013, "Udyan Express", "Bangalore", "Mumbai", 1500);
		Train train4 = new Train(1014, "Udyan Express", "Mumbai", "Bangalore", 1500);
		Train train5 = new Train(1015, "Brindavan Express", "Bangalore", "Chennai", 1000);
		Train train6 = new Train(1016, "Brindavan Express", "Chennai", "Bangalore", 1000);


		save(train2);
		save(train3);
		save(train4);
		save(train5);
		save(train6);
   System.out.println("Data populated succesfully");
	}

}