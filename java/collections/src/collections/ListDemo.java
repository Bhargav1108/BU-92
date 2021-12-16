package collections;
import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		
		List a=new ArrayList();
		
		// System.out.println(a.size());
		
		a.add(20);
		a.add(2);
		a.add(30);
		a.add(44);
		a.add(20);
		a.add(3);
		a.add(2);
		a.add(5);
		
		/* System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(5));
		System.out.println(a.remove(2));
		System.out.println(a); */
		
		System.out.println("******* First : way to print elements in a set **********");
		for(Object ele:a) {
			System.out.println(ele);
			
		}

		
		System.out.println("******* Second : way to print elements in a set **********");
		Object[] ele=a.toArray();
		for(int i=0;i<ele.length;i++) {
			System.out.println(ele[i]);
			
		}
		System.out.println("******* Third : way to print elements in a set **********");
		Iterator ie=a.iterator(); // by converting into iterator 
		while(ie.hasNext()) {
			System.out.println(ie.next());
			
		}
		System.out.println("******* Fourth : way to print elements in a set **********");
		
		// to convert into streams 
		
		a.stream().forEach(element->System.out.println(element));
		
		
		System.out.println("******* Fifth : way to print elements in a set **********");
		a.forEach((e)->{
			System.out.println(e);
		});
		
		System.out.println("******* Sixth : way to print elements in a set **********");
		a.forEach(System.out::println);
		
		System.out.println("******* Seventh : way to print elements in a set **********");
		// by simply converting to toString() 

	    System.out.println(a.toString());
	    
	    System.out.println("******* Eight : way to print elements in a set **********");
	    // by converting to vector 
	    
	    Enumeration en= new Vector(a).elements();
	    while(en.hasMoreElements()) {
	    	System.out.println(en.nextElement());
	    }
	}



}
