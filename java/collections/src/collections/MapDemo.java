package collections;
import java.util.*;
public class MapDemo {
	
	public static void main(String[] args) {
		
		Map m=new HashMap(); // To create new hash map 
		
		System.out.println(m.size());// find out the size of a map
		
		System.out.println(m.isEmpty());// check whether the map is empty or not 
		
		// insert values into a map 
		// map is a key=value pair ds
		
		m.put("1","Python");
		m.put("2","Java8");
		m.put("3","C");
		m.put("4","C++");
		m.put("5","Php");
		m.put("6","JavaScript");
		m.put("7","MongoDB");
		m.put("8","MySql");
		m.put("9","NodeJs");
		m.put("10","SAP");
		
		System.out.println(m);
		System.out.println(m.size());
		
		System.out.println(m.get("8"));
		System.out.println(m.putIfAbsent("10","AngularJS"));
		
		System.out.println("****************************************************");
		m.forEach((k,v) -> System.out.println(k));
		
		System.out.println("****************************************************");
		System.out.println(m.values());
		
		System.out.println("****************************************************");
		Iterator i=m.values().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			} 
		
		System.out.println("**************** 1st : way to print the hash map ****************");
		m.forEach((k,v) -> System.out.println(k+":"+v)); // by iterating over the hashmap using lambda expression syntax ( (parameters) -> body) )
		
		System.out.println("**************** 2nd : way to print the hash map ****************");
		System.out.println(Arrays.asList(m));
	}

}
