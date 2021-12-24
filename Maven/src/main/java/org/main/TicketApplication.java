package org.main;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import org.Passenger;
import org.Ticket;
import org.Train;
import org.dao.TicketDAO;
import org.dao.TrainDAO;

public class TicketApplication {
	
	public static void main(String[] args) throws SQLException, IOException {
		
		Train train=new Train();
		Scanner sc=new Scanner(System.in);
		
	   // Populate table use for the first time 
		//TrainDAO traindao=new TrainDAO();
		//traindao.populateTrainTable();
		TrainDAO trainDAO = new TrainDAO();
		TicketDAO ticketDAO=new TicketDAO();
		
		System.out.println("Enter the Train Number: ");
		int trainNo = sc.nextInt();

		Optional<Train> trainOptional = trainDAO.findTrain(trainNo);

		if (trainOptional.isEmpty()) {

			System.out.println("Train Number Does Not Exist In The Data Base..");
			sc.close();
			return;

		}

		Train train1 = trainOptional.get();

		System.out.println("Enter Travel Date (dd/MM/YYY):");
		String travelDateStr = sc.next();

		Date travelDate = new Date();

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			travelDate = formatter.parse(travelDateStr);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid date format");
			sc.close();
			return;
		}
		/*if(travelDate.bef) {
			System.out.println("Travel Date is Before Current Date , Plase Choose Another Date !");
			sc.close();
		} */
		Ticket ticket = new Ticket(travelDate, train1);

		System.out.println("Enter Number of Passengers");
		int noOfPassengers = sc.nextInt();

		sc.nextLine();

		for (int i = 1; i <= noOfPassengers; i++) {

			System.out.println("Enter Passenger Name");
			String name = sc.nextLine();

			System.out.println("Enter Age");
			int age = sc.nextInt();

			System.out.println("Enter Gender(M/F)");
			String gender = sc.next();

			ticket.addPassenger(name, age, gender);
			sc.nextLine();


		}
		//ticket.generateTicket();
		ticket.writeTicket();
		ticketDAO.ticketSave(ticket);

		System.out.println("Ticket Booked with PNR : " + ticket.getPnr());
		//System.out.println("Ticket should be written to the file with filename " + ticket.getPnr() + ".txt");

		sc.close();
		

	}

}
