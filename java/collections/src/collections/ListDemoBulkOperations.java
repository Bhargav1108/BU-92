package collections;
import java.util.*;

public class ListDemoBulkOperations {
	public static void main(String[] args) {
		
	    List s=new ArrayList();
		List s1=new ArrayList();
		
		s.add("Python");
		s.add("Django");
		s.add("TensorFlow");
		s.add("RestFul");
		s.add("Tkinter");
		s.add("Flask");
		s.add("Collections");
		s.add(2);
		s.add(5);
		
		System.out.println(s);
		
		
		s1.add("Java");
		s1.add("SpringBoot");
		s1.add("RestFul");
		s1.add("java");
		s1.add("Collections");
		s1.add("swing");
		s1.add("Mysql");
		s1.add(2);
		s1.add(5); 
		System.out.println(s1); // print the set1 values 
		
		System.out.println(s.size()); // print the size of the set 
		System.out.println(s.isEmpty()); // check whether the set is empty and return true or false 
	 //  adding all like union operation in maths 
		
		
		s.addAll(s1);    // it will add both the sets without duplicate values 
		System.out.println(s);
		
		
		s.containsAll(s1);     // it's print the values that contains after add
		System.out.println(s); 
		
		s.removeAll(s1); // it remove the same elements in both sets and print the first set reaminig elements
		System.out.println(s);
		
		s.retainAll(s1);       
		System.out.println(s);
		
		//  if we keep the conditon directly in print statement then it returns true or false 
		System.out.println(s.containsAll(s1));
		System.out.println(s.removeAll(s1));
		System.out.println(s.retainAll(s1)); 
		
		
	}



}
