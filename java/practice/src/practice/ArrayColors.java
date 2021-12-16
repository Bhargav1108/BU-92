package practice;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrayColors {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<String> colors=new ArrayList<String>();
		
		colors.add("Green");
		colors.add("White");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Violet");
		colors.add("Lime");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Sky Blue");
		colors.add("Gray");
		colors.add("Merune");
		
		System.out.println(colors);
		
		System.out.println("------------------- Printing Elements Through Iteration ------------------------");
		
		for(String s:colors) {
			System.out.println(s);
		}
		
		System.out.println("---------------- Printing Elements along with indexes -----------------");
		
		for(int i=0;i<colors.size();i++) {
			System.out.println(i+":"+colors.get(i));
		}
		System.out.println("=======================================================================");
	    
		System.out.println("Adding the element at first posititon ");
		colors.add(0,"Black");
		System.out.println(colors);
		
		System.out.println("=======================================================================");
	
		System.out.println("Get the element from the 3rd position in the Arraylist ");
		
		System.out.println(colors.get(3));
		
		System.out.println("=======================================================================");
		
		System.out.println("Removing element from the Array list");
		System.out.println(colors.remove(3));
		System.out.println(colors);
		System.out.println("=======================================================================");
		
		System.out.println("Searching the V in a array list");
		//String b=sc.nextLine();
		//int a=colors.indexOf(b);
		// it returns true or false 
		//boolean c=colors.contains(b);
		//if(c) {
		//System.out.println(c); 
	//	System.out.println("Element Found in:"+a);
		//}
		//else {
		//	System.out.println("Element not found");
		//}
				
		System.out.println("=======================================================================");
		System.out.println("Sorting the array list");
		Collections.sort(colors);
		System.out.println(colors);
		System.out.println("=======================================================================");
		System.out.println("Copy Elements into another arraylist");
		List<String> clr= colors;
		for(int i=0;i<clr.size();i++) {
			System.out.println(i+":"+clr.get(i));
		}
		//System.out.println(clr);
		System.out.println("=======================================================================");
		System.out.println("Suffling the elements");
		Collections.shuffle(clr);
		for(int i=0;i<clr.size();i++) {
			System.out.println(i+":"+clr.get(i));
		}
		System.out.println("=======================================================================");
		System.out.println("Reverse The Elements in Array List");
	    Collections.reverse(clr);
	    System.out.println(clr);
	    
	    System.out.println("=======================================================================");
		System.out.println("Extract portion of elements");
		List<String> sub=colors.subList(3, 8);
		System.out.println(sub);
		
		System.out.println("=======================================================================");
		System.out.println("Comparing Two arraylsits");
		
		boolean com=colors.containsAll(clr);
		System.out.println(com);
		boolean com1=clr.equals(sub);
		System.out.println(com1);
		
		System.out.println("=======================================================================");
		System.out.println("Swapping the elements in arraylist");
		Collections.swap(sub,2,4);
		System.out.println(sub);
		System.out.println("=======================================================================");
		System.out.println("Join Two Arraylists");
		sub.addAll(clr);
		System.out.println(sub);
		System.out.println("=======================================================================");
		System.out.println("Clone the array list");
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(10);
		num.add(7);
		num.add(15);
		num.add(25);
		num.add(100);
		ArrayList<Integer> num1=new ArrayList<Integer>();
		num1=(ArrayList)num.clone();
		System.out.println(num1);
		System.out.println("=======================================================================");
		System.out.println("Removing all elements in arraylist");
		num.clear();
		System.out.println(num);
		System.out.println("=======================================================================");
		System.out.println("Checkig Whether the array list is empty or not ");
		boolean n=num.isEmpty();
		System.out.println(n);
		System.out.println("=======================================================================");
		System.out.println("Trim the array list");
		ArrayList<Double> f=new ArrayList<Double>(10);
		f.add(20.0);
		f.add(150.0);
		f.add(50.0);
		f.add(240.0);
		f.add(60.0);
		System.out.println(f);
		f.trimToSize();
		System.out.println("=======================================================================");
		System.out.println("To Increase the capacity");
		f.ensureCapacity(150);
		System.out.println("Array capacity change to 150");
		
	}
	

}
