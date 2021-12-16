package p1;

public class customException extends Exception {
	
	public customException(String reason) {  // in userdefined exception we must take constructor 
		super(reason);
	}

}
