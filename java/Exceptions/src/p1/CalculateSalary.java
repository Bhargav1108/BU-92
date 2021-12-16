package p1;

public class CalculateSalary {
	
	public static double cal(int base) throws customException {
		if(base<0) {
			 String msg="Are you Mad , Salary can't be ZERO or NEGATIVE";
			 throw new customException(msg);
		 }
		
		double total = 5 * base + 20;
		return total ;
		
	}
	 public static void main(String[] args) throws customException {
			
		 double salary=cal(-200);
		 
		 System.out.println(salary);
		 
	 }
	 
}
