package p3;
import java.util.*;
public class Listsort {
	
	public static void main(String[] args) {
		
		List<Integer> a=Arrays.asList(10,20,2,5,13,7,12,4,99,80);
		/* a.add(10);
		a.add(2);
		a.add(25);
		a.add(3);
		a.add(11);
		a.add(99);
		a.add(13); */
		Collections.sort(a);
		System.out.println(a);
	}

}
