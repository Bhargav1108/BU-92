package collections;
import java.util.*;

public class collections {
	public static void main(String[] args) {
		
		Set s=new HashSet();
		
		System.out.println(s.size());
		
		s.add(20);
		s.add(2);
		s.add(30);
		s.add(44);
		s.add(20);
		s.add(3);
		s.add(2);
		s.add(5);
		
	/*	System.out.println(s);
		
		System.out.println(s.isEmpty());
		System.out.println(s.contains(5));
		System.out.println(s.remove(20));
		System.out.println(s); */
		
	// for printing elements through loops 
		
	System.out.println("******* First : way to print elements in a set **********");
	for(Object ele:s) {
		System.out.println(ele);
		
	}

	
	System.out.println("******* Second : way to print elements in a set **********");
	Object[] ele=s.toArray();
	for(int i=0;i<ele.length;i++) {
		System.out.println(ele[i]);
		
	}
	System.out.println("******* Third : way to print elements in a set **********");
	Iterator ie=s.iterator(); // by converting into iterator 
	while(ie.hasNext()) {
		System.out.println(ie.next());
		
	}
	System.out.println("******* Fourth : way to print elements in a set **********");
	
	// to convert into streams 
	
	s.stream().forEach(element->System.out.println(element));
	
	
	System.out.println("******* Fifth : way to print elements in a set **********");
	
	s.forEach((e)->{
		System.out.println(e);
	});
	
	System.out.println("******* Sixth : way to print elements in a set **********");
	s.forEach(System.out::println);
	
	System.out.println("******* Seventh : way to print elements in a set **********");
	// by simply converting to toString() 

    System.out.println(s.toString());
    
    System.out.println("******* Eight : way to print elements in a set **********");
    // by converting to vector 
    
    Enumeration en= new Vector(s).elements();
    while(en.hasMoreElements()) {
    	System.out.println(en.nextElement());
    }
	}
	
}
