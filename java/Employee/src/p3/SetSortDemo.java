package p3;
import java.util.*;

public class SetSortDemo {
	public static void main(String[] args) {
		
	
	
	Emp e1=new Emp(10,28,"Yash",28000.0);
	Emp e2=new Emp(11,20,"Anil",25000.0);
	Emp e3=new Emp(12,25,"Bhargav",24500.0);
	Emp e4=new Emp(13,18,"Rajesh",32000.0);
	
	Set<Emp> em=new TreeSet<Emp>();
	
	em.add(e1);
	em.add(e2);
	em.add(e3);
	em.add(e4);
	
	// in set every values should be in sorting order , you need to use only treeset class in ur program 
	System.out.println("After Sorting the ArrayList"); 
	
	System.out.println(em);
	
	
	System.out.println(em);
	
	}	
}
