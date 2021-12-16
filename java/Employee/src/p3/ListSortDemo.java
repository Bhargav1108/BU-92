package p3;
import java.util.*;

public class ListSortDemo {
	public static void main(String[] args) {
		
	
	
	Emp e1=new Emp(10,28,"Yash",28000.0);
	Emp e2=new Emp(11,20,"Anil",25000.0);
	Emp e3=new Emp(12,25,"Bhargav",24500.0);
	Emp e4=new Emp(13,18,"Rajesh",32000.0);
	
	List<Emp> em=new ArrayList<Emp>();
	
	em.add(e1);
	em.add(e2);
	em.add(e3);
	em.add(e4);
	
	// before sorting 
	System.out.println("Before Sorting the Array"); 
	System.out.println(em); 
	
	Collections.sort(em);
	
	System.out.println("--------------------------------- Sorting the ArrayList based on Age ------------------------------"); 
	
	System.out.println(em);
	
	System.out.println("--------------------------------- Sorting the ArrayList based on Name ------------------------------"); 
	
	Collections.sort(em,new NameComparator());
	
	System.out.println(em);
    
	System.out.println("--------------------------------- Sorting the ArrayList based on Salary ------------------------------"); 
	
	Collections.sort(em,new SalaryComparator());
	
	System.out.println(em);
	}	
}
