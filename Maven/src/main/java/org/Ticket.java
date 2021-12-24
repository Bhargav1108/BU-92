package org;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.management.remote.SubjectDelegationPermission;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
import java.text.SimpleDateFormat;
import  org.Passenger;
public  class Ticket {
	
	public int counter;
	public String pnr;
	public Date travelDate;
	public Train train;
	private Map<Passenger,Integer> passengers;
	


	public Ticket(Date travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
		counter=100;
		passengers=new TreeMap();
	}
	
	
	private String generatePNR() {
		
		char ch1=train.getSource().charAt(0);
		char ch2=train.getDestination().charAt(0);
		
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			String travelDateStr = formatter.format(travelDate);

			this.pnr = ch1+ "" +ch2+ "_" + travelDateStr + "_" + counter;
			counter++;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid date format");

		}

		return this.pnr;
	}
	
	public double calcPassengerFare(Passenger passenger) {
		
		double price=train.getTikectPrice();
		
		double discount = 0;
		if(passenger.getAge() >= 60) {
			discount=(price * 40)/100;
		}
		else if(passenger.getAge() <= 12) {
			discount=(price * 50)/100;
		}
		else if(passenger.getGender().equals("F")) {
			discount=(price * 25)/100;
		}
		
		return (price - discount);
	}
	
	public void addPassenger(String Name,int age,String gender) {
		
		Passenger passenger=new Passenger(Name,age,gender);
		int fare=(int) calcPassengerFare(passenger);
		passengers.put(passenger, fare);
		
	}
	
	public double calcTotalTicketPrice() {
		
		double total=0;
		
		Collection<Integer> totalFare=passengers.values();
		for(int fare:totalFare) {
			total+=fare;
		}
		
		return total;
	}
	
	public StringBuilder generateTicket() {
		
		generatePNR();
		
		StringBuilder sb=new StringBuilder();	
		sb.append("PNR           :" + getPnr() + "\n")
		  .append("Train no      :" + train.getTrainNo() + "\n")
		  .append("Train Name    :" + train.getTrainName() + "\n")
		  .append("From          :" + train.getSource() + "\n")
		  .append("To            :" + train.getDestination() + "\n")
		  .append("Travel Date   :" + getTravelDate() + "\n\n")
		  .append("Passengers:\n\n")
		  .append("  Name       	        Age     	 	Gender      	        Fare \n\n");

		Set<Passenger> allPassengers = passengers.keySet();

		for (Passenger passenger : allPassengers) {
			sb.append(" "+passenger.getName() + "       		" + passenger.getAge() + "       		" + passenger.getGender() + "       		"+ passengers.get(passenger) + "       		\n\n");
		}

	sb.append("Total Price:" + calcTotalTicketPrice() + "");

	return sb;
			
	}
	public void writeTicket() {
		StringBuilder sb = generateTicket();

		String path = "C:\\Users\\bhargav_mandadi\\Desktop\\Tickets\\" + getPnr() + ".txt";

		File file = new File(path);

		try (FileWriter fw = new FileWriter(file);) {

			
			fw.write(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public String setPnr(String pnr) {
		this.pnr = pnr;
		return pnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Map<Passenger, Integer> getPassengers() {
		return passengers;
	}

	public void setPassengers(Map<Passenger, Integer> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Ticket [counter=" + counter + ", pnr=" + pnr + ", travelDate=" + travelDate + ", train=" + train
				+ ", passengers=" + passengers + "]";
		
		
	}
	public int compareTo(Passenger o) {
		return 0;
	}


	

}
