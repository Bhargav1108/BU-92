package practice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class WordFrequency {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> frequency=new HashMap<String,Integer>();
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=s.split(" ");
		// iterate all the words in a string 
		for(String word:st) {
			Integer count=frequency.get(word); 
	// it get each word and check the condition if null then it set the value to 0 otherwise it count the occurences
			if(count==null) {
				count=0;
			}
		frequency.put(word,count+1);
		}
		frequency.forEach((k,v )-> System.out.println(k+":"+v));
	}

}
