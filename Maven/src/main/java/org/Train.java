package org;


public class Train {

	private int trainNo;    // declaring varibles 
	private String trainName;
	private String source;
	private String destination;
	private double tikectPrice;
	
	public Train() {
		
	}
	public Train(int trainNo, String trainName, String source, String destination, double tikectPrice) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.tikectPrice = tikectPrice;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;

	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	public String getTrainName() {
		return trainName;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTikectPrice() {
		return tikectPrice;
	}
	public void setTikectPrice(double tikectPrice) {
		this.tikectPrice = tikectPrice;
	}
	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", Source=" + source + ", Destination="
				+ destination + ", tikectPrice=" + tikectPrice + "]";
	}
	public void add(Train trains) {
		// TODO Auto-generated method stub
		
	}	
	
}
