package p3;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		
		double sal1=e1.getSalary();
		double sal2=e2.getSalary();
		if(sal1>sal2) {
			return 1;
		}
		else if(sal1<sal2) {
			return -1;
		}
		else {
			return 0;
		}
	}	
}
