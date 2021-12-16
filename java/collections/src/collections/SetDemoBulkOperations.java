package collections;
import java.util.*;

public class SetDemoBulkOperations {
	public static void main(String[] args) {
		
		Set s=new HashSet();
		Set s1=new HashSet();
		
		s.add(20);
		s.add(2);
		s.add(30);
		s.add(44);
		s.add(20);
		s.add(3);
		s.add(2);
		s.add(5);
		
		
		
		s1.add(20);
		s1.add(35);
		s1.add(3);
		s1.add(4);
		s1.add(8);
		s1.add(22);
		s1.add(55);
		s1.add(20);
		
		System.out.println(s); // print the set values 
		System.out.println(s1); // print the set1 values 
		
		System.out.println(s.size()); // print the size of the set 
		System.out.println(s.isEmpty()); // check whether the set is empty and return true or false 
		System.out.println(s.addAll(s1)); //  adding all like union operation in maths 
		
		
		s.addAll(s1);    // it will add both the sets without duplicate values 
		System.out.println(s);
		
		
		s.containsAll(s1);     // it's print the values that contains after add
		System.out.println(s); 
		
		s.removeAll(s1); // it remove the same elements in both sets and print the first set reaminig elements
		System.out.println(s);
		
		s.retainAll(s1);       
		System.out.println(s);
		
		System.out.println(s.containsAll(s1));
		System.out.println(s.removeAll(s1));
		System.out.println(s.retainAll(s1));
		
		
	}



}
